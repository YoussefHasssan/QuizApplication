package components;

public class Questions {

    private Questions() {
    }
    
    private static Questions single_instance = null;

    public static Questions getInstance()
    {
        if (single_instance == null)
        single_instance = new Questions();

        return single_instance;
    }

    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    
    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
    public void setB(String b) {
        this.b = b;
    }

    public String getB() {
        return b;
    }
    public void setC(String c) {
        this.c = c;
    }

    public String getC() {
        return c;
    }
    public void setD(String d) {
        this.d = d;
    }

    public String getD() {
        return d;
    }
}
