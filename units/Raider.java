package units;

public class Raider extends Warrior {

    public Raider(String side, int x, int y){
        super("Raider____", side, "Piter", 10, 8, 6, 4, 2, 3, x, y, 0);
        
    }

    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Разбойник: ";}

}