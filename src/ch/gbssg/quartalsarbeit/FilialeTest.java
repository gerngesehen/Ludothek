package ch.gbssg.quartalsarbeit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilialeTest {

	@Test
	void TestFiliale() {
		Filialleiter Hans = new Filialleiter(1, "Hans", "Lingg", "04.28.1992","Musterstrasse 1","0798909876","hans.lingg@gbssg.ch", eGender.MALE, false, false);
		Filiale Oberriet = new Filiale(1, "Oberriet", "Staatsstrasse 12", Hans);
		
		assertEquals(Oberriet.getName(), "Oberriet");
		assertEquals(Oberriet.getAdresse(), "Staatsstrasse 12");
	}
	
	void TestAddMitarbeiter() {
		Filialleiter Kurt = new Filialleiter(1, "Kurt", "Lingg", "04.28.1992","Musterstrasse 1","0798909876","Kurt.lingg@gbssg.ch", eGender.MALE, false, false);
		Filiale Oberriet = new Filiale(1, "Oberriet", "Staatsstrasse 12", Kurt);
		Mitarbeiter Peter = new Mitarbeiter(1, "Peter", "Hallauer", "07.08.1988", "Rietliweg 4", "0792777048", "peter.hallauer@gbssg.ch", eGender.MALE);
		
		boolean output = Oberriet.addMitarbeiter(Peter);
		assertEquals(output, true);
		
		output = Oberriet.addMitarbeiter(Peter);
		assertEquals(output, false);
	}

}
