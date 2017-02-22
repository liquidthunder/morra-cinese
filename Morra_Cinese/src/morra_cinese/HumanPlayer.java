package morra_cinese;
import java.util.Scanner;

public class HumanPlayer implements MorraPlayer {
	private Scanner scanner;

    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    public String play() {
        System.out.println("Scegli 1, 2, o 3 per Sasso, Carta o Forbici.\nInput: ");
        int scelta = this.scanner.nextInt();
        return Scelte[scelta - 1];
    }
}
