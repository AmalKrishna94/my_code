import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Calculator implements ActionListener{
    JFrame jf;
    JLabel display_label;
    JButton seven_button;
    JButton eight_button;
    JButton nine_button;
    JButton four_button;
    JButton five_button;
    JButton six_button;
    JButton three_button;
    JButton two_button;
    JButton one_button;
    JButton dot_button;
    JButton zero_button;
    JButton equals_button;
    JButton div_button;
    JButton mul_button;
    JButton min_button;
    JButton plus_button;
    JButton clear_button;

    boolean isOperatorClicked = false;
    boolean addClicked = false;
    boolean minClicked = false;
    boolean mulClicked = false;
    boolean divClicked = false;
    String oldValue;

    public Calculator()
    {
        jf = new JFrame("My Calculator"); 
        jf.setLayout(null);
        jf.setSize(558, 610);
        jf.setLocation(500,150);
        
        display_label = new JLabel();
        display_label.setFont(new Font("Arial",Font.BOLD, 45));
        display_label.setBounds(30, 30, 480, 80);
        display_label.setBackground(Color.GRAY);
        display_label.setHorizontalAlignment(SwingConstants.RIGHT);
        display_label.setForeground(Color.WHITE);
        Border border = BorderFactory.createLineBorder(Color.YELLOW);
        display_label.setBorder(border);
        display_label.setOpaque(true);
        jf.add(display_label);

        seven_button = new JButton("7");
        seven_button.setFont(new Font("Arial",Font.PLAIN, 35));
        seven_button.setBounds(30, 140, 80, 80);
        jf.add(seven_button);
        seven_button.addActionListener(this);

        eight_button = new JButton("8");
        eight_button.setFont(new Font("Arial",Font.PLAIN, 35));
        eight_button.setBounds(130, 140, 80, 80);
        jf.add(eight_button);
        eight_button.addActionListener(this);

        nine_button = new JButton("9");
        nine_button.setFont(new Font("Arial",Font.PLAIN, 35));
        nine_button.setBounds(230, 140, 80, 80);
        jf.add(nine_button);
        nine_button.addActionListener(this);

        four_button = new JButton("4");
        four_button.setFont(new Font("Arial",Font.PLAIN, 35));
        four_button.setBounds(30, 250, 80, 80);
        jf.add(four_button);
        four_button.addActionListener(this);

        five_button = new JButton("5");
        five_button.setFont(new Font("Arial",Font.PLAIN, 35));
        five_button.setBounds(130, 250, 80, 80);
        jf.add(five_button);
        five_button.addActionListener(this);

        six_button = new JButton("6");
        six_button.setFont(new Font("Arial",Font.PLAIN, 35));
        six_button.setBounds(230, 250, 80, 80);
        jf.add(six_button);
        six_button.addActionListener(this);

        one_button = new JButton("1");
        one_button.setFont(new Font("Arial",Font.PLAIN, 35));
        one_button.setBounds(30, 360, 80, 80);
        jf.add(one_button);
        one_button.addActionListener(this);

        two_button = new JButton("2");
        two_button.setFont(new Font("Arial",Font.PLAIN, 35));
        two_button.setBounds(130, 360, 80, 80);
        jf.add(two_button);
        two_button.addActionListener(this);

        three_button = new JButton("3");
        three_button.setFont(new Font("Arial",Font.PLAIN, 35));
        three_button.setBounds(230, 360, 80, 80);
        jf.add(three_button);
        three_button.addActionListener(this);

        dot_button = new JButton(".");
        dot_button.setFont(new Font("Arial",Font.PLAIN, 35));
        dot_button.setBounds(30, 460, 80, 80);
        jf.add(dot_button);
        dot_button.addActionListener(this);

        zero_button = new JButton("0");
        zero_button.setFont(new Font("Arial",Font.PLAIN, 35));
        zero_button.setBounds(130, 460, 80, 80);
        jf.add(zero_button);
        zero_button.addActionListener(this);

        equals_button = new JButton("=");
        equals_button.setFont(new Font("Arial",Font.PLAIN, 35));
        equals_button.setBounds(230, 460, 80, 80);
        jf.add(equals_button);
        equals_button.addActionListener(this);

        div_button = new JButton("/");
        div_button.setFont(new Font("Arial",Font.PLAIN, 35));
        div_button.setBounds(330, 140, 80, 80);
        jf.add(div_button);
        div_button.addActionListener(this);

        mul_button = new JButton("x");
        mul_button.setFont(new Font("Arial",Font.PLAIN, 35));
        mul_button.setBounds(330, 250, 80, 80);
        jf.add(mul_button);
        mul_button.addActionListener(this);

        min_button = new JButton("-");
        min_button.setFont(new Font("Arial",Font.PLAIN, 35));
        min_button.setBounds(330, 360, 80, 80);
        jf.add(min_button);
        min_button.addActionListener(this);

        plus_button = new JButton("+");
        plus_button.setFont(new Font("Arial",Font.PLAIN, 35));
        plus_button.setBounds(330, 460, 80, 80);
        jf.add(plus_button);
        plus_button.addActionListener(this);

        clear_button = new JButton("C");
        clear_button.setFont(new Font("Arial",Font.PLAIN, 35));
        clear_button.setBounds(430, 460, 80, 80);
        jf.add(clear_button);
        clear_button.addActionListener(this);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==seven_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("7");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"7");
            }
        }
        else if(e.getSource()==eight_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("8");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"8");
            }
        }
        else if(e.getSource()==nine_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("9");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"9");
            }
        }
        else if(e.getSource()==four_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("4");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"4");
            }
        }
        else if(e.getSource()==five_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("5");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"5");
            }
        }
        else if(e.getSource()==six_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("6");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"6");
            }
        }
        else if(e.getSource()==one_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("1");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"1");
            }
        }
        else if(e.getSource()==two_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("2");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"2");
            }
        }
        else if(e.getSource()==three_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("3");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"3");
            }
        }
        else if(e.getSource()==dot_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText(".");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+".");
            }
        }
        else if(e.getSource()==zero_button)
        {
            if(isOperatorClicked)
            {
                display_label.setText("0");
                isOperatorClicked = false;
            }
            else
            {
                display_label.setText(display_label.getText()+"0");
            }
        }
        else if(e.getSource()==equals_button)
        {
            if(addClicked==true)
            {
                String newValue = display_label.getText();
                float oldValueF = Float.parseFloat(oldValue);
                float newValueF = Float.parseFloat(newValue);
                float result = oldValueF + newValueF;
                display_label.setText(result+"");
            }
            else if(minClicked==true)
            {
                String newValue = display_label.getText();
                float oldValueF = Float.parseFloat(oldValue);
                float newValueF = Float.parseFloat(newValue);
                float result = oldValueF - newValueF;
                display_label.setText(result+"");
            }
            else if(mulClicked==true)
            {
                String newValue = display_label.getText();
                float oldValueF = Float.parseFloat(oldValue);
                float newValueF = Float.parseFloat(newValue);
                float result = oldValueF * newValueF;
                display_label.setText(result+"");
            }
            else if(divClicked==true)
            {
                String newValue = display_label.getText();
                float oldValueF = Float.parseFloat(oldValue);
                float newValueF = Float.parseFloat(newValue);
                if(newValueF==0)
                {
                    display_label.setText("ERR");
                }
                else
                {
                float result = oldValueF / newValueF;
                display_label.setText(result+"");
                }
            }
           
        }
        else if(e.getSource()==div_button)
        {
            isOperatorClicked = true;
            divClicked = true;
            oldValue = display_label.getText();
        }
        else if(e.getSource()==mul_button)
        {
            isOperatorClicked = true;
            mulClicked = true;
            oldValue = display_label.getText();
        }
        else if(e.getSource()==min_button)
        {
            isOperatorClicked = true;
            minClicked = true;
            oldValue = display_label.getText();
        }
        else if(e.getSource()==plus_button)
        {
            isOperatorClicked = true;
            addClicked = true;
            oldValue = display_label.getText();
        }
        else if(e.getSource()==clear_button)
        {
            display_label.setText("");
            isOperatorClicked = false;
            addClicked = false;
            minClicked = false;
            mulClicked = false;
            divClicked = false;
        }
        
    } 

}