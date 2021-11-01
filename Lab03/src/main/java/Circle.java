public class Circle extends Shape {
    float radius;

    public Circle(String colour, float radius) {
        super(colour);
        this.colour = colour;
        this.radius = radius;
    }

    public float getArea(){
        return (float) (3.141592 * (radius * radius));
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * 3.14159 * radius);
    }

    public String toString(){
        return (colour + " circle with radius " + radius);

    }
}
