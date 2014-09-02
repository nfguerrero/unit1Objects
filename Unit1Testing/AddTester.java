import java.awt.Rectangle;

public class AddTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);
        System.out.println("Expected: Width(25), Height(40)");
        System.out.print("Actual: ");
        System.out.println(box);
     
    }
}    