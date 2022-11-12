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
    public void testTotalQuestions() {
        Score s1 = Score.getInstance();
        int expected = 9998;
        s1.setTotal(expected);

        assertEquals(s1.getTotal(), expected);
    }

}
