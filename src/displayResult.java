import java.awt.Container;
import javax.swing.*;

class displayResult
{

    public displayResult(JFrame jframe, int i)
    {
        Object aobj[] = {
            "Play Again!", "Quit"
        };
        ImageIcon imageicon = new ImageIcon("C:/Users/manpreet/Desktop/G.L.E.W/logo.jpg");
        int j = JOptionPane.showOptionDialog(null, (new StringBuilder()).append("Your Score: ").append(i).toString(), "", -1, 1, imageicon, aobj, aobj[0]);
        if(j == 0)
        {
            jframe.getContentPane().removeAll();
            jframe.repaint();
            new selectLevel(jframe);
        } else
        if(j == 1)
        {
            jframe.dispose();
        }
    }
}
