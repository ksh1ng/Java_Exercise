/**
 * 
 * Calculate sum of even number from 1-100 for exercising "continue" in loop
 * @author kshing
 * @version 1.0
 * @date Jan 23, 2020 5:43:58 PM
 * @copyright kshing
 * @remark TODO
 *
 */
public class SumOfEvenNum {
	public static void main(String[] args){
		int sum = 0;
		
		
		for(int i = 1; i <= 100; i++){
			if(i % 2 != 0){
				continue;
			}
			sum += i;
			
		}
		
//		for(int i = 1; i <= 100; i+=2){
//			if(i % 2 != 0){
//				continue;
//			}
//			sum += i;
//			
//		}
		System.out.print("Sum of even number from 1-100:" + sum);
		
	}

}
