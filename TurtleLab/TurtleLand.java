import java.awt.Color;
import java.util.Random;

public class TurtleLand
{
    public static void main(String[] args) throws InterruptedException
    {
        World tWorld = new World();
        Turtle t1 = new Turtle(tWorld);
        Turtle t2 = new Turtle(tWorld);
        int step = 1; 
        t1.turnLeft(); 
        t1.forward(step);
        t1.turn(180);
        t2.forward(step);
        t2.turnLeft();
        Thread.sleep(1000);
        while (1 < 2)
        {
            Random gen = new Random();
            Color t1scolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            Color t2scolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            Color t1pcolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            Color t2pcolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            t1.forward(step);
            t2.forward(step);
            t1.turnLeft();
            t2.turnLeft();
            step += 1;
            Thread.sleep(5); // sleep 1000 milliseconds (1 second)
            t1.setShellColor(t1scolor);
            t2.setShellColor(t2scolor);
            t1.setPenColor(t1pcolor);
            t2.setPenColor(t1pcolor);
            
        }
    }
}