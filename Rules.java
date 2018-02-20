import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rules extends JPanel{
    private JLabel rule1;
    private JLabel rule2;
    private JLabel rule3;
    private JLabel rule4;
    private JLabel rule5;
    private JLabel rule6;
    private JLabel rule7;
    private JLabel rule8;
    private JLabel rule9;
    private JLabel rule10;
    private JLabel rule11;
    private JLabel rule12;
    private JLabel rule13;
    
    public Rules(){
        setLayout(new FlowLayout());
        Box box = Box.createVerticalBox();
        add(box);
        rule1 = new JLabel("Hand: Royal Flush                  Multiplier:  800");
        rule2 = new JLabel("Hand: Straight Flush             Multiplier:  50");
        rule3 = new JLabel("Hand: Four of a Kind             Multiplier:  25");
        rule4 = new JLabel("Hand: Full House                    Multiplier:  9");
        rule5 = new JLabel("Hand: Flush                             Multiplier:  6");
        rule6 = new JLabel("Hand: Straight                        Multiplier:  4");
        rule7 = new JLabel("Hand: Three of a Kind           Multiplier:  3");
        rule8 = new JLabel("Hand: Two Pair                       Multiplier:  2");
        rule9 = new JLabel("Hand: Jacks or Better          Multiplier:  1");        
        rule10 = new JLabel("Hand: All Other                       Multiplier:  0"); 
        rule11 = new JLabel("Hit the bet button and place your bet, then"); 
        rule12 = new JLabel("click the cards you wish to discard, and then hit discard.");   
        rule13 = new JLabel("MINIMUM BET: 15        MAXIMUM BET: 500");
        box.add(rule1);
        box.add(rule2);
        box.add(rule3);
        box.add(rule4);
        box.add(rule5);
        box.add(rule6);
        box.add(rule7);
        box.add(rule8);
        box.add(rule9);
        box.add(rule10);         
        box.add(rule11);
        box.add(rule12);
        box.add(rule13);
    }
}