import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

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
        Random aGen = new Random();
        int a1c = 1;
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
        Turtle a1 = new Turtle(space);
        a1.penUp();
        a1.moveTo(100, 50);
        Turtle a2 = new Turtle(space);
        a2.penUp();
        a2.moveTo(200, 50);
        Turtle a3 = new Turtle(space);
        a3.penUp();
        a3.moveTo(300, 50);
        Turtle a4 = new Turtle(space);
        a4.penUp();
        a4.moveTo(400, 50);
        Turtle a5 = new Turtle(space);
        a5.penUp();
        a5.moveTo(500, 50);
        Turtle a6 = new Turtle(space);
        a6.penUp();
        a6.moveTo(600, 50);
        Turtle a7 = new Turtle(space);
        a7.penUp();
        a7.moveTo(700, 50);
        a1.setVisible(false); 
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        a5.setVisible(false);
        a6.setVisible(false);
        a7.setVisible(false);
        while (1 < 2)
        {
            Thread.sleep(1000);            
            int aAxis = aGen.nextInt(7);
            aAxis ++;
            aAxis *=100;
            Thread.sleep(1000);
            
            if (aAxis == 100)
            {
                a1.setVisible(true);
                a1.setColor(Color.GRAY);
                a1.setShellColor(Color.GRAY);
                Thread.sleep(4000);                               
            }
            if (aAxis == 200)
            {
                a2.setVisible(true);
                a2.setColor(Color.GRAY);
                a2.setShellColor(Color.GRAY);
                Thread.sleep(4000);                               
            }
            if (aAxis == 300)
            {
                a3.setVisible(true);
                a3.setColor(Color.GRAY);
                a3.setShellColor(Color.GRAY);
                Thread.sleep(4000);                               
            }
            if (aAxis == 400)
            {
                a4.setVisible(true);
                a4.setColor(Color.GRAY);
                a4.setShellColor(Color.GRAY);
                Thread.sleep(4000);                               
            }
            if (aAxis == 500)
            {
                a5.setVisible(true);
                a5.setColor(Color.GRAY);
                a5.setShellColor(Color.GRAY);
                Thread.sleep(4000);                               
            }
            if (aAxis == 600)
            {
                a6.setVisible(true);
                a6.setColor(Color.GRAY);
                a6.setShellColor(Color.GRAY);
                Thread.sleep(4000);                               
            }
            if (aAxis == 700)
            {
                a7.setVisible(true);
                a7.setColor(Color.GRAY);
                a7.setShellColor(Color.GRAY);
                Thread.sleep(4000);                               
            }
            if (a1.isVisible() == true)
            {
                a1.backward(100);
            }
            if (a2.isVisible() == true)
            {
                a2.backward(100);
            }
            if (a3.isVisible() == true)
            {
                a3.backward(100);
            }
            if (a4.isVisible() == true)
            {
                a4.backward(100);
            }
            if (a5.isVisible() == true)
            {
                a5.backward(100);
            }
            if (a6.isVisible() == true)
            {
                a6.backward(100);
            }
            if (a7.isVisible() == true)
            {
                a7.backward(100);
            }
            if (a1.getYPos() == planet1.getYPos())
            {
                a1.setVisible(false);
                planet1.setShellColor(Color.RED);
                planet1.setColor(Color.ORANGE);
            }    
            if (a2.getYPos() == planet2.getYPos())
            {
                a2.setVisible(false);
                planet2.setShellColor(Color.RED);
                planet2.setColor(Color.ORANGE);
            }    
            if (a3.getYPos() == planet3.getYPos())
            {
                a3.setVisible(false);
                planet3.setShellColor(Color.RED);
                planet3.setColor(Color.ORANGE);
            }    
            if (a4.getYPos() == planet4.getYPos())
            {
                a4.setVisible(false);
                planet4.setShellColor(Color.RED);
                planet4.setColor(Color.ORANGE);
            }    
            if (a5.getYPos() == planet5.getYPos())
            {
                a5.setVisible(false);
                planet5.setShellColor(Color.RED);
                planet5.setColor(Color.ORANGE);
            }    
            if (a6.getYPos() == planet6.getYPos())
            {
                a6.setVisible(false);
                planet6.setShellColor(Color.RED);
                planet6.setColor(Color.ORANGE);
            }    
            if (a7.getYPos() == planet7.getYPos())
            {
                a7.setVisible(false);
                planet7.setShellColor(Color.RED);
                planet7.setColor(Color.ORANGE);
            }    
            String direction = JOptionPane.showInputDialog("Which direction?(a = left, d = right(This might not work)");
            System.out.print(direction);
            String g = direction;
            String a = "a";
            if (g == a)
            {
                ship.turnLeft();
                ship.forward(100);
                ship.turnRight();
            }
            else
            {
                ship.turnRight();
                ship.forward(100);
                ship.turnLeft();
            }    
        }
    }
}