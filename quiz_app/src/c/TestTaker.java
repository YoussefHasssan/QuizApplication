package c;

public class TestTaker {

    private TestTaker() {
    }

    private static TestTaker single_instance = null;

    public static TestTaker getInstance()
    {
        if(single_instance == null)
            single_instance = new TestTaker();

        return single_instance;
    }
}