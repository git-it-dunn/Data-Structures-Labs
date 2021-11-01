//Riley Dunn
//Monday October 4th 2021
//this lab explores the creation of shape classes using abstract classes

public abstract class Shape {
    String colour;
    int size;

    Shape(String colour){
        this.colour = colour;
    }

    public abstract float getArea();

    public abstract float getPerimeter();

    public abstract String toString();
}
