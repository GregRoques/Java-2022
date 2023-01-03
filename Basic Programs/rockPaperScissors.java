import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String[] rps = {"r", "p", "s"};
		
			String computerMove = rps[new Random().nextInt(rps.length)];
		
			String playerMove;
		
			while(true) {
				System.out.println("Please enter your move: (r, p, or s)");
				playerMove = scanner.nextLine();
				f(playerMove.toLowerCase().equals("r") || layerMove.toLowerCase().equals("p") || layerMove.toLowerCase().equals("s")) {
					break;
				}
				System.out.println(playerMove + " is not a valid move.");
			}
		
			System.out.println("Computer moved " + computerMove + "\n\n");
			System.out.println("Player moved " + playerMove + "\n\n"));
		
			// tie
			if(playerMove.equals(computerMove)) {
				System.out.println("Game was a tie.");
			}
		
			//rock
			if(PlayerMove.equals("r")) {
				if(computerMove.equals("p")) {
					System.out.println("You Lose.")
				}
				if(computerMove.equals("s")) {
					System.out.println("You Win!")
				}
			}
		
			//paper
			if(PlayerMove.equals("p")) {
				if(computerMove.equals("s")) {
					System.out.println("You Lose.")
				}
				if(computerMove.equals("r")) {
					System.out.println("You Win!")
				}
			}
			
			//scissors
			if(PlayerMove.equals("s")) {
				if(computerMove.equals("r")) {
					System.out.println("You Lose.")
				}
				if(computerMove.equals("p")) {
					System.out.println("You Win!")
				}
			}
			
			System.out.println("\n\nPlay Again? (y/n)");
			String playAgain = scanner.nextLine();
			
			if(!playAgain.toLowerCase().equals("y")) {
				break;
			}
			
			System.out.println("\n\n");
		}
		
		scanner.close();
	}
}