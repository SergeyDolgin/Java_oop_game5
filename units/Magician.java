package units;

import java.util.ArrayList;

/**Колдун*/
public class Magician extends Priest {

    public Magician(String side, int x, int y){
        super("Magician__", side, "Harry", 30, 17, 9, -5, -5, 12, x, y, 1); 
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Колдун: ";}

    /**Переопределить step колдуна так, чтобы он если он не Die, то он ищет среди своих подстреленного и лечит его  */
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