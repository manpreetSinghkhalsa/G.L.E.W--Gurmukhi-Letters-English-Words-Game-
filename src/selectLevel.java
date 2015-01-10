import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class selectLevel
    implements ActionListener, FocusListener, MouseListener
{

    JFrame f;
    JPanel p;
    JLabel l;
    JButton practice;
    JButton Challenge;
    JButton start;
    JTextField t;
    Boolean b;

    public selectLevel(JFrame jframe)
    {
        b = Boolean.valueOf(false);
        f = jframe;
        jframe.setVisible(true);
        jframe.setSize(600, 500);
        jframe.setLayout(new FlowLayout());
        Insets insets = new Insets(5, 5, 5, 5);
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        GridBagLayout gridbaglayout = new GridBagLayout();
        p = new JPanel();
        ImageIcon imageicon = new ImageIcon("resources/3.jpg");
        l = new JLabel(imageicon);
        practice = new JButton("Practice (No Time Limit)");
        Challenge = new JButton("Challenge (60 Seconds)");
        l.setLayout(gridbaglayout);
        practice.setFont(new Font("Garamond", 1, 18));
        practice.setForeground(Color.yellow);
        practice.setOpaque(false);
        practice.setContentAreaFilled(false);
        practice.setBackground(Color.black);
        Challenge.setBackground(Color.black);
        Challenge.setFont(new Font("Garamond", 1, 18));
        Challenge.setForeground(Color.yellow);
        Challenge.setOpaque(false);
        Challenge.setContentAreaFilled(false);
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 0;
        l.add(practice, gridbagconstraints);
        gridbagconstraints.gridwidth = 1;
        gridbagconstraints.insets = insets;
        gridbagconstraints.gridx = 2;
        gridbagconstraints.gridy = 0;
        l.add(Challenge, gridbagconstraints);
        gridbagconstraints.gridx = 1;
        gridbagconstraints.gridy = 1;
        t = new JTextField("Enter your name: ");
        start = new JButton("SurU krO");
        start.setFont(new Font("GurbaniAkhar", 1, 18));
        t.setVisible(false);
        t.setFont(new Font("ARIAL", 0, 20));
        start.setVisible(false);
        gridbagconstraints.gridwidth = 1;
        gridbagconstraints.fill = 2;
        l.add(t, gridbagconstraints);
        gridbagconstraints.gridx = 1;
        gridbagconstraints.gridy = 2;
        gridbagconstraints.gridwidth = 1;
        gridbagconstraints.gridheight = 1;
        start.setForeground(Color.black);
        start.setBackground(Color.yellow);
        l.add(start, gridbagconstraints);
        p.add(l);
        jframe.add(p);
        jframe.pack();
        practice.addActionListener(this);
        Challenge.addActionListener(this);
        t.addFocusListener(this);
        practice.addMouseListener(this);
        Challenge.addMouseListener(this);
        start.addActionListener(this);
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        JButton jbutton = (JButton)actionevent.getSource();
        if(jbutton == practice || jbutton == Challenge)
        {
            t.setVisible(true);
            start.setVisible(true);
            if(jbutton == practice)
            {
                b = Boolean.valueOf(false);
            } else
            {
                b = Boolean.valueOf(true);
            }
            practice.removeActionListener(this);
            Challenge.removeActionListener(this);
        } else
        if(t.getText().equals("Enter your name: ") || t.getText().equals(""))
        {
            JOptionPane.showConfirmDialog(null, "Fill Details", "", -1, 0);
        } else
        if(jbutton == start)
        {
            f.getContentPane().removeAll();
            f.repaint();
            new gui(f, b);
        }
    }

    public void focusGained(FocusEvent focusevent)
    {
        t.setText("");
    }

    public void mouseEntered(MouseEvent mouseevent)
    {
        JButton jbutton = (JButton)mouseevent.getSource();
        if(jbutton == practice)
        {
            practice.setOpaque(true);
            practice.setContentAreaFilled(true);
        } else
        {
            Challenge.setOpaque(true);
            Challenge.setContentAreaFilled(true);
        }
    }

    public void mouseExited(MouseEvent mouseevent)
    {
        JButton jbutton = (JButton)mouseevent.getSource();
        if(jbutton == practice)
        {
            practice.setOpaque(false);
            practice.setContentAreaFilled(false);
        } else
        {
            Challenge.setOpaque(false);
            Challenge.setContentAreaFilled(false);
        }
    }

    public void focusLost(FocusEvent focusevent)
    {
    }

    public void mouseClicked(MouseEvent mouseevent)
    {
    }

    public void mousePressed(MouseEvent mouseevent)
    {
    }

    public void mouseReleased(MouseEvent mouseevent)
    {
    }
}
