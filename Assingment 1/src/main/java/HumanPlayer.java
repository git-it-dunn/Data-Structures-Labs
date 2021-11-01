//this class is for the human player of the game
//it has functions that allow for human input and choice in the game
//it also controls more of the human side of the game like deciding if their pokemon died or if its faster than the enemy

import java.util.Scanner;
import java.util.Random;

public class HumanPlayer extends Player{
    Scanner scan = new Scanner(System.in);
    Monster monster;

    HumanPlayer(Monster monster){
        this.monster = monster;
    }

    //Choose move function
    public int chooseMove(){
        int playerMove;
        System.out.println("Choose your attack! (1-4)");
        System.out.println("1. "+monster.getMove1().name);
        System.out.println("2. "+monster.getMove2().name);
        System.out.println("3. "+monster.getMove3().name);
        System.out.println("4. "+monster.getMove4().name);
        playerMove = scan.nextInt();
        if (playerMove == 1){
            System.out.println(monster.name + " used " + monster.getMove1().name);
        } else if (playerMove == 2){
            System.out.println(monster.name + " used " + monster.getMove2().name);
        } else if (playerMove == 3){
            System.out.println(monster.name + " used " + monster.getMove3().name);
        } else if (playerMove == 4){
            System.out.println(monster.name + " used " + monster.getMove4().name);
        }
        return playerMove;
    }

    //Attack function
    //function checks which move was inputted by human player then decides if attack lands based on accuracy of attack chosen
    public void attack(Player enemy, int playerMove){
        int damageDealt = 0;
        double acc = Math.random();
        if (playerMove == 1){
            if (acc <= monster.getMove1().accuracy){
                damageDealt = (monster.attack + monster.getMove1().power) - enemy.getMonster().defense;
            }else{
                damageDealt = 0;
            }

        } else if (playerMove == 2){
            if (acc <= monster.getMove2().accuracy){
                damageDealt = (monster.attack + monster.getMove2().power) - enemy.getMonster().defense;
            }else{
                damageDealt = 0;
            }

        } else if (playerMove == 3){
            if (acc <= monster.getMove3().accuracy){
                damageDealt = (monster.attack + monster.getMove3().power) - enemy.getMonster().defense;
            }else{
                damageDealt = 0;
            }

        } else if (playerMove == 4){
            if (acc <= monster.getMove4().accuracy){
                damageDealt = (monster.attack + monster.getMove4().power) - enemy.getMonster().defense;
            }else{
                damageDealt = 0;
            }
        }
        System.out.println(monster.getName() + " did " + damageDealt + " points of damage!");
        monster.hp = monster.hp - damageDealt;
    }

    //haslost
    //checks to see if the pokemon has an hp value equal to or below zero
    public boolean hasLost(){
        if (monster.hp <= 0){
            return true;
        }else {
            return false;
        }
    }

    //is faster than
    //checks which attack was faster between both the player and enemy
    public boolean isFasterThan(Player enemy){
        if (monster.speed > enemy.getMonster().speed){
            return true;
        }else{
            return false;
        }
    }

    //getter
    public Monster getMonster() {
        return monster;
    }
}
