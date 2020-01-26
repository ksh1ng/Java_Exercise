import java.util.Arrays;

/**
 * 
 * TODO
 * @author kshing
 * @version 1.0
 * @date Jan 23, 2020 10:48:20 PM
 * @copyright kshing
 * @remark TODO
 *
 */
public class Sort {
	public static void main(String[] args){
		final int N = 10000;
		int[] nums = new int[N], nums2 = new int[N], nums3 = new int[N];
		double startTime, endTime;
	
		//Initialize targeted array(nums, nums2) for sorting 
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 1000) % 100000;
			nums2[i] = nums[i];
			nums3[i] = nums[i];
		}

		//Bubble sort
		//when length of nums is N, we need to sort (N-1) times, \
		//we need to compare (N-i-1) times between two adjacent number in (i)th sorting time
		int tmp;
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < nums.length - 1; i++){
			for (int j = 0; j < (nums.length - i - 1); j++) {
				if(nums[j] < nums[j+1]) {
					tmp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		endTime = System.currentTimeMillis();
		
		//print result
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();
		System.out.println("Spending time for bubble sort:" + (endTime - startTime) + " ms");

		
		
		
		
		
	
		
		//Selection sort
		//in each loop, exchange value of nums[i] and nums[minIndex]
		int tmp2, minIndex, minValue;
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < nums2.length; i++) {
			//Assume minimum value is (i)th value in num
			minIndex = i;
			minValue = nums2[i];
			
			for (int j = i + 1; j < nums2.length; j++) {
				if(minValue > nums2[j]) {
					minIndex = j;
					minValue = nums2[j];
				}
				//exchange value of nums[i] and nums[minIndex]
				tmp2 = nums2[minIndex];
				nums2[minIndex] = nums2[i];
				nums2[i] = tmp2;
			}
		}
		endTime = System.currentTimeMillis();
		
		//print result
				for(int i = 0; i < nums.length; i++) {
					System.out.print(nums[i] + ", ");
				}
				System.out.println();
				System.out.println("Spending time for selection sort:" + (endTime - startTime) + " ms");
				
				
		//java built-in sort method
		
		startTime = System.currentTimeMillis();
		Arrays.sort(nums3);
		endTime = System.currentTimeMillis();
		System.out.println("Spending time for built-in sort:" + (endTime - startTime) + " ms");
		
		
		
				
		
	}
	

}
