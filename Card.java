public class Card {
    public enum Suit {HEART, DIAMOND, CLUB, SPADE};
    private Suit suit;
    private int value;
    private boolean isClicked = false;

    
    public Card(Suit s, int v) {
        suit = s;
        value = v;
    }

    public Card(String str) {
        char v = str.charAt(0);
        char s = str.charAt(1);
        if(v == 'A') value = 1;
        else if(v == '2') value = 2;
        else if(v == '3') value = 3;
        else if(v == '4') value = 4;
        else if(v == '5') value = 5;
        else if(v == '6') value = 6;
        else if(v == '7') value = 7;
        else if(v == '8') value = 8;
        else if(v == '9') value = 9;
        else if(v == 'X') value = 10;
        else if(v == 'J') value = 11;
        else if(v == 'Q') value = 12;
        else if(v == 'K') value = 13;
        if(s == 'S') suit = Suit.SPADE;
        else if(s == 'D') suit = Suit.DIAMOND;
        else if(s == 'C') suit = Suit.CLUB;
        else if(s == 'H') suit = Suit.HEART;        
    }
    
    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void clickCard() {
        isClicked = true;
    }
    public boolean getClicked() {
        return isClicked;
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card)) return false;
        if(obj == this) return true;
        Card rhs = (Card) obj;
        return suit == rhs.suit && value == rhs.value;
    }
    
    public String toString() {
        String s = "";
        if(value == 1) s += "A";
        else if(value == 2) s += "2";
        else if(value == 3) s += "3";
        else if(value == 4) s += "4";
        else if(value == 5) s += "5";
        else if(value == 6) s += "6";
        else if(value == 7) s += "7";
        else if(value == 8) s += "8";
        else if(value == 9) s += "9";
        else if(value == 10) s += "X";
        else if(value == 11) s += "J";
        else if(value == 12) s += "Q";
        else if(value == 13) s += "K";
        if(suit == Suit.SPADE) s += "S";
        else if(suit == Suit.DIAMOND) s += "D";
        else if(suit == Suit.CLUB) s += "C";
        else if(suit == Suit.HEART) s += "H";
        return s;
    }
}

