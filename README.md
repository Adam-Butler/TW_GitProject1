# VideoPoker
The program in this repo contains a fairly basic Video Poker game. It contains the rules for winning, an organized GUI for making bets and discarding cards, and a bank to keep up with the funds.  
## Classes
- **Card.java**: This class sets up the basic card layout for Poker.	A Card object is made up of a number/letter and a suit(Heart, Diamond, Club, Spade). The class also contains functions that allow the program to get the suit and value of a card, as well as giving a Card object a string representation.
- **Deck.java**: This class creates a Deck object that is an array of 52 Card Objects. The Deck class contains a function for "shuffling" the deck and "drawing" a card from the top.
- **Hand.java**: This class represents 5 cards in the player's hand. It allows for the removal of a card from the hand, the addition of a card from the deck, and getting the index of any card in the hand. The class also contains every possible win condition for a Hand, starting with the minimum win of a pair of jacks, and a maximum win of a royal flush, along with the multiplier for the bet made.
- **HandUI.java**: This class gives the user a UI for the Hand object. Each card is represented by a label with the card's value and suit. For example, the user will see this on their game: 8S KC 2S XD AH .	Respectively, the hand is an 8 of Spades, King of Clubs, 2 of Spades, 10 of Diamonds, and Ace of Hearts. The UI also puts a border around each Card when the mouse hovers over them, as well as a colored background so that the user knows which cards are actually selected for discarding purposes, which is also handled by this class.
- **Rules.java**: This class is comprised entirely of Lables that contain the win conditions, the win multipliers, and the rules for gameplay.
- **VideoPoker.java**: This class is the most important as it makes the game work. It adds all of the needed GUI items to user's game window, such as the rules, the hand, the bet button, and the discard button. It also contains the way for the user to make a bet, show his/her bank total, and calculate the winnings/losses. 
- **VideoPokerMain.java**: This class runs the program. It creates the frame that the game "sits" on, as well frame size, frame title, and frame visibility.
## Contributers
- Thomas Eyler
- Zebulon Cunningham
- David Jordan
### What I Learned
This project was one of the first group assignments i had in college. This allowed me to development my communication and teamwork skills. The project was also the first time I had to start completely from scratch, with little starting input from my instructor. I feel like this was one my earliest major successes.
#### Bugs
The game is not perfect. The user has to play according to instructions for it to work properly, so he/she has to make a bet, then pick cards to discard, and then make a new bet. 
