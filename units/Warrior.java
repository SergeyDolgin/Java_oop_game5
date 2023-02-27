package units;

public class Warrior extends BaseHero {
    int delivery;

    public Warrior(String hero, String side, String name, int health, int attack, int speed, int maxDamage, int minDamage,int protection, int x, int y, int delivery) {
        super(hero, side, name, health, attack, speed, maxDamage, minDamage, protection, x, y);
        this.delivery = delivery;
    }

    // public Shooter(String hero, String name, int health, int speed, int maxDamage, int minDamage, int attack, int protection, int shoot) {
    //     super(hero, name, health, speed, maxDamage, minDamage, attack, protection);
    //     this.shoot = shoot;

    // }

    // public Priest(String hero, String name, int health, int attack, int speed, int maxDamage, int minDamage, int mana, int protection) {
    //     super(hero, name, health, attack, speed, maxDamage, minDamage, protection);
    //     this.mana = mana;
    // }

    public String getInfo() {
        return String.format("%s delivery: %d", super.getInfo(), this.delivery); 
    }
}
