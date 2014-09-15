import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        int count = 0;
        turtle.turn(30);
        while (count < 3)
        {
            turtle.forward(100);
            turtle.turn(120);
            count ++;
        }  
        turtle.turn(-120);
    }
}
