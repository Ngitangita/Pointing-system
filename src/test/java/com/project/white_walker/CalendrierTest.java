package com.project.white_walker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class CalendrierTest {

    @Test
    public void testJoursFeries() {
        Calendrier calendrier = new Calendrier();

        assertTrue(calendrier.estJourFerie(LocalDate.of(2024, 6, 17)));
        assertTrue(calendrier.estJourFerie(LocalDate.of(2024, 6, 25)));
        assertTrue(calendrier.estJourFerie(LocalDate.of(2024, 6, 26)));
        assertFalse(calendrier.estJourFerie(LocalDate.of(2024, 6, 27)));
    }
}
