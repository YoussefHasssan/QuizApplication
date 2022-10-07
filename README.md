# QuizApplication
CSE 2102 Group 2 Quiz App

How to conduct Unit Tests for Quiz App

1. Enter unit_test package
2. Go to Test.java
3. change "Result result = JUnitCore.runClasses(testclass.class)" so that you replace "testclass.class" with the name of the class you want to test located in the unit_test folder (e.g. "TestQuestionsTable.class")
4. Run the Test.java file 
5. If "true" is returned, then all testcases in the selected class have passed
6. else if "false" is returned, then the testcases in the selected class have not passed
