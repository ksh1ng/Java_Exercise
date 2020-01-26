import java.util.Scanner;

public class CalculateCircleArea {
	 public static void main(String[] args){
		 
		 System.out.print("Enter radius:");
		 Scanner input = new Scanner(System.in); //scanner接收輸入
		 
		 double radius = input.nextDouble(); //將輸入值轉成double
		 System.out.printf("Area = %.2f", 3.14 * radius * radius);
		 
		 
		 
		 
	 }
}
