import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class VideoPoker extends JPanel implements ActionListener{
    private HandUI hand;
    private Deck deck;
    private Hand h;
    private Rules rules;
    private JButton betButton;
    private JButton discardButton;
    private JLabel Bank;
    private int bet = 0;
    private int bank = 1000;

    public VideoPoker(){
        
        discardButton = new JButton("Discard");
        
        setLayout(new BorderLayout());
        Bank = new JLabel("                                    Bank is currently: " + "" + bank);
        rules = new Rules();
        add(rules, BorderLayout.NORTH);
        deck = new Deck();
        h = new Hand();
        for(int i = 0; i < 5; i++) h.addCard(deck.draw());
        hand = new HandUI(h, deck);
        
        betButton = new JButton("    Bet    ");
        betButton.addActionListener(this);
        discardButton.addActionListener(this);
        add(Bank, BorderLayout.CENTER);
        add(betButton, BorderLayout.WEST);
        
        
    }
    public void actionPerformed(ActionEvent event){
            
       // boolean betValid = false;
        if(event.getSource() == betButton){
            if(bank < 15) {
                JOptionPane.showMessageDialog(this, "Invalid funds"); 
                System.exit(0);
            }
            bet = 0;
            bet = Integer.parseInt(JOptionPane.showInputDialog("please enter bet"));
            if(bet >= 15 && bet <= 500 && bet <= bank) {
				hand.setCardsVisible();	
				add(hand, BorderLayout.SOUTH);	
                bank -= bet;
                Bank.setText("                                    Bank is currently: " + "" + bank);
                add(discardButton,BorderLayout.EAST);
            }
            else{JOptionPane.showMessageDialog(this,"Must make a legal bet!");}
            
            
                    
        }
        else if(event.getSource() == discardButton) {
            
            for(int i = 0; i < 5; i++) {
                if(hand.cards[i].getBackground() == Color.yellow) {
                    hand.discard(i);
                }
            }
            hand.setCardsVisible();
            if(h.checkWin() > 0) {
                
                int winnings = bet * h.checkWin();
                JOptionPane.showMessageDialog(this, "You won: " + winnings);
                bank += winnings;
                for(int i = 0; i < 5; i++) {
                
                    hand.discard(i);
                
                }
                
            }
            else if(h.checkWin() == 0) {
                JOptionPane.showMessageDialog(this, "You lost: " + bet);
                for(int i = 0; i < 5; i++) {
                
                    hand.discard(i);
                
                }
                
            }
            
            Bank.setText("                                    Bank is currently: " + "" + bank);
            //JOptionPane.showMessageDialog(this, "Your ending balance: " + bank);
            //System.exit(0);
            

            
        }

		
    }
}


