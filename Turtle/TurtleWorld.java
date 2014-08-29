import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        World turtleWorld2 = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld2);
        turtle2.forward(30);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
    }
}
