public class Battle {
    String chikapuName;
    float chikapuAttack;
    float chikapuDefense;
    float chikapuHP;

    String zarichardName;
    float zarichardAttack;
    float zarichardDefense;
    float zarichardHP;

    int round = 1;
    float chikapuDamage;
    float zarichardDamage;

    public Battle(String chikapuName, float chikapuAttack, float chikapuDefense, float chikapuHP, String zarichardName, float zarichardAttack, float zarichardDefense, float zarichardHP){
        this.chikapuName = chikapuName;
        this.chikapuAttack = chikapuAttack;
        this.chikapuDefense = chikapuDefense;
        this.chikapuHP = chikapuHP;

        this.zarichardName = zarichardName;
        this.zarichardAttack = zarichardAttack;
        this.zarichardDefense = zarichardDefense;
        this.zarichardHP = zarichardHP;
    }

    public boolean isMonster1Dead(){
        if (chikapuHP < 0)
        {
            return true;
        }else{
            return false;
        }
    }
    public boolean isMonster2Dead(){
        if (zarichardHP < 0)
        {
            return true;
        }else{
            return false;
        }
    }

    public void simulateRound(){
        chikapuDamage = chikapuAttack - zarichardDefense;
        zarichardDamage = zarichardAttack - chikapuDefense;

        System.out.println("Round " + round);
        System.out.println(chikapuName + " does " + chikapuDamage + " points of damage to " + zarichardName);
        System.out.println(zarichardName + " does " + zarichardDamage + " points of damage to " + chikapuName);

        chikapuHP = chikapuHP - zarichardDamage;
        zarichardHP = zarichardHP - chikapuDamage;

        System.out.println("chikapu: " + chikapuHP);
        System.out.println("zarichard: " + zarichardHP);

        round++;

        System.out.println(" ");
    }

    //getters for both monsters and their traits
    public String getMonster1Name(){return chikapuName;}
    public String getMonster2Name(){return zarichardName;}

    public float getMonster1Attack(){return chikapuAttack;}
    public float getMonster2Attack(){return zarichardAttack;}

    public float getMonster1Defense(){return chikapuDefense;}
    public float getMonster2Defense(){return zarichardDefense;}

    public float getMonster1HP(){return chikapuHP;}
    public float getMonster2HP(){return zarichardHP;}
}
