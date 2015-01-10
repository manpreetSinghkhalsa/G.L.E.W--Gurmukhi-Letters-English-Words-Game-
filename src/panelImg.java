import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class panelImg
    implements ActionListener
{

    JFrame f;
    JPanel p;
    JLabel l;
    JButton b;

    public panelImg()
    {
        f = new JFrame("G.L.E.W!");
        f.setVisible(true);
        f.setSize(600, 500);
        f.setLayout(new FlowLayout());
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        f.setBounds(dimension.width / 2 - f.getSize().width / 2, dimension.height / 2 - f.getSize().height / 2, 700, 700);
        f.setResizable(false);
        p = new JPanel();
        ImageIcon imageicon = new ImageIcon("resources/3.jpg");
        l = new JLabel(imageicon);
        b = new JButton("Play");
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        GridBagLayout gridbaglayout = new GridBagLayout();
        l.setLayout(gridbaglayout);
        b.setFont(new Font("Garamond", 0, 30));
        b.setForeground(Color.yellow);
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 0;
        l.add(b, gridbagconstraints);
        p.add(l);
        f.add(p);
        f.pack();
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        JButton jbutton = (JButton)actionevent.getSource();
        if(jbutton == b)
        {
            f.getContentPane().removeAll();
            f.repaint();
            new selectLevel(f);
        }
    }

    public static void main(String args[])
    {
        Runnable runnable = new Runnable() {

            public void run()
            {
                new panelImg();
            }

        };
        SwingUtilities.invokeLater(runnable);
    }
}
