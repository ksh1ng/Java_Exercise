/**
 * 
 * TODO
 * @author kshing
 * @version 1.0
 * @date Jan 23, 2020 8:50:08 PM
 * @copyright kshing
 * @remark TODO
 *
 */
public class ShuffleCards {
	public static void main(String[] args){
		final int N = 52;
		int[] cards = new int[N];
		String[] cardColors = {"spade", "heart", "diamond", "club"};
		String[] cardValues = {
				"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K"
		};
		
		//initialize cards (before shuffling)
		for(int i = 0; i < 52; i++) {
			cards[i] = i;
		}
		
		System.out.println("Before shuffling:");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				System.out.printf("%6s-%s", cardColors[cards[i * 13 + j] / 13], cardValues[cards[i * 13 + j] % 13]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//Perform shuffling
		for(int i = 0; i < 52; i++) {
			int newIndex = (int)(Math.random() * 1000) % 52; 
			//change index
			int tmp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = tmp;
		}
		
		
		System.out.println("Before shuffling:");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				System.out.printf("%6s-%s", cardColors[cards[i * 13 + j] / 13], cardValues[cards[i * 13 + j] % 13]);
				System.out.print("\t");
				
			}
			System.out.println();
		}	
	}
}
