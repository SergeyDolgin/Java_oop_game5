package units;

import java.util.ArrayList;
import java.util.Comparator;


public class SortBySpeed {

    static ArrayList<BaseHero> Sort (ArrayList<BaseHero> listResult){
        listResult.sort(new Comparator<BaseHero>() {

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed())
                    return o2.getHP() - o1.getHP();
                return o2.getSpeed() - o1.getSpeed();
            }
    });
    return listResult;
}
}




