package com.project.white_walker;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Calendrier {
    private Set<LocalDate> joursFeries;

    public Calendrier() {
        joursFeries = new HashSet<>();
        joursFeries.add(LocalDate.of(2024, 6, 17));
        joursFeries.add(LocalDate.of(2024, 6, 25));
        joursFeries.add(LocalDate.of(2024, 6, 26));
    }

    public boolean estJourFerie(LocalDate date) {
        return joursFeries.contains(date);
    }
}

