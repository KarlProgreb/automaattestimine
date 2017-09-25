package testimine;

import static org.junit.Assert.*;

import org.junit.Test;

public class IlmaTestid {
	
	@Test
	public void testHetkeTemperatuur() {
		Uus testKlass = new Uus();
		assertEquals(20, testKlass.HetkeTemperatuur());
	}

	@Test
	public void testTemperatuurRealistlik() {
		int Temperatuur = hetkeTemperatuur();
		int high = 60;
		int low = -90;
		assertFalse("Viga! Temperatuur on liiga kõrge", high > Temperatuur);
		assertFalse("Viga! Temperatuur on liiga madal", low < Temperatuur);
	}
	
	@Test
	public void testAndmedKolmeksEnnustuseks() {
		int EnnustusteHulk = mituEnnustust();
		int korrektnePäevadeArv = 3;
		assertFalse("Viga! Ennustusi peab olema 3", EnnustusteHulk != korrektnePäevadeArv);
	}
	
	@Test
	public void testEnnustusteSagedusÕige() {
		int EnnustusteSagedus = millalUuendub();
		int korrektneTundideArv = 3;
		assertFalse("Viga! Ennustused peavad ilmuma iga kolme tunni tagant", EnnustusteSagedus != korrektneTundideArv);
	}
	
	@Test
	public void testTemperatuurMadalaimJaKõrgeim() {
		int temp1 = 10;
		int temp2 = 15;
		int temp3 = 17;
		int temp4 = 19;
		int temp5 = 22;
		int kõrgeimTemp = temp2;
		int madalaimTemp = temp1;
		assertFalse("Viga! Antud temperatuur pole päeva kõrgeim", temp1 > kõrgeimTemp, temp3 > kõrgeimTemp, temp4 > kõrgeimTemp, temp5 > kõrgeimTemp);
		assertFalse("Viga! Antud temperatuur pole päeva madalaim", temp2 < madalaimTemp, temp3 > madalaimTemp, temp4 > madalaimTemp, temp5 > madalaimTemp);
	}
}
