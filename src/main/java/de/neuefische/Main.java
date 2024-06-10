package de.neuefische;

public class Main {

    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass(null, "x", 5);

        StudentRecord studentRecord = new StudentRecord("x", "x", 5);

        studentRecord = studentRecord.withAge(6);
        System.out.println(studentRecord);


    }
}