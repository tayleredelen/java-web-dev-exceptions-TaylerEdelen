package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

//        System.out.println(Divide(5,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.ts"); //changed to ts to test 0 point return
        studentFiles.put("Brad", ""); //throws error "You must submit a file"
        studentFiles.put("Elizabeth", "MyCode.java"); //1 point return
        studentFiles.put("Stefanie", "CoolProgram.java"); //1 point return

        // Test out your CheckFileExtension() function!

        for (String student : studentFiles.keySet()) {
            int points = CheckFileExtension(studentFiles.get(student));
            System.out.println(student + ": " + points + " points");
        }

    }

    //If y is zero, you should throw an exception.
    public static int Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return (x / y);
    }

//    If a student’s submitted file ends in .java, they get 1 point.
//    If a student’s submitted file doesn’t end in .java, they get 0 points.
//    If the file submitted is null or an empty string,
//    an exception should be thrown and you should give the student -1 points.
    public static int CheckFileExtension(String fileName) {
        int numPoints = 0;
        if (fileName.contains(".java")) {
            numPoints += 1;
        }
                if (fileName == null || fileName == ""){
                    try {
                        throw new Exception("You must submit a file.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    numPoints -= 1;
            }
        return numPoints;
    }



}

