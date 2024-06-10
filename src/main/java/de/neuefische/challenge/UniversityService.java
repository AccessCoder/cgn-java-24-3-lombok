package de.neuefische.challenge;

import java.util.List;

public class UniversityService {
    public double calculateAverageCourseGrade(Course course) {
        return course.getStudents().stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0);

    }

    public double calculateAverageUniversityGrade(University university) {
        List<Student> allStudents = university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .toList();

        return allStudents.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0);


    }

    public List<Student> findGoodStudents(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() >= 2.0)
                .toList();
    }
}
