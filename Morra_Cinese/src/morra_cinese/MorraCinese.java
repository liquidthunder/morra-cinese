package morra_cinese;

import java.util.Scanner;

public class MorraCinese {
	
    public static void main(String[] args) {
    	int times = 0;
    	int scelta = 0;
        Scanner inputScelta = new Scanner(System.in);
        MorraGame partita = new MorraGame();
        System.out.println("###### MORRA CINESE ######");
        System.out.println("Puoi decidere di disputare una o più partite (dispari) contro la CPU o di vedere il risultato della sfida tra due CPU.");
        System.out.println("Quante partite vuoi eseguire?\nScelta: ");
        times = inputScelta.nextInt();
	    if (!((times%2) == 0)) {
	        for ( ; times > 0; times--) {
	        	System.out.println("##### NUOVA PARTITA #####");
		        System.out.println("Inserisci il numero corrispondente alla modalità desiderata.");
		        System.out.println("1. Gioca contro la CPU.");
		        System.out.println("2. CPU vs CPU.");
		        System.out.println("Scelta: ");
		        scelta = inputScelta.nextInt();
		        if (scelta == 1) {
		        	partita.HumanvsCPU();
		        } else {
		        	partita.CPUvsCPU();
		        }
	        }
	    } else {
	    	System.out.println("Il numero delle partite DEVE essere dispari. Uscita");
	    }
    }
}
