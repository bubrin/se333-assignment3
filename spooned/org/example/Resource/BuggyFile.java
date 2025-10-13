package org.example.Resource;
public class BuggyFile {
    public void method0() {
    }

    public void method1_1() {
        int x = 3;
        try {
            x = x + 1;
        } catch (java.lang.Exception e) {
        }
    }

    public void method2() {
        java.lang.String str = null;
        java.lang.System.out.println(str.length());
    }

    public void method3() {
        if (true) {
        }
        int x = 4;
        if (x < 3) {
            x = x + 1;
        }
    }

    private java.lang.String getStringFromDatabase(boolean valid) {
        if (valid) {
            return "Valid String";
        } else {
            return null;
        }
    }

    public void method4() {
        java.lang.String text;
        java.lang.String data = getStringFromDatabase(false);
    }

    public void method5() {
        java.lang.String s1 = "test";
        java.lang.String s2 = "test";
        boolean equal = s1 == s2;
    }

    public void method6_1() {
        try {
            java.io.FileReader fileReader = new java.io.FileReader("file.txt");
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void method6_2() {
        java.io.FileReader fileReader = null;
        try {
            fileReader = new java.io.FileReader("file.txt");
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void method7_1() {
        int x = 10;
        x = x / 0;
    }

    public void method7_2() {
        int x = 10;
        int y = 0;
        x = x / y;
    }

    public void method7_3() {
        int numerator = 10;
        int denominator = 0;
        if (denominator != 0) {
            java.lang.System.out.println(numerator / denominator);
        } else {
            java.lang.System.out.println("Cannot divide by zero.");
        }
    }

    public void method8() {
        int age = 19;
        if (age >= 6)
            java.lang.System.out.println("condition 1");
        else if (age >= 18) {
            java.lang.System.out.println("condition 1");
        }
    }
}
