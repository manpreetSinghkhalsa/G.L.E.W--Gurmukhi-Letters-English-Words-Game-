import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class gui
    implements ActionListener, MouseListener
{

    static JFrame f;
    public static JLabel time;
    static int result;
    static Timer timer;
    TimerClasse tc;
    static int counter;
    JButton b[];
    JLabel pik;
    JButton skip;
    String engVersion[];
    String punjabiVersion[];
    String WRONGengVersion[];
    String WRONGpunjabiVersion[];
    String picsName[];
    String displayPunjabi[];
    String displayEnglish[];
    int RandomOrder[];
    int index;
    pics p;
    Words w;
    Boolean bool;

    public gui(JFrame jframe, Boolean boolean1)
    {
        b = new JButton[5];
        gui _tmp = this;
        f = jframe;
        bool = boolean1;
        p = new pics();
        w = new Words();
        RandomOrder = p.generateOrder();
        picsName = p.getPikNames();
        w.optio(RandomOrder);
        w.getWrongAnswers(RandomOrder);
        engVersion = w.getEnglishWords();
        punjabiVersion = w.getPunjabiVersion();
        WRONGengVersion = w.getWRONGEnglishWords();
        WRONGpunjabiVersion = w.getWRONGPunjabiVersion();
        index = 0;
        result = 0;
        if(boolean1.booleanValue())
        {
            counter = 60;
            tc = new TimerClasse(counter);
            timer = new Timer(1000, tc);
            timer.start();
        }
        displayPunjabi = new String[4];
        displayEnglish = new String[4];
        showOff(index);
    }

    public void showOff(int i)
    {
        if(bool.booleanValue())
        {
            counter = tc.getCounter();
            time = new JLabel((new StringBuilder()).append("TIME LEFT: ").append(counter).toString());
        } else
        {
            time = new JLabel("No Limit");
        }
        time.setFont(new Font("Garamond", 1, 18));
        f.getContentPane().setBackground(Color.gray);
        int ai[] = RandomButtonOrder(4);
        b = addString(b, i);
        f.setSize(600, 500);
        f.setVisible(true);
        GridBagLayout gridbaglayout = new GridBagLayout();
        GridBagConstraints gridbagconstraints = new GridBagConstraints();
        f.setLayout(gridbaglayout);
        ImageIcon imageicon = new ImageIcon((new StringBuilder()).append("resources/words/").append(picsName[RandomOrder[i]]).append(".jpg").toString());
        skip = new JButton("NEXT >>");
        pik = new JLabel("", imageicon, 0);
        skip.setOpaque(false);
        skip.setContentAreaFilled(false);
        skip.setBorderPainted(false);
        skip.setFont(new Font("Garamond", 1, 18));
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 0;
        gridbagconstraints.weighty = 1.0D;
        gridbagconstraints.weightx = 1.0D;
        f.add(time, gridbagconstraints);
        gridbagconstraints.gridx = 1;
        gridbagconstraints.gridy = 0;
        f.add(skip, gridbagconstraints);
        gridbagconstraints.weighty = 1.0D;
        gridbagconstraints.weightx = 1.0D;
        gridbagconstraints.gridx = 0;
        gridbagconstraints.gridy = 1;
        gridbagconstraints.gridheight = 4;
        gridbagconstraints.fill = 1;
        f.add(pik, gridbagconstraints);
        gridbagconstraints.gridx = 1;
        gridbagconstraints.gridy = 1;
        gridbagconstraints.gridheight = 1;
        gridbagconstraints.gridwidth = 1;
        gridbagconstraints.fill = 0;
        f.add(b[ai[0]], gridbagconstraints);
        gridbagconstraints.gridheight = 1;
        gridbagconstraints.gridwidth = 1;
        gridbagconstraints.fill = 0;
        gridbagconstraints.gridy = 2;
        f.add(b[ai[1]], gridbagconstraints);
        gridbagconstraints.gridheight = 1;
        gridbagconstraints.gridwidth = 1;
        gridbagconstraints.fill = 0;
        gridbagconstraints.gridy = 3;
        f.add(b[ai[2]], gridbagconstraints);
        skip.addActionListener(this);
        gridbagconstraints.gridy = 4;
        f.add(b[ai[3]], gridbagconstraints);
        for(int j = 0; j < 4; j++)
        {
            b[j].setFont(new Font("Gafata", 0, 18));
            b[j].addActionListener(this);
        }

        f.pack();
    }

    int[] RandomButtonOrder(int i)
    {
        int ai[] = new int[i];
        Boolean aboolean[] = new Boolean[i];
        Random random = new Random();
        boolean flag = true;
        try
        {
            for(int j1 = 0; j1 < i; j1++)
            {
                aboolean[j1] = Boolean.valueOf(true);
            }

            int k = -1;
            int l = i - 1;
            int i1 = 0;
            while(++k < i) 
            {
                int j;
                for(j = random.nextInt((l - i1) + 1) + i1; !aboolean[j].booleanValue(); j = random.nextInt((l - i1) + 1) + i1) { }
                ai[k] = j;
                aboolean[j] = Boolean.valueOf(false);
            }
        }
        catch(Exception exception) { }
        return ai;
    }

    JButton[] addString(JButton ajbutton[], int i)
    {
        ajbutton[0] = new JButton(engVersion[i]);
        displayEnglish[0] = engVersion[i];
        displayPunjabi[0] = punjabiVersion[i];
        for(int j = 1; j < 4; j++)
        {
            ajbutton[j] = new JButton(WRONGengVersion[3 * i + (j - 1)]);
            displayPunjabi[j] = WRONGpunjabiVersion[3 * i + (j - 1)];
            displayEnglish[j] = WRONGengVersion[3 * i + (j - 1)];
        }

        return ajbutton;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        String s = actionevent.getActionCommand();
        JButton jbutton = (JButton)actionevent.getSource();
        if(index < 31)
        {
            if(jbutton == skip)
            {
                f.getContentPane().removeAll();
                f.getContentPane().repaint();
                if(!bool.booleanValue())
                {
                    for(int i = 0; i < 4; i++)
                    {
                        b[i].removeMouseListener(this);
                    }

                }
                showOff(++index);
            } else
            {
                if(jbutton == b[0])
                {
                    result++;
                }
                if(!bool.booleanValue())
                {
                    for(int j = 0; j < 4; j++)
                    {
                        b[j].addMouseListener(this);
                        b[j].setFont(new Font("GurbaniAkhar", 1, 18));
                        b[j].setText(displayPunjabi[j]);
                    }

                }
                jbutton.setBackground(Color.green);
                for(int k = 0; k < 4; k++)
                {
                    b[k].removeActionListener(this);
                }

            }
        } else
        {
            new displayResult(f, result);
        }
    }

    public void mouseEntered(MouseEvent mouseevent)
    {
        JButton jbutton = (JButton)mouseevent.getSource();
        byte byte0 = 0;
        if(jbutton == b[0])
        {
            byte0 = 0;
        } else
        if(jbutton == b[1])
        {
            byte0 = 1;
        } else
        if(jbutton == b[2])
        {
            byte0 = 2;
        } else
        if(jbutton == b[3])
        {
            byte0 = 3;
        }
        b[byte0].setFont(new Font("Gafata", 0, 18));
        b[byte0].setText(displayEnglish[byte0]);
    }

    public void mouseExited(MouseEvent mouseevent)
    {
        JButton jbutton = (JButton)mouseevent.getSource();
        byte byte0 = 0;
        if(jbutton == b[0])
        {
            byte0 = 0;
        } else
        if(jbutton == b[1])
        {
            byte0 = 1;
        } else
        if(jbutton == b[2])
        {
            byte0 = 2;
        } else
        if(jbutton == b[3])
        {
            byte0 = 3;
        }
        b[byte0].setFont(new Font("GurbaniAkhar", 1, 18));
        b[byte0].setText(displayPunjabi[byte0]);
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

    public static void main(String args[])
    {
        new gui(new JFrame(), Boolean.valueOf(true));
    }
}
