package lotr;
import java.util.Random;

public class Knight extends Character {
    private Random random;

    public Knight() {
        super(generateRandomPower(), generateRandomHp()); 
        this.random = new Random();
    }

    private static int generateRandomPower() {
        return 2 + new Random().nextInt(11); 
    }

    private static int generateRandomHp() {
        return 2 + new Random().nextInt(11); 
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.power) + 1; 
        c.hp -= damage;
        if (c.hp < 0) {
            c.hp = 0;
        }
    }
}
