package de.neuefische;

public class Main {

    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass();

        StudentRecord studentRecord = new StudentRecord("x", "x", 5);

        studentRecord = studentRecord.withAge(6);
        System.out.println(studentRecord);

        StudentClass builderStudent = StudentClass.builder()
                .id()
                .name()
                .age()
                .build();
    }
}