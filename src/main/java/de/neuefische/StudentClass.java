package de.neuefische;

import lombok.*;

import java.util.Objects;

@Data //Getter, Setter, Equals&Hashcode, toString
@AllArgsConstructor
@NoArgsConstructor
@Builder //Optional -> Ermöglicht Builder Pattern!
public class StudentClass {

    private String name;
    private String id;
    private int age;

    public void hasBirthday(){
        age++;
    }

}
