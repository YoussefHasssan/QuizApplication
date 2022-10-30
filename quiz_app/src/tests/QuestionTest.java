package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuestionTest {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:/Users/sin/test";

    static final String USER = "sa";
    static final String PASS = "Password123";


    @org.junit.Test
    public void test() {
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
                    "(question, a, b, c, d) " +
                    "VALUES ('Who is known for their paintings of strange clocks?', 'Dali', 'Kahlo', 'Monet', 'Picasso'); ";
            stmt.executeUpdate(sql);
            /* */

            // STEP 2: Select the test row

            stmt = conn.createStatement();
            sql =  "SELECT * FROM questions WHERE question='Who is known for their paintings of stange clocks?' ;";
            ResultSet ns = stmt.executeQuery(sql);
            while (ns.next()) {
                String actualString = ns.getString("A");
                assertTrue("Dali".equals(actualString));
            }

            //STEP 3: Remove the test row
            sql = "DELETE FROM questions WHERE question='Who is known for their paintings of stange clocks?' ;";
            stmt.execute(sql);

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
