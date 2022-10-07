package unit_tests;

import static org.junit.jupiter.api.Assertions.*;

import components.Score;

public class ScoreTests {

    @org.junit.Test
    void testCreation() {
        Score s1 = Score.getInstance();
        Score s2 = Score.getInstance();

        assertTrue(s1 == s2);
    }

    @org.junit.Test
    void testUsr() {
        Score s1 = Score.getInstance();
        String expected = "Alan Turing";
        s1.setUsr(expected);

        assertTrue(s1.getUsr() == expected);
    }

    @org.junit.Test
    void testTotalQuestions() {
        Score s1 = Score.getInstance();
        int expected = 9998;
        s1.setQuestions_total(expected);

        assertTrue(s1.getQuestions_total() == expected);
    }
    
}
