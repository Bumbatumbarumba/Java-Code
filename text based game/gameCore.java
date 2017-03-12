import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//=-=-=-=-=-=-=-=-=THIS SECTION IS THE MAIN METHOD AND WHATNOT=-=-=-=-=-=-=-=-=
public class gameCore{
	static int inMainMenu = 1; //determines if user is in main menu
	static int inHTPMenu = 0; //determines if user is in how to play menu
	static int inCLMenu = 0; //determines if user is in command list menu
	static int inGame = 0;
	public static void main (String [] args){
		Scanner keyboardIn = new Scanner(System.in);
		//runs main menu screen
		while (inMainMenu == 1){
			MainMenuText();
			System.out.print("Please enter a number:");
			int userInt = keyboardIn.nextInt();
			SelectionInterpreter(userInt);
		}//end of menu screen
		System.out.println("=================================");
		System.out.println("You are in a forest...");
		//start of game
		while (inMainMenu == 0){
			System.out.print(">");
			String playerCommands = keyboardIn.next();
			TextParser(playerCommands);
		}

	}//end of main method


	//=-=-=-=-=-=-=-=-=THIS SECTION IS FUNCTIONS THAT OUTPUT MENUS=-=-=-=-=-=-=-=-=
	//method that creates the main menu text; call it for main menu to appear
	public static void MainMenuText(){
		System.out.println(">>>>>>>>>>TEXT BASED GAME<<<<<<<<<<");
		System.out.println("             1.Start");
		System.out.println("          2.How to play");
		System.out.println("          3.Command list");
		System.out.println("             4.Exit");
	}//end of MainMenuText method
	//creates how to play menu
	public static void HTPText(){
		int htp = 1;
		System.out.println("=================================");
		System.out.println("        HOW TO PLAY");
		System.out.println("You must interact with the world");
		System.out.println("by typing in a command for your");
		System.out.println("character to perform (eg, 'move ");
		System.out.println("forward'. If I'm not an idiot, it");
		System.out.println("shouldn't be case sensitive. You");
		System.out.println("must spell the word correctly though");
		System.out.println("TYPE 'BACK' to return");
		System.out.print(">");
		Scanner keyboardIn = new Scanner(System.in);
		//checks if user exited out or not
		while (htp == 1){
			String back = keyboardIn.next();
			back = back.toLowerCase();
			if (back.equals("back")){
				htp = 0;
				//inMainMenu = 1;
			}
			else{
				System.out.println("=================================");
				System.out.println("I don't understand, try again:");
				System.out.print(">");
			}
		}
	}//end of HTPText


	//=-=-=-=-=-=-=-=-=THIS SECTION IS FUNCTIONS THAT COMPUTE SHIT=-=-=-=-=-=-=-=-=
	//takes an int representing the main menu selection the player made
	//and determines which screen should come up next
	public static void SelectionInterpreter(int selection){
		//if user chooses to play
		if (selection == 1){
			System.out.println("=================================");
			System.out.println("Starting the game...");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			inMainMenu = 0;
		}
		//if user want to know how to play
		else if (selection == 2){
			HTPText();
		}
		//if user wants to see a command list
		else if (selection == 3){
			System.out.println("you want to see the list of commands!");
			inMainMenu = 1;
		}
		//if user wants to exit the game
		else if (selection == 4){
			System.out.println("you want to exit!");
			System.out.println("----Goodbye!----");
			System.exit(0);
		}
		//the user typed in nonsense
		else{
			System.out.println("7");
		}
	}//end of SelectionInterpreter method

	//this method takes the user input and tries to interpret what to do
	public static void TextParser(String userInput){
		String[] splitInput = userInput.split(" ");
		splitInput = MakeLowerCaseList(splitInput);
		String[] movementVerbs = {
								"go", "move", "walk", "step", "relocate", "turn", "translate", "strafe",
								"crawl", "tip-toe", "slither", "hobble", "limp", "strut", "stumble", "run",
								"sprint", "bolt", "journey", "retreat", "travel"
								};
		String[] directions = {"up", "down", "left", "right", "forward", "forwards", "backward", "backward"};

		ArrayList<String> movementList = new ArrayList<String>(Arrays.asList(movementVerbs));
		ArrayList<String> directionsList = new ArrayList<String>(Arrays.asList(directions));

		if (movementList.contains(splitInput[0])){
			System.out.println("success");
		}
		else{
			System.out.println("eeeeeeeeeee");
			System.exit(0);
		}
		
	}

	//converts list of strings into all lower case
	public static String[] MakeLowerCaseList(String[] targetArray){
		String[] myArray = targetArray;
		for (int ctr = 0; ctr < myArray.length; ctr++){
			myArray[ctr] = myArray[ctr].toLowerCase();
		}
		return myArray;
	}



}//end of main core class
