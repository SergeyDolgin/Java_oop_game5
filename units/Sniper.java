package units;

/**Снайпер*/
public class Sniper extends Shooter {

    public Sniper(String side, int x, int y){
        super("Sniper____", side, "Eagle", 15, 12, 9, 10, 8, 10, 32, x, y);
             
    }

    @Override
    public String getInfo() { return "Я Снайпер: ";}

}
