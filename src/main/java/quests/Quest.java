package quests;

import enemies.Enemy;
import players.Knight;
import players.Player;
import utilities.Item;

import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Quest {

    Scanner scanner = new Scanner(System.in);

    private int questCounter;
    private int turnCounter;
//    private ArrayList<Event> events;

    public Quest(int questCounter, int turnCounter){
        this.questCounter = questCounter;
        this.turnCounter = turnCounter;
//        this.events = new ArrayList<>();
    }

    public void enemyEvent(Enemy enemy, Knight knight){
        while(enemy.getHealth() > 0 && knight.getHealth() > 0){
            System.out.println("1. Attack, 2. Defend, 3. Use Item");
            String input = scanner.next();
            int choice = parseInt(input);
            if(choice == 1){
                knight.attack(enemy);
            }
            else if(choice == 2){
                knight.defend(enemy);
            }
            else if(choice == 3){
                knight.viewInventory();
                System.out.println("Choose one of the items");
                String newInput = scanner.next();
                int itemChoice = parseInt(newInput);
                knight.useItem(itemChoice);
            }
            enemy.attack(knight);
            System.out.println("Enemy" + enemy.getHealth());
            System.out.println("Player" + knight.getHealth());
        }
        System.out.println("Well done!");
    }


}
