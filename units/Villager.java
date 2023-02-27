package units;

import java.util.ArrayList;

/**Крестьянин*/
public class Villager extends Warrior {
  

    public Villager(String side, int x, int y) {
        super("Villager__", side, "Green", 1, 1, 1, 1, 1, 1, x, y, 1);
       
    }


    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() {return "Я Крестьянин: ";}


    /**Переопределить step крестьян так, чтобы он был если не Die, то Stand  */
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (!state.equals("Die")) state = "Stand";
    }
}
