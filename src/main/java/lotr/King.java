package lotr;
import java.util.Random;

public class King extends Character {
    private Random random;

    public King() {
        super(generateRandomPower(), generateRandomHp()); // Random power and HP from 5 to 15
        this.random = new Random();
    }

    private static int generateRandomPower() {
        return 5 + new Random().nextInt(11); // Random power between 5 and 15
    }

    private static int generateRandomHp() {
        return 5 + new Random().nextInt(11); // Random HP between 5 and 15
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.power) + 1; // Random damage from 1 to power
        c.hp -= damage;
        if (c.hp < 0) {
            c.hp = 0;
        }
    }
}
