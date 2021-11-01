//this class contains actions and info that are used in each move in the game

public class Move {
    String name;
    String type;
    int power;
    float accuracy;

    Move(String name, String type, int power, float accuracy){
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getPower() {
        return power;
    }
    public float getAccuracy() {
        return accuracy;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }
}

