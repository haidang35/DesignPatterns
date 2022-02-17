package flyweight_pattern.gameapp;

import java.time.Duration;
import java.util.ArrayList;

public class GameApp {
    private static ArrayList<ISoldier> soldiers = new ArrayList<>();
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        createSoldier(5, "Hero", 1);
        createSoldier(5, "Dragon", 1);
        createSoldier(3, "Dragon", 3);
        createSoldier(2, "Hero", 2);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
    }

    private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
        for (int i = 1; i <= numberOfSoldier; i++) {
            Context star = new Context("Soldier" + (soldiers.size() + 1), numberOfStar);
            ISoldier soldier = SoldierFactory.createSoldier(soldierName);
            soldier.promote(star);
            soldiers.add(soldier);
        }
    }
}
