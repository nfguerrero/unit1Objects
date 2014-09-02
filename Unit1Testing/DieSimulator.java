import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        int lock = 0;
        while (lock < 10)
        {
            Random generator = new Random();
            int num = generator.nextInt(6);
            num += 1;
            System.out.println(num);
            lock += 1;
        }    
    }
}
        
