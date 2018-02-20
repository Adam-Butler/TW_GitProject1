import java.util.*;

public class Hand{
    
    private List<Card> hand;
    public Hand(){
        
        hand = new ArrayList<Card>(); 
        
    }
    public void addCard(Card c){
        hand.add(c);
    }
    public Card getCard(int index){
        return hand.get(index);
    }
    public void removeCard(int index){
        hand.remove(index);
    }
    public void removeCard(Card c) {
        hand.remove(c);
    }
    public void setCard(int index, Card c) {
        hand.set(index, c);
    }
    public int indexOf(Card c) {
        return hand.indexOf(c);
    }
    public boolean CheckRoyalFlush(){
        int ACount = 0;
        int TenCount = 0;
        int JCount = 0;
        int QCount = 0;
        int KCount = 0;
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i).getValue() == 1){
                ACount++;
            }
            else if(hand.get(i).getValue() == 10){
                TenCount++;
            }
            else if(hand.get(i).getValue() == 11){
                JCount++;
            }
            else if(hand.get(i).getValue() == 12){
                QCount++;
            }
            else{
                KCount++;
            }
        }
        if(CheckFlush() && TenCount==1 && JCount==1 && QCount==1 && KCount==1 && ACount ==1){
            return true;
        }
        return false;
        
    }
    public boolean CheckStraightFlush(){
        if(CheckStraight() && CheckFlush()){
            return true;
        } 
        return false;
    } 
    public boolean CheckFlush(){
        if((hand.get(0).getSuit() == hand.get(1).getSuit()) && (hand.get(1).getSuit() == hand.get(2).getSuit()) && 
           (hand.get(2).getSuit() == hand.get(3).getSuit()) && (hand.get(3).getSuit() == hand.get(4).getSuit())){
               return true;
           }
        return false;   
    }
    public boolean CheckStraight(){
        int ACount = 0;
        int TwoCount = 0;
        int ThreeCount = 0;
        int FourCount = 0;
        int FiveCount = 0;
        int SixCount = 0;
        int SevCount = 0;
        int EightCount = 0;
        int NineCount = 0;
        int TenCount = 0;
        int JCount = 0;
        int QCount = 0;
        int KCount = 0;
        for(int i = 0; i < hand.size();i++){
            if(hand.get(i).getValue() == 1){
                ACount++;
            }
            else if(hand.get(i).getValue() == 2){
                TwoCount++;
            }
            else if(hand.get(i).getValue() == 3){
                ThreeCount++;
            }
            else if(hand.get(i).getValue() == 4){
                FourCount++;
            }
            else if(hand.get(i).getValue() == 5){
                FiveCount++;
            }
            else if(hand.get(i).getValue() == 6){
                SixCount++;
            }
            else if(hand.get(i).getValue() == 7){
                SevCount++;
            }
            else if(hand.get(i).getValue() == 8){
                EightCount++;
            }
            else if(hand.get(i).getValue() == 9){
                NineCount++;
            }
            else if(hand.get(i).getValue() == 10){
                TenCount++;
            }
            else if(hand.get(i).getValue() == 11){
                JCount++;
            }
            else if(hand.get(i).getValue() == 12){
                QCount++;
            }
            else{
                KCount++;
            }
        }
        if(TwoCount==1 && ThreeCount ==1 && FourCount==1 && FiveCount==1 && SixCount==1){
            return true;
        } 
        else if(ThreeCount==1 && FourCount==1 && FiveCount==1 && SixCount==1 && SevCount==1){
            return true;
        }
        else if(FourCount==1 && FiveCount==1 && SixCount==1 && SevCount==1 && EightCount==1){
            return true;
        }
        else if(FiveCount==1 && SixCount==1 && SevCount==1 && EightCount==1 && NineCount==1){
            return true;
        }
        else if(SixCount==1 && SevCount==1 && EightCount==1 && NineCount==1 && TenCount==1){
            return true;
        }
        else if(SevCount==1 && EightCount==1 && NineCount==1 && TenCount==1 && JCount==1){
            return true;
        }
        else if(EightCount ==1 && NineCount==1 && TenCount==1 && JCount==1 && QCount==1){
            return true;
        }
        else if(NineCount==1 && TenCount==1 && JCount==1 && QCount==1 && KCount==1){
            return true;
        }
        else if(TenCount==1 && JCount==1 && QCount==1 && KCount==1 && ACount==1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean CheckFourOfKind(){
        int ACount = 0;
        int TwoCount = 0;
        int ThreeCount = 0;
        int FourCount = 0;
        int FiveCount = 0;
        int SixCount = 0;
        int SevCount = 0;
        int EightCount = 0;
        int NineCount = 0;
        int TenCount = 0;
        int JCount = 0;
        int QCount = 0;
        int KCount = 0;
        for(int i = 0; i < hand.size();i++){
            if(hand.get(i).getValue() == 1){
                ACount++;
            }
            else if(hand.get(i).getValue() == 2){
                TwoCount++;
            }
            else if(hand.get(i).getValue() == 3){
                ThreeCount++;
            }
            else if(hand.get(i).getValue() == 4){
                FourCount++;
            }
            else if(hand.get(i).getValue() == 5){
                FiveCount++;
            }
            else if(hand.get(i).getValue() == 6){
                SixCount++;
            }
            else if(hand.get(i).getValue() == 7){
                SevCount++;
            }
            else if(hand.get(i).getValue() == 8){
                EightCount++;
            }
            else if(hand.get(i).getValue() == 9){
                NineCount++;
            }
            else if(hand.get(i).getValue() == 10){
                TenCount++;
            }
            else if(hand.get(i).getValue() == 11){
                JCount++;
            }
            else if(hand.get(i).getValue() == 12){
                QCount++;
            }
            else{
                KCount++;
            }
        }
        if(ACount==4 || TwoCount==4 || ThreeCount==4 || FourCount==4 || FiveCount==4 || SixCount==4 || SevCount==4 ||
           EightCount==4 || NineCount==4 || TenCount==4 || JCount==4 || QCount==4 || KCount==4){
               return true;
           }
           
        return false;
        
    }
    public boolean CheckFullHouse(){
        int ACount = 0;
        int TwoCount = 0;
        int ThreeCount = 0;
        int FourCount = 0;
        int FiveCount = 0;
        int SixCount = 0;
        int SevCount = 0;
        int EightCount = 0;
        int NineCount = 0;
        int TenCount = 0;
        int JCount = 0;
        int QCount = 0;
        int KCount = 0;
        for(int i = 0; i < hand.size();i++){
            if(hand.get(i).getValue() == 1){
                ACount++;
            }
            else if(hand.get(i).getValue() == 2){
                TwoCount++;
            }
            else if(hand.get(i).getValue() == 3){
                ThreeCount++;
            }
            else if(hand.get(i).getValue() == 4){
                FourCount++;
            }
            else if(hand.get(i).getValue() == 5){
                FiveCount++;
            }
            else if(hand.get(i).getValue() == 6){
                SixCount++;
            }
            else if(hand.get(i).getValue() == 7){
                SevCount++;
            }
            else if(hand.get(i).getValue() == 8){
                EightCount++;
            }
            else if(hand.get(i).getValue() == 9){
                NineCount++;
            }
            else if(hand.get(i).getValue() == 10){
                TenCount++;
            }
            else if(hand.get(i).getValue() == 11){
                JCount++;
            }
            else if(hand.get(i).getValue() == 12){
                QCount++;
            }
            else{
                KCount++;
            }
        }
        if((ACount == 3 && TwoCount == 2) || (ACount == 3 && ThreeCount == 2)||(ACount == 3 && FourCount == 2) || 
           (ACount == 3 && FiveCount == 2) || (ACount == 3 && SixCount == 2)||(ACount==3 && SevCount == 2) || 
           (ACount==3 && EightCount == 2) || (ACount==3 && NineCount==2) || (ACount==3 && TenCount==2) || (ACount==3 && JCount==2)||
           (ACount==3&& QCount==2) || (ACount==3 && KCount==2)){
            return true;
        }
        else if((TwoCount==3 && ACount==2)||(TwoCount == 3 && ThreeCount == 2)||(TwoCount == 3 && FourCount == 2) || 
           (TwoCount == 3 && FiveCount == 2) || (TwoCount == 3 && SixCount == 2)||(TwoCount==3 && SevCount == 2) || 
           (TwoCount==3 && EightCount==2) || (TwoCount==3&&NineCount==2)||(TwoCount==3 && TenCount==2) || (TwoCount==3 && JCount==2)||
           (TwoCount==3 && QCount==2) || (TwoCount==3 && KCount==2)){
            return true;   
        }
        else if((ThreeCount==3 && ACount == 2)||(ThreeCount==3 && TwoCount==2)||(ThreeCount == 3 && FourCount == 2) || 
           (ThreeCount == 3 && FiveCount == 2) || (ThreeCount == 3 && SixCount == 2)||(ThreeCount==3 && SevCount == 2) ||
           (ThreeCount==3 && EightCount==2) || (ThreeCount==3 && NineCount==2) || (ThreeCount==3 && TenCount==2)||
           (ThreeCount==3 && JCount==2)||(ThreeCount==3 && QCount==2)||(ThreeCount==3 && KCount==2)){
               return true;
        }
        else if((FourCount==3 && ACount==2)||(FourCount==3 && TwoCount==2)||(FourCount==3 && ThreeCount==2)||
           (FourCount == 3 && FiveCount == 2) || (FourCount == 3 && SixCount == 2)||
           (FourCount==3 && SevCount == 2) ||(FourCount==3 && EightCount==2) || (FourCount==3 && NineCount==2) || 
           (FourCount==3 && TenCount==2)||(FourCount==3 && JCount==2)||(FourCount==3 && QCount==2)||(FourCount==3 && KCount==2)){
            return true;   
        }
        else if((FiveCount==3 && ACount==2)||(FiveCount==3 && TwoCount==2)||(FiveCount==3 && ThreeCount==2)||
           (FiveCount == 3 && FourCount == 2) || (FiveCount == 3 && SixCount == 2)||
           (FiveCount==3 && SevCount == 2) ||(FiveCount==3 && EightCount==2) || (FiveCount==3 && NineCount==2) || 
           (FiveCount==3 && TenCount==2)||(FiveCount==3 && JCount==2)||(FiveCount==3 && QCount==2)||(FiveCount==3 && KCount==2)){
            return true;   
        }
        else if((SixCount==3 && ACount==2)||(SixCount==3 && TwoCount==2)||(SixCount==3 && ThreeCount==2)||
           (SixCount == 3 && FourCount == 2) || (SixCount == 3 && FiveCount == 2)||
           (SixCount==3 && SevCount == 2) ||(SixCount==3 && EightCount==2) || (SixCount==3 && NineCount==2) || 
           (SixCount==3 && TenCount==2)||(SixCount==3 && JCount==2)||(SixCount==3 && QCount==2)||(SixCount==3 && KCount==2)){
            return true;   
        }
        else if((SevCount==3 && ACount==2)||(SevCount==3 && TwoCount==2)||(SevCount==3 && ThreeCount==2)||
           (SevCount == 3 && FourCount == 2) || (SevCount == 3 && FiveCount == 2)||
           (SevCount==3 && SixCount == 2) ||(SevCount==3 && EightCount==2) || (SevCount==3 && NineCount==2) || 
           (SevCount==3 && TenCount==2)||(SevCount==3 && JCount==2)||(SevCount==3 && QCount==2)||(SevCount==3 && KCount==2)){
            return true;   
        }
        else if((SevCount==3 && ACount==2)||(SevCount==3 && TwoCount==2)||(SevCount==3 && ThreeCount==2)||
           (SevCount == 3 && FourCount == 2) || (SevCount == 3 && FiveCount == 2)||
           (SevCount==3 && SixCount == 2) ||(SevCount==3 && EightCount==2) || (SevCount==3 && NineCount==2) || 
           (SevCount==3 && TenCount==2)||(SevCount==3 && JCount==2)||(SevCount==3 && QCount==2)||(SevCount==3 && KCount==2)){
            return true;   
        }
        else if((EightCount==3 && ACount==2)||(EightCount==3 && TwoCount==2)||(EightCount==3 && ThreeCount==2)||
           (EightCount == 3 && FourCount == 2) || (EightCount == 3 && FiveCount == 2)||
           (EightCount==3 && SixCount == 2) ||(EightCount==3 && SevCount==2) || (EightCount==3 && NineCount==2) || 
           (EightCount==3 && TenCount==2)||(EightCount==3 && JCount==2)||(EightCount==3 && QCount==2)||(EightCount==3 && KCount==2)){
            return true;   
        }
        else if((NineCount==3 && ACount==2)||(NineCount==3 && TwoCount==2)||(NineCount==3 && ThreeCount==2)||
           (NineCount == 3 && FourCount == 2) || (NineCount == 3 && FiveCount == 2)||
           (NineCount==3 && SixCount == 2) ||(NineCount==3 && SevCount==2) || (NineCount==3 && EightCount==2) || 
           (NineCount==3&& TenCount==2)||(NineCount==3 && JCount==2)||(NineCount==3 && QCount==2)||(NineCount==3 && KCount==2)){
            return true;   
        }
        else if((TenCount==3 && ACount==2)||(TenCount==3 && TwoCount==2)||(TenCount==3 && ThreeCount==2)||
           (TenCount == 3 && FourCount == 2) || (TenCount == 3 && FiveCount == 2)||
           (TenCount==3 && SixCount == 2) ||(TenCount==3 && SevCount==2) || (TenCount==3 && EightCount==2) || 
           (TenCount==3 && NineCount==2)||(TenCount==3 && JCount==2)||(TenCount==3 && QCount==2)||(TenCount==3 && KCount==2)){
            return true;   
        }
        else if((JCount==3 && ACount==2)||(JCount==3 && TwoCount==2)||(JCount==3 && ThreeCount==2)||
           (JCount == 3 && FourCount == 2) || (JCount == 3 && FiveCount == 2)||
           (JCount==3 && SixCount == 2) ||(JCount==3 && SevCount==2) || (JCount==3 && EightCount==2) || 
           (JCount==3 && NineCount==2)||(JCount==3 && TenCount==2)||(JCount==3 && QCount==2)||(JCount==3 && KCount==2)){
            return true;   
        }
        else if((QCount==3 && ACount==2)||(QCount==3 && TwoCount==2)||(QCount==3 && ThreeCount==2)||
           (QCount == 3 && FourCount == 2) || (QCount == 3 && FiveCount == 2)||
           (QCount==3 && SixCount == 2) ||(QCount==3 && SevCount==2) || (QCount==3 && EightCount==2) || 
           (QCount==3 && NineCount==2)||(QCount==3 && TenCount==2)||(QCount==3 && JCount==2)||(QCount==3 && KCount==2)){
            return true;   
        }
        else if((KCount==3 && ACount==2)||(KCount==3 && TwoCount==2)||(KCount==3 && ThreeCount==2)||
           (KCount == 3 && FourCount == 2) || (KCount == 3 && FiveCount == 2)||
           (KCount==3 && SixCount == 2) ||(KCount==3 && SevCount==2) || (KCount==3 && EightCount==2) || 
           (KCount==3 && NineCount==2)||(KCount==3 && TenCount==2)||(KCount==3 && JCount==2)||(KCount==3 && QCount==2)){
            return true;   
        }
        else{
            return false;
        }
    }
    public boolean CheckThreeOfKind(){
        int ACount = 0;
        int TwoCount = 0;
        int ThreeCount = 0;
        int FourCount = 0;
        int FiveCount = 0;
        int SixCount = 0;
        int SevCount = 0;
        int EightCount = 0;
        int NineCount = 0;
        int TenCount = 0;
        int JCount = 0;
        int QCount = 0;
        int KCount = 0;
        for(int i = 0; i < hand.size();i++){
            if(hand.get(i).getValue() == 1){
                ACount++;
            }
            else if(hand.get(i).getValue() == 2){
                TwoCount++;
            }
            else if(hand.get(i).getValue() == 3){
                ThreeCount++;
            }
            else if(hand.get(i).getValue() == 4){
                FourCount++;
            }
            else if(hand.get(i).getValue() == 5){
                FiveCount++;
            }
            else if(hand.get(i).getValue() == 6){
                SixCount++;
            }
            else if(hand.get(i).getValue() == 7){
                SevCount++;
            }
            else if(hand.get(i).getValue() == 8){
                EightCount++;
            }
            else if(hand.get(i).getValue() == 9){
                NineCount++;
            }
            else if(hand.get(i).getValue() == 10){
                TenCount++;
            }
            else if(hand.get(i).getValue() == 11){
                JCount++;
            }
            else if(hand.get(i).getValue() == 12){
                QCount++;
            }
            else{
                KCount++;
            }
        }
        if(ACount==3 || TwoCount==3 || ThreeCount==3 || FourCount==3 || FiveCount==3 || SixCount==3 || SevCount==3 ||
           EightCount==3 || NineCount==3 || TenCount==3 || JCount==3 || QCount==3 || KCount==3){
               return true;
           }
           
        return false;
    }
    public boolean CheckTwoPair(){
        int ACount = 0;
        int TwoCount = 0;
        int ThreeCount = 0;
        int FourCount = 0;
        int FiveCount = 0;
        int SixCount = 0;
        int SevCount = 0;
        int EightCount = 0;
        int NineCount = 0;
        int TenCount = 0;
        int JCount = 0;
        int QCount = 0;
        int KCount = 0;
        for(int i = 0; i < hand.size();i++){
            if(hand.get(i).getValue() == 1){
                ACount++;
            }
            else if(hand.get(i).getValue() == 2){
                TwoCount++;
            }
            else if(hand.get(i).getValue() == 3){
                ThreeCount++;
            }
            else if(hand.get(i).getValue() == 4){
                FourCount++;
            }
            else if(hand.get(i).getValue() == 5){
                FiveCount++;
            }
            else if(hand.get(i).getValue() == 6){
                SixCount++;
            }
            else if(hand.get(i).getValue() == 7){
                SevCount++;
            }
            else if(hand.get(i).getValue() == 8){
                EightCount++;
            }
            else if(hand.get(i).getValue() == 9){
                NineCount++;
            }
            else if(hand.get(i).getValue() == 10){
                TenCount++;
            }
            else if(hand.get(i).getValue() == 11){
                JCount++;
            }
            else if(hand.get(i).getValue() == 12){
                QCount++;
            }
            else{
                KCount++;
            }
        }
        if((ACount == 2 && TwoCount == 2) || (ACount == 2 && ThreeCount == 2)||(ACount == 2 && FourCount == 2) || 
           (ACount == 2 && FiveCount == 2) || (ACount == 2 && SixCount == 2)||(ACount==2 && SevCount == 2) || 
           (ACount==2 && EightCount == 2) || (ACount==2 && NineCount==2) || (ACount==2 && TenCount==2) || (ACount==2 && JCount==2)||
           (ACount==2 && QCount==2) || (ACount==2 && KCount==2)){
            return true;
        }
        else if((TwoCount==2 && ACount==2)||(TwoCount == 2 && ThreeCount == 2)||(TwoCount == 2 && FourCount == 2) || 
           (TwoCount == 2 && FiveCount == 2) || (TwoCount == 2 && SixCount == 2)||(TwoCount==2 && SevCount == 2) || 
           (TwoCount==2 && EightCount==2) || (TwoCount==2&&NineCount==2)||(TwoCount==2 && TenCount==2) || (TwoCount==2 && JCount==2)||
           (TwoCount==2 && QCount==2) || (TwoCount==2 && KCount==2)){
            return true;   
        }
        else if((ThreeCount==2 && ACount == 2)||(ThreeCount==2 && TwoCount==2)||(ThreeCount == 2 && FourCount == 2) || 
           (ThreeCount == 2 && FiveCount == 2) || (ThreeCount == 2 && SixCount == 2)||(ThreeCount==2 && SevCount == 2) ||
           (ThreeCount==2 && EightCount==2) || (ThreeCount==2 && NineCount==2) || (ThreeCount==2 && TenCount==2)||
           (ThreeCount==2 && JCount==2)||(ThreeCount==2 && QCount==2)||(ThreeCount==2 && KCount==2)){
               return true;
        }
        else if((FourCount==2 && ACount==2)||(FourCount==2 && TwoCount==2)||(FourCount==2 && ThreeCount==2)||
           (FourCount == 2 && FiveCount == 2) || (FourCount == 2 && SixCount == 2)||
           (FourCount==2 && SevCount == 2) ||(FourCount==2 && EightCount==2) || (FourCount==2 && NineCount==2) || 
           (FourCount==2 && TenCount==2)||(FourCount==2 && JCount==2)||(FourCount==2 && QCount==2)||(FourCount==2 && KCount==2)){
            return true;   
        }
        else if((FiveCount==2 && ACount==2)||(FiveCount==2 && TwoCount==2)||(FiveCount==2 && ThreeCount==2)||
           (FiveCount == 2 && FourCount == 2) || (FiveCount == 2 && SixCount == 2)||
           (FiveCount==2 && SevCount == 2) ||(FiveCount==2 && EightCount==2) || (FiveCount==2 && NineCount==2) || 
           (FiveCount==2 && TenCount==2)||(FiveCount==2 && JCount==2)||(FiveCount==2 && QCount==2)||(FiveCount==2 && KCount==2)){
            return true;   
        }
        else if((SixCount==2 && ACount==2)||(SixCount==2 && TwoCount==2)||(SixCount==2 && ThreeCount==2)||
           (SixCount == 2 && FourCount == 2) || (SixCount == 2 && FiveCount == 2)||
           (SixCount==2 && SevCount == 2) ||(SixCount==2 && EightCount==2) || (SixCount==2 && NineCount==2) || 
           (SixCount==2 && TenCount==2)||(SixCount==2 && JCount==2)||(SixCount==2 && QCount==2)||(SixCount==2 && KCount==2)){
            return true;   
        }
        else if((SevCount==2 && ACount==2)||(SevCount==2 && TwoCount==2)||(SevCount==2 && ThreeCount==2)||
           (SevCount == 2 && FourCount == 2) || (SevCount == 2 && FiveCount == 2)||
           (SevCount==2 && SixCount == 2) ||(SevCount==2 && EightCount==2) || (SevCount==2 && NineCount==2) || 
           (SevCount==2 && TenCount==2)||(SevCount==2 && JCount==2)||(SevCount==2 && QCount==2)||(SevCount==2 && KCount==2)){
            return true;   
        }
        else if((SevCount==2 && ACount==2)||(SevCount==2 && TwoCount==2)||(SevCount==2 && ThreeCount==2)||
           (SevCount == 2 && FourCount == 2) || (SevCount == 2 && FiveCount == 2)||
           (SevCount==2 && SixCount == 2) ||(SevCount==2 && EightCount==2) || (SevCount==2 && NineCount==2) || 
           (SevCount==2 && TenCount==2)||(SevCount==2 && JCount==2)||(SevCount==2 && QCount==2)||(SevCount==2 && KCount==2)){
            return true;   
        }
        else if((EightCount==2 && ACount==2)||(EightCount==2 && TwoCount==2)||(EightCount==2 && ThreeCount==2)||
           (EightCount == 2 && FourCount == 2) || (EightCount == 2 && FiveCount == 2)||
           (EightCount==2 && SixCount == 2) ||(EightCount==2 && SevCount==2) || (EightCount==2 && NineCount==2) || 
           (EightCount==2 && TenCount==2)||(EightCount==2 && JCount==2)||(EightCount==2 && QCount==2)||(EightCount==2 && KCount==2)){
            return true;   
        }
        else if((NineCount==2 && ACount==2)||(NineCount==2 && TwoCount==2)||(NineCount==2 && ThreeCount==2)||
           (NineCount == 2 && FourCount == 2) || (NineCount == 2 && FiveCount == 2)||
           (NineCount==2 && SixCount == 2) ||(NineCount==2 && SevCount==2) || (NineCount==2 && EightCount==2) || 
           (NineCount==2 && TenCount==2)||(NineCount==2 && JCount==2)||(NineCount==2 && QCount==2)||(NineCount==2 && KCount==2)){
            return true;   
        }
        else if((TenCount==2 && ACount==2)||(TenCount==2 && TwoCount==2)||(TenCount==2 && ThreeCount==2)||
           (TenCount == 2 && FourCount == 2) || (TenCount == 2 && FiveCount == 2)||
           (TenCount==2 && SixCount == 2) ||(TenCount==2 && SevCount==2) || (TenCount==2 && EightCount==2) || 
           (TenCount==2 && NineCount==2)||(TenCount==2 && JCount==2)||(TenCount==2 && QCount==2)||(TenCount==2 && KCount==2)){
            return true;   
        }
        else if((JCount==2 && ACount==2)||(JCount==2 && TwoCount==2)||(JCount==2 && ThreeCount==2)||
           (JCount == 2 && FourCount == 2) || (JCount == 2 && FiveCount == 2)||
           (JCount==2 && SixCount == 2) ||(JCount==2 && SevCount==2) || (JCount==2 && EightCount==2) || 
           (JCount==2 && NineCount==2)||(JCount==2 && TenCount==2)||(JCount==2 && QCount==2)||(JCount==2 && KCount==2)){
            return true;   
        }
        else if((QCount==2 && ACount==2)||(QCount==2 && TwoCount==2)||(QCount==2 && ThreeCount==2)||
           (QCount == 2 && FourCount == 2) || (QCount == 2 && FiveCount == 2)||
           (QCount==2 && SixCount == 2) ||(QCount==2 && SevCount==2) || (QCount==2 && EightCount==2) || 
           (QCount==2 && NineCount==2)||(QCount==2 && TenCount==2)||(QCount==2 && JCount==2)||(QCount==2 && KCount==2)){
            return true;   
        }
        else if((KCount==2 && ACount==2)||(KCount==2 && TwoCount==2)||(KCount==2 && ThreeCount==2)||
           (KCount == 2 && FourCount == 2) || (KCount == 2 && FiveCount == 2)||
           (KCount==2 && SixCount == 2) ||(KCount==2 && SevCount==2) || (KCount==2 && EightCount==2) || 
           (KCount==2 && NineCount==2)||(KCount==2 && TenCount==2)||(KCount==2 && JCount==2)||(KCount==2 && QCount==2)){
            return true;   
        }
        else{
            return false;
        }
        
    }
    public boolean CheckPairOfJacks(){
        int JCount = 0;
        int ACount =0;
        int QCount=0;
        int KCount=0;
        for(int i = 0; i < hand.size();i++){
            if(hand.get(i).getValue() == 11){
                JCount++;
            }
            else if(hand.get(i).getValue()==12){
                QCount++;
            }
            else if(hand.get(i).getValue()==13){
                KCount++;
            }
            else if(hand.get(i).getValue()==1){
                ACount++;
            }
            
            
        }
        if((JCount == 2) || (ACount==2) || (KCount==2) || (QCount==2)){
            return true;
        }
        return false;
    }
    public int checkWin() {
        int multiplier = 0;
        if(CheckRoyalFlush()) multiplier = 800;
        else if(CheckStraightFlush()) multiplier = 50;
        else if(CheckFourOfKind()) multiplier = 25;
        else if(CheckFullHouse()) multiplier = 9;
        else if(CheckFlush()) multiplier = 6;
        else if(CheckStraight()) multiplier = 4;
        else if(CheckThreeOfKind()) multiplier = 3;
        else if(CheckTwoPair()) multiplier = 2;
        else if(CheckPairOfJacks()) multiplier = 1;
        return multiplier;
    }
   
}