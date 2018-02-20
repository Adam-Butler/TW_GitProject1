import java.util.*;
public class Deck{
    private Card[] deck;
    private int count;
    private int cardsUsed;
    public Deck(){
        String suits = "HSCD";
        String values = "23456789XJQKA";
        int cardCt = 0;
        count = 0;
        deck= new Card[52];
        for(int i =0;i < suits.length();i++){
            for(int j = 0; j < values.length(); j++){
                
                deck[cardCt] = new Card(Character.toString(values.charAt(j)) + Character.toString(suits.charAt(i))) ;
                cardCt++;
            }
        }
            
        
        shuffle();
        cardsUsed=0;
        
      
    }
    public Card draw(){
        return deck[count++];
    }
    public void shuffle(){
        for(int i = deck.length-1;i > 0; i--){
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }
}