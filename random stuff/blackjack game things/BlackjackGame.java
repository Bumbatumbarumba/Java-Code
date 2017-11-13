/*Created by Bartosz Kosakowski
* 09/01/17
* Blackjack game
*/
//-=-=-=-=-=-imports-=-=-=-=-=-
import java.util.Scanner;
import java.util.Random;


//-=-=-=-=-=-BlackjackGame main class and method-=-=-=-=-=-
public class BlackjackGame{
	public static void main (String [] args){
	Cards [] deck = new Cards[13];

	}//end of main method

	public void handGenerator(){
		Random randNum = new Random();
	}//end of handGenerator method
}//end of BlackjackGame


//-=-=-=-=-=-Cards enum-=-=-=-=-=-
enum Cards{
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}//end of Cards enum


//-=-=-=-=-=-start of PlayerHand class-=-=-=-=-=-
class PlayerHand{
	String playerHand;
	boolean hasAce = false;
	int cardSum;
	int currentCardValue;

	public PlayerHand(Cards card1, Cards card2){
		this.playerHand = "" + card1 + " " + card2;
	}

	public int cardValues(Cards card){
		switch(card){
			case ACE: 	currentCardValue = 1; //CHANGE THIS TO PROPERLY REFLECT HOW ACES WORK
			break;
			case TWO:	currentCardValue = 2;
			break;
			case THREE:	currentCardValue = 3;
			break;
			case FOUR:	currentCardValue = 4;
			break;
			case FIVE:	currentCardValue = 5;
			break;
			case SIX: 	currentCardValue = 6;
			break;
			case SEVEN:	currentCardValue = 7;
			break;
			case EIGHT:	currentCardValue = 8;
			break;
			case NINE:	currentCardValue = 9;
			break;
			case TEN:
			case JACK:
			case QUEEN:
			case KING:	currentCardValue = 10;
			break;
		}
		return currentCardValue;
	}//end of cardVaues method

	public void checkAce(Cards card){
		if (this.hasAce == true){
		}
	}//end of checkAce method
}//end of PlayerHand class