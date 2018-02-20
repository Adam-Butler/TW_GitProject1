import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class VideoPokerMain extends JPanel{
    public static void main(String[] args){
        JFrame poker = new JFrame();
        poker.add(new VideoPoker());
        poker.setSize(500, 500); 
        poker.setLocationRelativeTo(null); 
        poker.setTitle("Video Poker");
        poker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        poker.setVisible(true);
    }
}