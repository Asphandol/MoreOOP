package lotr;
public class Character {
    protected int hp;
    protected int power;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c) {
        c.hp -= this.power;
        if (c.hp < 0) {
            c.hp = 0;
        }
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
