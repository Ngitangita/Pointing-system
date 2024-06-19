package com.project.white_walker;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeTest {

    @Test
    public void testCreationEmploye() {
        Categorie gardien = new Categorie("Gardien", 56, 110000);
        Employe employe = new Employe("Rakoto", "Jean", "001", LocalDate.of(1980, 1, 1), LocalDate.of(2020, 1, 1), null, 110000, gardien);

        assertEquals("Rakoto", employe.getNom());
        assertEquals("Jean", employe.getPrenom());
        assertEquals("001", employe.getNumeroMatricule());
        assertEquals(LocalDate.of(1980, 1, 1), employe.getDateNaissance());
        assertEquals(110000, employe.getSalaireBrut());
        assertEquals(88000, employe.getSalaireNet());
    }

    @Test
    public void testSetterSalaireBrut() {
        Categorie gardien = new Categorie("Gardien", 56, 110000);
        Employe employe = new Employe("Rakoto", "Jean", "001", LocalDate.of(1980, 1, 1), LocalDate.of(2020, 1, 1), null, 110000, gardien);
        employe.setSalaireBrut(120000);

        assertEquals(120000, employe.getSalaireBrut());
        assertEquals(96000, employe.getSalaireNet());
    }
}
