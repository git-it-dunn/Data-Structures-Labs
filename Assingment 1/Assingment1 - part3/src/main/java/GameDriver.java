//Riley Dunn  (100760858)
//Jake Turner (1007262152)
//Assignment 1 - part 3
//this code is a pokemon game made from several classes for monsters and players
//all code communicates with this main class where the game runs
//this part of the assingment involves the addition of a new feature to the game

import java.util.Random;

public class GameDriver {
    public static void main(String[] args) {
        Random rand = new Random();
        Move move1 = new Move("Vine Whip", "Grass", 45, 1.0f);
        Move move2 = new Move("Tackle", "Normal", 50, 1.0f);
        Move move3 = new Move("Take Down", "Normal", 90, 0.85f);
        Move move4 = new Move("Razor Leaf", "Grass", 55, 0.95f);
        Monster monster = new Monster("Bulbasaur", "Grass", 240, 45, 49, 49, move1, move2, move3, move4);
        Player player = new HumanPlayer(monster);

        move1 = new Move("Scratch", "Normal", 40, 1.0f);
        move2 = new Move("Ember", "Fire", 40, 1.0f);
        move3 = new Move("Peck", "Flying", 35, 1.0f);
        move4 = new Move("Fire Spin", "Fire", 35, 0.85f);
        monster = new Monster("Torchic", "Fire", 240, 45, 60, 40, move1, move2, move3, move4);
        Player enemy = new CPUPlayer(monster);

        //new feature added here
        //added a new entity that has a chance to interfere with the game at any time
        //new entity is a gremlin that has a chance to instantly kill both players
        Move move996 = new Move("Instant death", "gravity", 999, 1.0f);
        Move move997 = new Move("Instant death", "gravity", 999, 1.0f);
        Move move998 = new Move("Instant death", "gravity", 999, 1.0f);
        Move move999 = new Move("Instant death", "gravity", 999, 1.0f);
        monster = new Monster("Gremlin", "interdimensional", 999,999,999,999, move996, move997, move998, move999);
        Player gremlin = new OtherPlayer(monster);

        while ((!player.hasLost()) && (!enemy.hasLost())) {
            // print both monsters' HP
            System.out.println("");
            System.out.printf("%s has %d HP\n",
                    player.getMonster().getName(),
                    player.getMonster().getHP());
            System.out.printf("%s has %d HP\n",
                    enemy.getMonster().getName(),
                    enemy.getMonster().getHP());

            // decide the next move
            //generates a number between 0 and 100
            //what it comes up with decides the fate of the round
            int whichPlayer = rand.nextInt(100);

            int playerMove = player.chooseMove();
            int enemyMove = enemy.chooseMove();

            //if whichPlayer is less than 90 then the players play
            //if whichPlayer is above 90 then gramlin kills all
            //if whichPlayer is less than 90, the game continues as normal with player speeds and all
            if (whichPlayer < 90){
                if (player.isFasterThan(enemy)) {
                    player.attack(enemy, playerMove);
                    if (!enemy.hasLost()) {
                        enemy.attack(player, enemyMove);
                    }
                } else {
                    enemy.attack(player, enemyMove);
                    if (!player.hasLost()) {
                        player.attack(enemy, playerMove);
                    }
                }
            } else{
                gremlin.attack(enemy, playerMove);
                gremlin.attack(enemy, playerMove);
            }
        }

        //checks if individual players have died for all cases in the game
        if (player.hasLost()) {
            System.out.printf("You and %s have lost the battle.\n",
                    player.getMonster().getName());
        } else if (player.hasLost() && enemy.hasLost()) {
            System.out.println("Gremlin has defeated all...");
        } else {
            System.out.printf("You and %s are victorious!\n",
                    player.getMonster().getName());
        }
    }
}

