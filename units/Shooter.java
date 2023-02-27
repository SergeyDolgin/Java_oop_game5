package units;

import java.util.ArrayList;

public class Shooter extends BaseHero{
    int shoot;
    
        public Shooter(String hero, String side, String name, int health, int attack, int speed, int maxDamage, int minDamage,int protection, int shoot, int x, int y) {
            super(hero, side, name, health, attack, speed, maxDamage, minDamage, protection, x, y);
            this.shoot = shoot;
    
        }
        
        public String getInfo() {
            return String.format("%s Ammunition: %d Gun: %s Markmanship: %d", 
            super.getInfo());       
        }

        @Override
        public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
            if (state.equals("Die") || shoot == 0) return;
            BaseHero victim = team2.get(findNearest(team2));
            float damage = (victim.protection - attack) > 0 ? minDamage : (victim.protection - attack) < 0 ? maxDamage: (minDamage+maxDamage)/2;
            victim.getDamage(damage);
            for (BaseHero baseHero : team1) {
                if (baseHero.getInfo().toString().split(":")[0].equals("Крестьянин")) {
                    baseHero.state = "Busy";
                    return;
                }
            }
            shoot--;
        }
}       

