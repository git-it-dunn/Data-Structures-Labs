//this class contains the same as move, but for the player
//so contains everything pertaining to the player

public abstract class Player {
    Monster monster;

    //choose
    public abstract int chooseMove();

    //attack
    public abstract void attack(Player enemy, int playerMove);

    //haslost
    public abstract boolean hasLost();

    //is faster than
    public abstract boolean isFasterThan(Player enemy);

    //getter
    public abstract Monster getMonster();
}
