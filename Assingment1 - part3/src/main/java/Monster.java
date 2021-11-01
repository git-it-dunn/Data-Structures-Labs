//this class offers the basic structure of the monsters in the game

public class Monster {
    String name;
    String type;
    int hp;
    int speed;
    int attack;
    int defense;
    Move move1;
    Move move2;
    Move move3;
    Move move4;

    Monster(String name, String type, int hp, int speed, int attack, int defense, Move move1, Move move2, Move move3, Move move4){
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.speed = speed;
        this.defense = defense;
        this.attack = attack;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getHP() {
        return hp;
    }
    public int getSpeed() {
        return speed;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public Move getMove1() {
        return move1;
    }
    public Move getMove2() {
        return move2;
    }
    public Move getMove3() {
        return move3;
    }
    public Move getMove4() {
        return move4;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setHP(int hp) {
        this.hp = hp;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public void setMove1(Move move1) {
        this.move1 = move1;
    }
    public void setMove2(Move move2) {
        this.move2 = move2;
    }
    public void setMove3(Move move3) {
        this.move3 = move3;
    }
    public void setMove4(Move move4) {
        this.move4 = move4;
    }
}

