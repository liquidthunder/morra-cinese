package morra_cinese;

import java.util.Random;
import java.util.Scanner;

public class MorraGame {
	private int result;
	
	
	public MorraGame() {
		this.result = 0;
	}
	
	/*
	 * 	Metodo per la stampa dei risultati.
	 *  In base alla modalità scelta stamperà informazioni differenti.
	 * 	true per HumanVSCPU, false per CPUvsCPU
	 */
	private void serveResult(int result, boolean mod) {
		if (mod) {
			switch (result) {
			case 1:
				System.out.println("Hai perso! Vince la CPU.\n");
				break;
			case 2:
				System.out.println("Hai vinto! Complimenti!\n");
				break;
			case 3:
				System.out.println("Hai pareggiato!");
				break;
			}
		} else {
			switch (result) {
			case 1:
				System.out.println("Vince la CPU2.\n");
				break;
			case 2:
				System.out.println("Vince la CPU1.\n");
				break;
			case 3:
				System.out.println("Le CPU hanno pareggiato!");
				break;
			}
		}
	}
	
	
	/*
	 *	Metodo per determinare chi vince. 
	 */
	private int whoWins(String scelta1, String scelta2) {
		if (scelta1.equals(scelta2)) {
			return 3;		//Ritorna 3 per il pareggio
		} else if ( ("Sasso".equals(scelta1) && "Forbice".equals(scelta2)) ||
					("Carta".equals(scelta1) && "Sasso".equals(scelta2)) ||
					("Forbice".equals(scelta1) && "Carta".equals(scelta2))) {
			return 2;		//Ritorna 2 se vince il Giocatore 1
		} else {
			return 1;		//Ritorna 1 se vince il Giocatore 2
		}
	}
	
	/*
	 *	Metodo per svolgere la partita Human vs CPU.
	 */
	public void HumanvsCPU() {
		Scanner InputSceltaHuman = new Scanner(System.in);
		MorraPlayer CPU = new CPUPlayer(new Random());
        MorraPlayer Human = new HumanPlayer(InputSceltaHuman);
		String SceltaCPU = CPU.play();
		String SceltaHuman = Human.play();
		
		System.out.printf("Hai scelto %s!\n", SceltaHuman);
		System.out.printf("La CPU ha scelto %s!\n", SceltaCPU);
		result = whoWins(SceltaHuman, SceltaCPU);
		serveResult(result, true);
	}
	
	/*
	 *	Metodo per svolgere la partita CPU vs CPU
	 */
	public void CPUvsCPU() {
		MorraPlayer CPU1 = new CPUPlayer(new Random());
		MorraPlayer CPU2 = new CPUPlayer(new Random());
		String SceltaCPU1 = CPU1.play();
		String SceltaCPU2 = CPU2.play();
		
		System.out.printf("La CPU1 ha scelto %s!\n", SceltaCPU1);
		System.out.printf("La CPU2 ha scelto %s!\n", SceltaCPU2);
		
		result = whoWins(SceltaCPU1, SceltaCPU2);
		serveResult(result, false);
	}
}
