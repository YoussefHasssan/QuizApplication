package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadCSVInsertIntoH2Test {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    static final String USER = "sa";
    static final String PASS = "";


    @Test
    public void TestInsert() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 0: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 0: Open a connection
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            /* */
            //STEP 1: Insert a test row in the score table

            stmt = conn.createStatement();
            String sql =  "INSERT INTO  questions " +
                    "(question, answer) " +
                    "VALUES ('This is a test question', 'This is a test answer'); ";
            stmt.executeUpdate(sql);
            /* */

            // STEP 2: Select the rest row

            stmt = conn.createStatement();
            sql =  "SELECT * FROM questions WHERE question='This is a test question' ;";
            ResultSet rs = stmt.executeQuery(sql);
            String actualString = rs.getString("answer");
            System.out.println(actualString);
            assertTrue("This is a test answer" == actualString);

            //STEP 3: Remove the test row
            sql = "DELETE FROM questions WHERE question='This is a test question' ;";
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();
        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
    }

}