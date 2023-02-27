package units;

/**Копейщик */
public class Spearman extends Warrior {

     public Spearman(String side, int x, int y){
        super("Spearman__", side, "Bredy", 10, 4, 4, 3, 1, 5, x, y, 0); 
    }
 
    /**Переопределить getInfo так, чтобы он возвращал строки:"Я крестьянин", "Я снайпер"  */
    @Override
    public String getInfo() { return "Я Копейщик: ";}
 
 }
