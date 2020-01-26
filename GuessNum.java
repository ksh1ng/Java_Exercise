import java.util.Scanner;

/**
 * 
 * "Guess number" game
 * @author kshing
 * @version 1.0
 * @date Jan 23, 2020 4:57:06 PM
 * @copyright kshing
 * @remark TODO
 *
 */
public class GuessNum {
	public static void main(String[] args){
		//answer number of this game
		//number of times for game over
		final int answer = (int)((Math.random() * 1000) % 101), MaxTimesGuess = 5;
		String luckyIndex = null;
		int guess = 0;
		
		Scanner input = new Scanner(System.in);

		
		for(int count = 1; count <= MaxTimesGuess; count++){
			System.out.println("Plz guess a number(1-100):");
			guess = new Scanner(System.in).nextInt();
			
			if(guess == answer){
				System.out.println("Congradulation! Bingo! (" + count + " times)");
				
				switch(count) {
				case 1:
					luckyIndex = "*****";
					break;
					
				case 2:
					luckyIndex = "****";
					break;
					
				case 3:
					luckyIndex = "***";
					break;
				default:
					luckyIndex = "*";
					
				}
				System.out.println("Lucky index: " + luckyIndex);
				break;	
			}
			else if(guess < answer) {
				System.out.println("Your guess is smaller than answer!");
			}
			else if(guess > answer) {
				System.out.println("Your guess is bigger than answer!");
			}
			
			System.out.println((MaxTimesGuess - count) + "Left!");
		}
		System.out.println("Game Over");
		System.out.println("Answer is:" + answer);
		
	}

}
