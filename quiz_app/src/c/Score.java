package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Score {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:/Users/sin/test"; //

    static final String USER = "sa";
    static final String PASS = "Password123";

    private static Connection conn = null;
    private static Statement stmt = null;

    private Score() { }
    private int correct = 0;
    private int incorrect = 0;
    private int total = 0;


    private static Score INSTANCE = null;

    public static Score getInstance()
    {
        if (null == INSTANCE) {
            INSTANCE = new Score();
        }
        return INSTANCE;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getCorrect() {
        return this.correct;
    }

    public void setIncorrect(int incorrect) {
        this.incorrect = incorrect;
    }

    public int getIncorrect() {
        return this.incorrect;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return this.total;
    }

    private static void connectToH2() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (Exception e) {
            System.err.println("Error connecting to database...");
        }
    }

    private static void disconnectFromH2() {
        try {
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("Error disconnecting from database");
        }
    }

    private static void insertIntoH2(int id, int total, int correct, int wrong) {
        try {
            stmt = conn.createStatement();
            String sql = "INSERT INTO score " +
                    "(total, correct, wrong) " +
                    "VALUES (" +
                        total +
                        "," +
                        correct +
                        "," +
                        wrong +
                        " " +
                        "); ";
            System.out.println("SQL: " + sql.toString());

                stmt.executeUpdate(sql);
                stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error inserting");
        }
    }

    public static void main(String[] args) {
        try {
            connectToH2();

            int id = 0;

            int total = 90;
            int correct = 10;
            int incorrect = 0;

            insertIntoH2(id, total, correct, incorrect);
            id += 1;

            disconnectFromH2();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}