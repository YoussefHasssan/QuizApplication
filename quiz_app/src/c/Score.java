package c;

public class Score {

    private String usr;
    private int questions_total;
    private int questions_answers;
    private int questions_correct;

    Score(int score) {
        questions_correct = score;
    }

    private static Score single_instance = null;

    public static Score getInstance()
    {
        if (single_instance == null)
            single_instance = new Score(0);

        return single_instance;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getUsr() {
        return usr;
    }

    public void setQuestions_total(int total) {
        questions_total = total;
    }

    public int getQuestions_total() {
        return questions_total;
    }

    public void setQuestions_answered(int answered) {
        questions_answers = answered;
    }

    public int getQuestions_answered() {
        return questions_answers;
    }

    public void setQuestions_correct(int correct) {
        questions_correct = correct;
    }

    public int getQuestions_correct() {
        return questions_correct;
    }

}