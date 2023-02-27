package units;

import java.util.ArrayList;

public interface Interface {

    void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);
    
    String getInfo();
    
}
