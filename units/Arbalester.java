package units;


public class Arbalester extends Shooter {

    public Arbalester(String side, int x, int y) {
        super("Arbalester", side, "Mikle", 10, 6, 4, 3, 2, 3, 16, x, y);
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик: ";
    }

}

