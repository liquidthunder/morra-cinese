package morra_cinese;
import java.util.Random;

public class CPUPlayer implements MorraPlayer {
	private final Random random;
	
	public CPUPlayer(Random sceltaRandom) {
        this.random = sceltaRandom;
    }

    public String play() {
        return Scelte[this.random.nextInt(Scelte.length)];
    }
}
