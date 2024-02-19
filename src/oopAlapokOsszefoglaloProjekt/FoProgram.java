package oopAlapokOsszefoglaloProjekt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoProgram {

	public static void main(String[] args) throws IOException {

		Allat[] allatok = new Allat[10];
		int aktivElemszam = 0;
		Adatbevitel adatObj = new Adatbevitel();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String menupont;

		do {				
			
			System.out.println("1. menhelyre torteno felvetel");
			System.out.println("2. menhely allatainak kilistazasa");
			System.out.println("3. menhely felszabaditasa");
			System.out.println("4. kilepes");
			
			menupont = br.readLine();
			switch (menupont) {
			case "1":
				if (aktivElemszam < allatok.length) {
					// kulon osztaly valositja meg
					allatok[aktivElemszam] = adatObj.adatBekeres(br);
					aktivElemszam++;
				} else {
					System.err.println("A menhely megtelt!");
				}
				break;
			case "2":
				if (aktivElemszam > 0) {
					System.out.println("Az allatmenhely jelenlegi lakoi: ");
					for (int i=0; i<aktivElemszam;i++) {
						System.out.print(allatok[i].toString());
						System.out.printf(" napi eteladag: %.2f kg %n", allatok[i].napiEtelAdag());
					}
				} else {
					System.err.println("A menhely ures, nem lehet listat kesziteni!");
				}
				break;
			case "3":
				if (aktivElemszam > 0) {
					System.out.println(allatok[0].getNev() + " tavozik a menhelyrol");
					for (int i = 1; i <= aktivElemszam - 1; i++) {
						allatok[i - 1] = allatok[i];
					}
					allatok[aktivElemszam - 1] = null;
					aktivElemszam--;

				} else {
					System.err.println("A menhely ures, nem lehet helyet felszabaditani!");
				}
				break;
			}

		} while (!menupont.equals("4"));

		br.close();
	}

}
