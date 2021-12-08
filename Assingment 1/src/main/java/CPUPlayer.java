//this is an identical copy of the HumanPlayer class but for the enemy player

import java.util.Scanner;
import java.util.Random;

public class CPUPlayer extends Player {
    Random rand = new Random();
    Monster monster;

    CPUPlayer(Monster monster){
        this.monster = monster;
    }

    //choose
    public int chooseMove(){
        int enemyMove;
        int upper = 4;
        enemyMove = rand.nextInt(upper);
        if (enemyMove == 1){
            System.out.println(monster.name + " used " + monster.getMove1().name);
        } else if (enemyMove == 2){
            System.out.println(monster.name + " used " + monster.getMove2().name);
        } else if (enemyMove == 3){
            System.out.println(monster.name + " used " + monster.getMove3().name);
        } else if (enemyMove == 4){
            System.out.println(monster.name + " used " + monster.getMove4().name);
        }
        return enemyMove;
    }

    //attack
    //function checks which move was generated then decides if attack lands based on accuracy of attack chosen
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


