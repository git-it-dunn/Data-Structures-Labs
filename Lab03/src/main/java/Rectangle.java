public class Rectangle extends Shape {
    float length;
    float width;
    public Rectangle(String colour, float length, float width){
        super(colour);
        this.length = length;
        this.width = width;
        this.colour = colour;
    }

    public float getArea(){
        return length * width;
    }

    @Override
    public float getPerimeter() {
        return ((length * 2) + (width * 2));
    }

    public String toString(){
        return (colour + " rectangle with width " + width + " and length: " + length);
    }
}
