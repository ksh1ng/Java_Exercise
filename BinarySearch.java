import java.util.Scanner;

/**
 * 
 * Implement binary search given a sorted array
 * Further implement deleting searched number in the array
 * @author kshing
 * @version 1.0
 * @date Jan 24, 2020 11:39:33 AM
 * @copyright kshing
 * @remark TODO
 *
 */
public class BinarySearch {
	public static void main(String[] args){
		//Principle
		//compare the targeted key with middle element in array
		//1.If key < middle element, continue to search in first half elements
		//2.If key == middle element, return
		//3.If key > middle element, continue to search in last half elements
		Scanner input = new Scanner(System.in);
		int[] array = {12, 15, 35, 45, 67, 78, 89};
		System.out.print("Please enter a number you want to find:");
		int searchNum = input.nextInt();
		
		boolean isFind = false;
		int low = 0, high = array.length, mid;
		int deleteIndex = 0;
		
		while(high >= low && !isFind) {
			mid = (low + high) / 2;
			
			if(searchNum < array[mid]) { //1.If key < middle element, continue to search in first half elements
				high = mid - 1;
			}
			else if(searchNum > array[mid]) { //3.If key > middle element, continue to search in last half elements
				low = mid + 1;
			}
			else { //2.If key == middle element, return
				deleteIndex = mid;
				System.out.println(searchNum + " is at index = " + mid);
				isFind = true;
			}
		}
		if(!isFind || deleteIndex == -1) {
			System.out.println(searchNum + " is non-existing in this array");
			
		}
		
		//delete searchNum
		//1.given the deleteIndex from previous search procedure e.g., deleteIndex = i
		//2.Starting from i, sequentially overwrite previous values with later values
		//   i.e., nums[i] = nums[i+1]
		//3.Let nums.length = nums.length - 1
		for(int i = deleteIndex; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
		
		
		//print result
		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		
		
		
	}
}
