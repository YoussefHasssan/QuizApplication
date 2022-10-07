package unit_tests;

import static org.junit.jupiter.api.Assertions.*;

import components.Questions;

public class QuestionTests {

    @org.junit.Test
    void testCreation() {
        Questions q1 = Questions.getInstance();
        Questions q2 = Questions.getInstance();

        assertTrue(q1 == q2);
    }

    @org.junit.Test
    void testQuestion() {
        Questions q1 = Questions.getInstance();
        String question = "How many digits are in pi?";
        String answer = "infinite";
        String a = "3";
        String c = "2";
        String d = "0";
        q1.setQuestion(question);
        q1.setA(a);
        q1.setB(answer);
        q1.setC(c);
        q1.setD(d);

        assertTrue(q1.getB() == answer);
    }

    @org.junit.Test
    void testWrongAnswer() {
        Questions q1 = Questions.getInstance();
        String question = "Which of these artists is a rapper?";
        String a = "Taylor Swift";
        String b = "Kendrick Lamar";
        String c = "Adele";
        String d = "Ed Sheeran";
        q1.setQuestion(question);
        q1.setA(a);
        q1.setB(b);
        q1.setC(c);
        q1.setD(d);
        assertTrue(q1.getA() != b);
    }
    
}