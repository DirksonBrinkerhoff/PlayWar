import java.util.ArrayList;
import java.util.Scanner;
public class PlayWar
	{
		// ArrayLists for player hands
		static ArrayList<Card>playerHand1 = new ArrayList<Card>();
		// ArrayList for second player 
		static ArrayList<Card>playerHand2 = new ArrayList<Card>();
		// Scanner!
		static Scanner userStringInput = new Scanner(System.in);
		// Scanner2!
		static Scanner userIntInput = new Scanner(System.in);
		
		// new variables
		static int player1Total = 0;
		static int player2Total = 0;
		
		// Main method
		public static void main(String[] args)
			{
				Deck.addCards();	
				Deck.shuffle();
				shufflePlayerHands();
				compareCards();
				
			}
		//new comment
		// Shuffle player hand
		public static void shufflePlayerHands()
			{
				// For loop for player hand 1
				for(int i = 0; i < 26; i++)
					{
						playerHand1.add(Deck.deck.get(i));
						//System.out.println(playerHand1.get(i).getRank() + " of " + playerHand1.get(i).getSuit());
					}
				// For loop for player hand 2
				for(int i = 26; i < 52; i++)
					{
						playerHand2.add(Deck.deck.get(i));
						//System.out.println(playerHand2.get(i).getRank() + " of " + playerHand2.get(i).getSuit());
					}
			}

		public static void compareCards()
		{
		for(int i = 0; i < 26; i++)	
			{
			System.out.println("Ready for your next hand?");
			String pause = userStringInput.nextLine();
			System.out.println("Player 1 turns over a " + playerHand1.get(i).getRank() + " of " + playerHand1.get(i).getSuit());
			System.out.println("Player 2 turns over a " + playerHand2.get(i).getRank() + " of " + playerHand2.get(i).getSuit());
			System.out.println();
			//dirk says there are no changes
			
			if(playerHand1.get(i).getValue() > playerHand2.get(i).getValue())
				{
					System.out.println("Player 1 gets Player 2's " + playerHand2.get(i).getRank() + " of " + playerHand2.get(i).getSuit());
					playerHand1.add(playerHand2.get(i));
					player1Total += 2;
				}
			
			else if(playerHand2.get(i).getValue() > playerHand1.get(i).getValue())
				{
					System.out.println("Player 2 gets Player 1's " + playerHand1.get(i).getRank() + " of " + playerHand1.get(i).getSuit());
					playerHand2.add(playerHand1.get(i));
					player2Total += 2;
				}
			else
				{
					i++;
					System.out.println("IT'S A TIE!!! Player 1 and player 2 redraw!!");
					userStringInput.nextLine();
					System.out.println();
					System.out.println("Player 1 turns over a " + playerHand1.get(i).getRank() + " of " + playerHand1.get(i).getSuit());
					System.out.println("Player 2 turns over a " + playerHand2.get(i).getRank() + " of " + playerHand2.get(i).getSuit());
					System.out.println();
					
					if(playerHand1.get(i).getValue() > playerHand2.get(i).getValue())
						{
							System.out.println("Player 1 gets Player 2's " + playerHand2.get(i).getRank() + " of " + playerHand2.get(i).getSuit());
							playerHand1.add(playerHand2.get(i));
							player1Total += 4;
						}
					
					else if(playerHand2.get(i).getValue() > playerHand1.get(i).getValue())
						{
							System.out.println("Player 2 gets Player 1's " + playerHand1.get(i).getRank() + " of " + playerHand1.get(i).getSuit());
							playerHand2.add(playerHand1.get(i));
							player2Total += 4;
						}
					//changes from home day 2
				}
			System.out.println();
			System.out.println("The score: ");
			System.out.println("Player 1: " + player1Total);
			System.out.println("Player 2: " + player2Total);
			}
		}
	}
