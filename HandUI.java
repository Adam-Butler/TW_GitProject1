import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class HandUI extends JPanel implements MouseListener{
    private Hand hand; 
    private Deck deck;
    public JLabel[] cards;
    public HandUI(Hand h, Deck d){
        hand = h;
        deck = d;
        setLayout(new FlowLayout());
        cards = new JLabel[5];
        for(int j =0; j< 5;j++){
            cards[j] = new JLabel();
            cards[j].setText(hand.getCard(j).toString());
            cards[j].setBackground(Color.black);
            cards[j].setForeground(Color.black);
            cards[j].setOpaque(true);
            add(cards[j]);
            cards[j].addMouseListener(this);
        }	
    }
	public void setCardsVisible(){
		for(int i = 0; i < 5; i++){
			cards[i].setOpaque(false); 
		}
	}
	
    private int findSourceIndex(MouseEvent event) {
        for(int i = 0; i < cards.length; i++) {
            if(cards[i] == event.getSource()) return i;
        }
        return -1;
    }
    public void discard(int index) {
            String cardStr = cards[index].getText();
            Card c = new Card(cardStr);
            int hindex = hand.indexOf(c);
            cards[index].setBackground(Color.black);
            Card n = deck.draw();
            hand.setCard(hindex, n);
            cards[index].setText(n.toString());
    }
    public void mouseClicked(MouseEvent event) {
        
        int index = findSourceIndex(event);
        
        if(cards[index].getBackground() == Color.black) {
            cards[index].setBackground(Color.yellow);
            cards[index].setOpaque(true);
        }
        else if(cards[index].getBackground() == Color.yellow) {
            cards[index].setBackground(Color.black);
            cards[index].setOpaque(false);
        }
    }    
    public void mousePressed(MouseEvent event) {}
    public void mouseReleased(MouseEvent event) {}
    public void mouseEntered(MouseEvent event) {
        
        JLabel label = (JLabel)event.getSource();
        label.setBorder(BorderFactory.createLineBorder(Color.RED));
    }
    public void mouseExited(MouseEvent event) {
        JLabel label = (JLabel)event.getSource();
		label.setBorder(null);
    }   
}