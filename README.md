# QuizApplication
CSE 2102 Group 2 Quiz App

How to conduct Unit Tests for Quiz App

Note: Must have Junit installed to run tests on a text editor such as Visual Studio Code or Eclipse (Mac terminal not recommended)


```bash 
git clone https://github.com/taamir-khan/QuizApplication
  ```

```bash
cd QuizApp/src/unit_tests && javac Test.java
```

Alternatively, go to your IDE, open this application, and then press run under QuizApp/src/unit_tests/Test.java as there is an issue compiling using the terminal.

Lab 2

You can clone as shown above, or if you created a branch then you can pull the changes:
```bash
git pull
```
There are too many files in a node module, so ```bash app.js ``` is the only file added, I suggest you create your own react file and then copy app.js into it.

Here is how to test get requests from the REST server:
```bash
cd cors-proxy
python3 server.py
```

Then go to your react file with the updated app.js:
```bash
npm start
```

You should now be able to get the question by pressing the button.

