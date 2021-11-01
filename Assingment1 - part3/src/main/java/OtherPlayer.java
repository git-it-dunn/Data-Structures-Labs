//this is an identical copy of the HumanPlayer class but for the gremlin

import java.util.Scanner;
import java.util.Random;

public class OtherPlayer extends Player {
    Random rand = new Random();
    Monster monster;

    OtherPlayer(Monster monster){
        this.monster = monster;
    }

    //choose
    public int chooseMove(){
        int enemyMove = 0;
        return enemyMove;
    }

    //attack
    //the function for the gremlin generates another chance
    //a random numner is generated between 0 and 10, if a 1 is generated then the gremlin attacks
    //the chance generated in GameDriver and in this function makes the chance of killing less
    public void attack(Player enemy, int playerMove){
        Random rand = new Random();
        int damageDealt = 0;
        int deathChance = rand.nextInt(10);
        if (deathChance == 1){
            damageDealt = monster.getAttack();
        }else{
            damageDealt = 0;
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



