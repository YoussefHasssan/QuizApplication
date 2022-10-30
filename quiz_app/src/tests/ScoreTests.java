package tests;

import static org.junit.jupiter.api.Assertions.*;

import c.Score;

public class ScoreTests {

    @org.junit.Test
    public void testCreation() {
        Score s1 = Score.getInstance();
        Score s2 = Score.getInstance();

        assertSame(s1, s2);
    }

    @org.junit.Test
    public void testUsr() {
        Score s1 = Score.getInstance();
        String expected = "Alan Turing";
        s1.setUsr(expected);

        assertSame(s1.getUsr(), expected);
    }

    @org.junit.Test
    public void testTotalQuestions() {
        Score s1 = Score.getInstance();
        int expected = 9998;
        s1.setQuestions_total(expected);

        assertEquals(s1.getQuestions_total(), expected);
    }

}
