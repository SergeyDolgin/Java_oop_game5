package units;

public class Priest extends BaseHero {
    protected int mana;

    public Priest(String hero, String side, String name, int health, int attack, int speed, int maxDamage, int minDamage, int protection, int x, int y, int mana) {
        super(hero, side, name, health, attack, speed, maxDamage, minDamage, protection, x, y);
        this.mana = mana;
    }

    public String getInfo() {
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
}