package com.project.white_walker;

import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Pointage {
    private Employe employe;
    private Calendrier calendrier;

    public Pointage(Employe employe, Calendrier calendrier) {
        this.employe = employe;
        this.calendrier = calendrier;
    }

}

