import java.util.Scanner;

/**
 * 
 * exercise array
 * @author kshing
 * @version 1.0
 * @date Jan 23, 2020 8:05:13 PM
 * @copyright kshing
 * @remark TODO
 *
 */

public class arrayEx {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		double sum = 0, avg;
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("Enter score of student" + (i+1) + ":");
			scores[i] = input.nextDouble();		
			sum += scores[i];
			
		}
		
		avg = sum / scores.length;
		System.out.println("Sum of scores :" + sum);
		System.out.println("Avg of scores :" + avg);
		
	}

}
