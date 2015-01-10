import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

class TimerClasse
    implements ActionListener
{

    int counter;

    public TimerClasse(int i)
    {
        counter = i;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        counter--;
        if(counter != 0)
        {
            gui.time.setText((new StringBuilder()).append("TIME LEFT: ").append(counter).toString());
        } else
        {
            gui.timer.stop();
            new displayResult(gui.f, gui.result);
        }
    }

    int getCounter()
    {
        return counter;
    }
}
