package de.neuefische;

import lombok.With;

@With
public record StudentRecord(String name, String id, int age) {
}
