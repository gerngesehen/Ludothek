package ch.gbssg.quartalsarbeit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpielTest {

	@Test
	void TestSpiel() {
		Spiel uno = new Spiel(4, "UNO", eKategorien.KINDERGARTEN, 32.50);
		assertEquals(uno.getLagerbestand(), 4);
		assertEquals(uno.getName(), "UNO");
		assertEquals(uno.getPreis(), 32.50);
		assertEquals(uno.getKategorie(), eKategorien.KINDERGARTEN);
	}

}
