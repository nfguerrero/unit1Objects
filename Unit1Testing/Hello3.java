import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hello3
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://storage1.ihigh.com/schools/11344/imgbin/4925.jpg");
        JOptionPane.showMessageDialog(null, "Welcome to NNHS", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
        