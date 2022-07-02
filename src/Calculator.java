import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener, KeyListener
{
    JPanel window = new JPanel();
    JPanel buttons = new JPanel(new GridLayout(4,5,2,2));
    Container contentPane = getContentPane();

    JLabel lbl = new JLabel("Калькулятор Java");
    JTextArea text = new JTextArea(1, 32);
    Font font = new Font("Serif", Font.BOLD, 36);
    Color background = new Color(151, 197, 205);
    Color nonNumbers = new Color(63, 151, 161);
    
    //Кнопки.
    JButton btn0 = new JButton("0"); JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2"); JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4"); JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6"); JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8"); JButton btn9 = new JButton("9");
    JButton btnNegative = new JButton("-()");  JButton btnDouble = new JButton(",");

    //Операции.
    JButton plus = new JButton("+"); JButton minus = new JButton("-");
    JButton multiply = new JButton("X"); JButton divide = new JButton("÷");
    JButton pow = new JButton("x" + "²") ;

    //Результаты.
    JButton delete = new JButton("⌫"); JButton clear = new JButton("C");
    JButton sum = new JButton("=");

    int num1 = 0;
    int num2 = 0;
    double n1 = 0;
    double n2 = 0;

    int check;
    String counterString = "";

    public Calculator()
    {
        super("Калькулятор Java");
        setSize(400,400);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        window.setBackground(background); buttons.setBackground(background);
        window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));
        window.setBorder(new EmptyBorder(10,10,10,10));
        buttons.setBorder(new EmptyBorder(10,10,10,10));
        text.setFont(font);

        Action beep = text.getActionMap().get(DefaultEditorKit.deletePrevCharAction); //Убирает противный звук при нажатии Backspace.
        beep.setEnabled(false);

        plus.setBackground(nonNumbers); minus.setBackground(nonNumbers);
        multiply.setBackground(nonNumbers); divide.setBackground(nonNumbers);
        clear.setBackground(nonNumbers); delete.setBackground(nonNumbers);
        sum.setBackground(nonNumbers); pow.setBackground(nonNumbers);

        window.add(lbl);
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        window.add(text);
        text.setEditable(false);

        buttons.add(btn7); buttons.add(btn8); buttons.add(btn9);
        buttons.add(clear); buttons.add(delete);

        buttons.add(btn4); buttons.add(btn5); buttons.add(btn6);
        buttons.add(plus); buttons.add(minus);

        buttons.add(btn1); buttons.add(btn2); buttons.add(btn3);
        buttons.add(multiply);  buttons.add(divide);

        buttons.add(btnNegative);  buttons.add(btn0);  buttons.add(btnDouble);
        buttons.add(pow); buttons.add(sum);

        btn0.addActionListener(this); btn1.addActionListener(this);
        btn2.addActionListener(this); btn3.addActionListener(this);
        btn4.addActionListener(this); btn5.addActionListener(this);
        btn6.addActionListener(this); btn7.addActionListener(this);
        btn8.addActionListener(this); btn9.addActionListener(this);
        plus.addActionListener(this); minus.addActionListener(this);
        multiply.addActionListener(this); divide.addActionListener(this);
        pow.addActionListener(this); sum.addActionListener(this);
        delete.addActionListener(this); clear.addActionListener(this);
        btnNegative.addActionListener(this); btnDouble.addActionListener(this);

        btn0.setFocusable(false); btn1.setFocusable(false);
        btn2.setFocusable(false); btn3.setFocusable(false);
        btn4.setFocusable(false); btn5.setFocusable(false);
        btn6.setFocusable(false); btn7.setFocusable(false);
        btn8.setFocusable(false); btn9.setFocusable(false);
        plus.setFocusable(false); minus.setFocusable(false);
        multiply.setFocusable(false); divide.setFocusable(false);
        pow.setFocusable(false); sum.setFocusable(false);
        delete.setFocusable(false); clear.setFocusable(false);
        btnNegative.setFocusable(false); btnDouble.setFocusable(false);

        text.addKeyListener(this);
        contentPane.add("North", window);
        contentPane.add("Center", buttons);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == btn0 )
        {if(check == 5){text.setText("0"); counterString = text.getText(); check = 0;} else{text.append("0"); counterString = text.getText();}}
        if (event.getSource() == btn1 )
        {if(check == 5){text.setText("1"); counterString = text.getText(); check = 0;} else {text.append("1"); counterString = text.getText();}}
        if (event.getSource() == btn2 )
        {if(check == 5){text.setText("2"); counterString = text.getText(); check = 0;} else {text.append("2"); counterString = text.getText();}}
        if (event.getSource() == btn3 )
        {if(check == 5){text.setText("3"); counterString = text.getText(); check = 0;} else {text.append("3"); counterString = text.getText();}}
        if (event.getSource() == btn4 )
        {if(check == 5){text.setText("4"); counterString = text.getText(); check = 0;} else {text.append("4"); counterString = text.getText();}}
        if (event.getSource() == btn5 )
        {if(check == 5){text.setText("5"); counterString = text.getText(); check = 0;} else {text.append("5"); counterString = text.getText();}}
        if (event.getSource() == btn6 )
        {if(check == 5){text.setText("6"); counterString = text.getText(); check = 0;} else {text.append("6"); counterString = text.getText();}}
        if (event.getSource() == btn7 )
        {if(check == 5){text.setText("7"); counterString = text.getText(); check = 0;} else {text.append("7"); counterString = text.getText();}}
        if (event.getSource() == btn8 )
        {if(check == 5){text.setText("8"); counterString = text.getText(); check = 0;} else {text.append("8"); counterString = text.getText();}}
        if (event.getSource() == btn9 )
        {if(check == 5){text.setText("9"); counterString = text.getText(); check = 0;} else {text.append("9"); counterString = text.getText();}}

        if (event.getSource() == delete)
        {
            if(!counterString.isEmpty() && check != 5)
            {counterString = counterString.substring(0,(counterString.length() - 1)) ; text.setText(counterString); check = 0; }
        }
        if (event.getSource() == clear )
        {text.setText(""); num1 = 0 ; num2 = 0 ; counterString = "" ; check = 0; }

        if (event.getSource() == btnNegative && !counterString.isEmpty() )
        {
            if(counterString.contains("-"))
            {counterString = counterString.substring(1) ;}
            else counterString = ("-" + text.getText()); text.setText(counterString);
        }
        if (event.getSource() == btnDouble && (!counterString.isEmpty()))
        { counterString = (text.getText() + "."); text.setText(counterString); }
        if ((event.getSource() == plus) && (!counterString.isEmpty()))
        {
            if (counterString.contains("."))
            {n1 += Double.parseDouble(counterString); counterString = ""; text.setText(""); check = 1 ;}
            else
            {num1 += Integer.parseInt(counterString); counterString = ""; text.setText(""); check = 1 ; }
        }
        if ((event.getSource() == minus) && (!counterString.isEmpty()))
        {
            if (counterString.contains("."))
            {n1 += Double.parseDouble(counterString); counterString = ""; text.setText(""); check = 2 ;}
            else
            {num1 += Integer.parseInt(counterString); counterString = ""; text.setText(""); check = 2 ;}
        }
        if ((event.getSource() == multiply) && (!counterString.isEmpty()))
        {
            if (counterString.contains("."))
            {n1 += Double.parseDouble(counterString); counterString = ""; text.setText(""); check = 3 ;}
            else
            {num1 += Integer.parseInt(counterString); counterString = ""; text.setText(""); check = 3 ;}
        }
        if ((event.getSource() == divide) && (!counterString.isEmpty()))
        {
            if (counterString.contains("."))
            {n1 += Double.parseDouble(counterString); counterString = ""; text.setText(""); check = 4 ;}
            else
            {num1 += Integer.parseInt(counterString); counterString = ""; text.setText(""); check = 4 ;}
        }
        if ((event.getSource() == pow) && (!counterString.isEmpty()))
        {
            if (counterString.contains("."))
            {n1 += Math.pow((Double.parseDouble(counterString)),2); text.setText(counterString = String.valueOf(n1)); n1 = 0 ; }
            else
            {num1 += Math.pow((Integer.parseInt(counterString)),2); text.setText(counterString = String.valueOf(num1)); num1 = 0 ;}
        }

        if (event.getSource() == sum && !counterString.isEmpty() )
        {
            if(!counterString.contains(".")) num2 += Integer.parseInt(counterString);
            else n2 += Double.parseDouble(counterString);

            if (check == 1 && num1 != 0 && num2 != 0) {counterString = String.valueOf(num1 + num2) ;}
            else if(check == 1 && n1 != 0 && n2 != 0) {counterString = String.valueOf(n1 + n2) ;}
            else if(check == 1 && num1 != 0 && n2 != 0) {n1 = num1; counterString = String.valueOf(n1 + n2) ;}
            else if(check == 1 && n1 != 0 && num2 != 0) {n2 = num2; counterString = String.valueOf(n1 + n2) ;}

            if (check == 2 && num1 != 0 && num2 != 0) {counterString = String.valueOf(num1 - num2) ;}
            else if(check == 2 && n1 != 0 && n2 != 0) {counterString = String.valueOf(n1 - n2) ;}
            else if(check == 2 && num1 != 0 && n2 != 0) {n1 = num1; counterString = String.valueOf(n1 - n2) ;}
            else if(check == 2 && n1 != 0 && num2 != 0) {n2 = num2; counterString = String.valueOf(n1 - n2) ;}

            if (check == 3 && num1 != 0 && num2 != 0) {counterString = String.valueOf(num1 * num2) ;}
            else if(check == 3 && n1 != 0 && n2 != 0){counterString = String.valueOf(n1 * n2) ;}
            else if(check == 3 && num1 != 0 && n2 != 0) {n1 = num1; counterString = String.valueOf(n1 * n2) ;}
            else if(check == 3 && n1 != 0 && num2 != 0) {n2 = num2; counterString = String.valueOf(n1 * n2) ;}

            if (check == 4 && num1 != 0 && n2 == 0)
            {
                if(num2 != 0)
                {
                    if(num1 % num2 != 0 ) {n1 = num1; n2 = num2 ; counterString = String.valueOf(n1 / n2) ;}
                    else counterString = String.valueOf(num1 / num2);
                }

                else {JOptionPane.showMessageDialog(this,"На 0 делить нельзя!", "Внимание!", JOptionPane.WARNING_MESSAGE); }
            }
            else if(check == 4 && n1 != 0 && num2 == 0)
            { if(n2 != 0) counterString = String.valueOf(n1 / n2) ;
            else{JOptionPane.showMessageDialog(this,"На 0 делить нельзя!", "Внимание!", JOptionPane.WARNING_MESSAGE); }}
            else if(check == 4 && num1 != 0 && n2 != 0){n1 = num1; counterString = String.valueOf(n1 / n2) ;}
            else if(check == 4 && n1 != 0) {n2 = num2; counterString = String.valueOf(n1 / n2) ;}

            if (counterString.contains(".0")) {counterString = counterString.substring(0,(counterString.length() - 2)) ; text.setText(counterString);}
            else text.setText(counterString);

            num1 = 0 ; num2 = 0 ; n1 = 0 ; n2 = 0; check = 5;
        }
    }
    public void keyTyped(KeyEvent e)
    {}
    public void keyPressed(KeyEvent e)
    {

        if (e.getKeyCode() == 96 ) btn0.doClick(); if (e.getKeyCode() == 97 ) btn1.doClick();
        if (e.getKeyCode() == 98 ) btn2.doClick(); if (e.getKeyCode() == 99 ) btn3.doClick();
        if (e.getKeyCode() == 100 ) btn4.doClick(); if (e.getKeyCode() == 101 ) btn5.doClick();
        if (e.getKeyCode() == 102 ) btn6.doClick(); if (e.getKeyCode() == 103 ) btn7.doClick();
        if (e.getKeyCode() == 104 ) btn8.doClick(); if (e.getKeyCode() == 105 ) btn9.doClick();

        if (e.getKeyCode() == 107 ) plus.doClick(); if (e.getKeyCode() == 109 ) minus.doClick();
        if (e.getKeyCode() == 106 ) multiply.doClick(); if (e.getKeyCode() == 111 ) divide.doClick();
        if (e.getKeyCode() == 8 ) delete.doClick(); if (e.getKeyCode() == 27 ) clear.doClick();
        if (e.getKeyCode() == 10 ) sum.doClick(); if (e.getKeyCode() == 110 ) btnDouble.doClick();
    }
    public void keyReleased(KeyEvent e)
    {  }

    public static void main(String[] args)
    { Calculator app = new Calculator(); }
}