package ch.gbssg.quartalsarbeit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KundeTest {

	@Test
	void TestKunde() {
		Kunde Fritz = new Kunde(1, "Fritz", "Leonard", "07.08.1996", "Schwammstrasse 5", "0792787048", "fritz.leonard@gbssg.ch", eGender.MALE, false);
		assertEquals(Fritz.getVorname(), "Fritz");
		assertEquals(Fritz.getNachname(), "Leonard");
		assertEquals(Fritz.getGeburtsdatum(), "07.08.1996");
		assertEquals(Fritz.getVorname(), "Fritz");
		assertEquals(Fritz.getVorname(), "Fritz");
		assertEquals(Fritz.getVorname(), "Fritz");
	}
	
	void TestAusleihen() {
		Spiel bierpong = new Spiel(4, "Bierpong", eKategorien.OBERSTUFE, 32.50);
		Kunde Kevin = new Kunde(1, "Kevin", "Leonard", "07.08.1996", "Schwammstrasse 5", "0792787048", "Kevin.leonard@gbssg.ch", eGender.MALE, false);
		boolean output = Kevin.Ausleihen(bierpong);
		assertEquals(output, true);
		
		// Output sollte false sein wenn der Lagerbestand des Spiels 0 ist
		bierpong.setLagerbestand(0);
		output = Kevin.Ausleihen(bierpong);
		assertEquals(output, false);
		
		// Output sollte false sein wenn der Kunde schon mehr als 3 spiele ausgelehnt hat
		Kevin.Ausleihen(bierpong);
		Kevin.Ausleihen(bierpong);
		Kevin.Ausleihen(bierpong);
		output = Kevin.Ausleihen(bierpong);
		assertEquals(output, false);
	}

}
