package de.neuefische.challenge;

import lombok.Builder;

@Builder
public record Teacher( String id,
                       String name,
                       String subject) {
}
