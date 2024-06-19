package com.project.white_walker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategorieTest {

    @Test
    public void testCreationCategorie() {
        Categorie gardien = new Categorie("Gardien", 56, 110000);

        assertEquals("Gardien", gardien.getNom());
        assertEquals(56, gardien.getHeuresNormalesParSemaine());
        assertEquals(110000, gardien.getSalaireParSemaine());
    }

    @Test
    public void testTauxHoraire() {
        Categorie gardien = new Categorie("Gardien", 56, 110000);

        assertEquals(1964.2857, gardien.getTauxHoraire(), 0.0001);
    }
}
