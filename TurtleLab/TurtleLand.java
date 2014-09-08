import java.awt.Color;
import java.util.Random;

public class TurtleLand
{
    public static void main(String[] args) throws InterruptedException
    {
        World tWorld = new World(800, 800);
        Turtle t1 = new Turtle(tWorld);
        Turtle t2 = new Turtle(tWorld);
        int step = 1; 
        int count = 0;
        t1.turnLeft(); 
        t1.forward(step);
        t1.turn(180);
        t2.forward(step);
        t2.turnLeft();
        Thread.sleep(1000);
        while (count < 1000)
        {
            Random gen = new Random();
            Color t1scolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            Color t2scolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            Color t1pcolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            Color t2pcolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            Color t1bcolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
            Color t2bcolor = new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
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
            t1.setColor(t1bcolor);
            t2.setColor(t2bcolor);
            count += 1;            
        }
        
        //AstroCrash!(Turtle Version)
        
        World space = new World(800, 800);
        Turtle ship = new Turtle(space);
        Turtle planet1 = new Turtle(space);
        Turtle planet2 = new Turtle(space);
        Turtle planet3 = new Turtle(space);
        Turtle planet4 = new Turtle(space);
        Turtle planet5 = new Turtle(space);
        Turtle planet6 = new Turtle(space);
        Turtle planet7 = new Turtle(space);
        ship.moveTo(400, 700);
        planet1.moveTo(100, 750);
        planet2.moveTo(200, 750);
        planet3.moveTo(300, 750);
        planet4.moveTo(400, 750);
        planet5.moveTo(500, 750);
        planet6.moveTo(600, 750);
        planet7.moveTo(700, 750);
        ship.clearPath();
        planet1.clearPath();
        planet2.clearPath();
        planet3.clearPath();
        planet4.clearPath();
        planet5.clearPath();
        planet6.clearPath();
        planet7.clearPath();
        ship.setColor(Color.RED);
        ship.setShellColor(Color.BLUE);
        planet1.setColor(Color.GREEN);
        planet2.setColor(Color.GREEN);
        planet3.setColor(Color.GREEN);
        planet4.setColor(Color.GREEN);
        planet5.setColor(Color.GREEN);
        planet6.setColor(Color.GREEN);
        planet7.setColor(Color.GREEN);
        planet1.setShellColor(Color.GREEN);
        planet2.setShellColor(Color.GREEN);
        planet3.setShellColor(Color.GREEN);
        planet4.setShellColor(Color.GREEN);
        planet5.setShellColor(Color.GREEN);
        planet6.setShellColor(Color.GREEN);
        planet7.setShellColor(Color.GREEN);
        while (1 < 2)
        {
            Thread.sleep(1000);
            Random aGen = new Random();
            int aAxis = aGen.nextInt(7);
            aAxis ++;
            aAxis *=100;
            Turtle asteroid = new Turtle(space);
            asteroid.moveTo(aAxis,50);
            asteroid.clearPath();
            
            
        }
    }
}