package de.neuefische.challenge;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.List;

@Value
@Builder
@AllArgsConstructor
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}
