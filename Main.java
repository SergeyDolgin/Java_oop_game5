/*
Пример реализации шага лучника в архиве. 
Доработать шаг лучника в своём проекте. 
Сделать степ крестьян - если не труп то state = "Stand"
Сделать степ колдуна и монаха - если не труп то найти среди своих персонажа с здоровьем меньше максимального и вылечить его!
 */

import units.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------");
        // System.out.println("LIGHT сторона:");
        int teamCount1 = 10;
        Random rand = new Random();
        
        /** Создать в основной программе два списка. Команды LIGHT и DARK расставлены по левую и правую стороны поля 10х10*/
        ArrayList<BaseHero> team1 = new ArrayList<>();
        for (int i = 0; i < teamCount1; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team1.add(new Sniper("LIGHT",  1, i+1));
                    break;
                case 1:
                    team1.add(new Villager("LIGHT", 1, i+1));
                    break;
                case 2:
                    team1.add(new Magician("LIGHT", 1, i+1));
                    break;
                case 3:
                    team1.add(new Raider("LIGHT", 1, i+1));
                    break;
                default:
                    // teams.add(new BaseHero());
                    break;
            }
            // System.out.println(team1.get(i).getInfo());
        }

        // System.out.println("DARK сторона:");
        ArrayList<BaseHero> team2 = new ArrayList<>();
        int teamCount2 = 10;
        for (int i = 0; i < teamCount2; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team2.add(new Arbalester("DARK", 10, i+1));
                    break;
                case 1:
                    team2.add(new Villager("DARK", 10, i+1));
                    break;
                case 2:
                    team2.add(new Monk("DARK", 10, i+1));
                    break;
                case 3:
                    team2.add(new Spearman("DARK", 10, i+1));
                    break;
                default:
                    // teams.add(new BaseHero());
                    break;
            }
            // System.out.println(team2.get(i).getInfo());
        }

        ArrayList<BaseHero> listResult = new ArrayList<>();
        listResult.addAll(team1);
        listResult.addAll(team2);
        // // System.out.println("Общий список:");
        // /** Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа */
        listResult.sort(new Comparator<BaseHero>() {

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed())
                    return o2.getHP() - o1.getHP();
                return o2.getSpeed() - o1.getSpeed();
            }
        });


        // listResult.SortBySpeed;
        // System.out.println("Список героев по убыванию СКОРОСТИ");
        // listResult.forEach(n -> System.out.print(n.getInfo()+ n.getSide() +" скорость " + n.getSpeed() + " здоровье " + n.getHP() + ", \n"));


        System.out.println("До атаки");
        System.out.println("LIGHT");
        team1.forEach(n -> System.out.print(n.getInfo()+ n.getSide() +" скорость " + n.getSpeed() + " здоровье " + n.getHP() + ", \n"));
        System.out.println("DARK");
        team2.forEach(n -> System.out.print(n.getInfo()+ n.getSide() +" скорость " + n.getSpeed() + " здоровье " + n.getHP() + ", \n"));

        /** Стрельба реализована через метод step только у арбалетчиков и снайперов */
        for (BaseHero baseHero : listResult) {
            if (team1.contains(baseHero)) baseHero.step(team1, team2);
            else baseHero.step(team2, team1);
            
        }
        System.out.println("После атаки арбалетчиков и снайперов и лечения колдунов и монахов");
        System.out.println("LIGHT");
        team1.forEach(n -> System.out.print(n.getInfo()+ n.getSide() +" скорость " + n.getSpeed() + " здоровье " + n.getHP() + ", \n"));
        System.out.println("DARK");
        team2.forEach(n -> System.out.print(n.getInfo()+ n.getSide() +" скорость " + n.getSpeed() + " здоровье " + n.getHP() + ", \n"));
   
    }
}
