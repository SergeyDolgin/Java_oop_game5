package units;

import java.util.ArrayList;

/**Монах*/
public class Monk extends Priest {

    public Monk(String side, int x, int y){
        super("Monk______", side, "Polit", 30, 12, 5, -4, -4, 7, x, y, 1);
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Монах: ";}

    /**Переопределить step монаха так, чтобы он если он не Die, то он ищет среди своих подстреленного и лечит его  */
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die")) return;
        for (BaseHero baseHero : team1) {
            if(baseHero.health < baseHero.maxHealth) {
                baseHero.getDamage(maxDamage);;
            }
        }
    }

}