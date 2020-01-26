/**
 * 
 * Generate fib. series with given length of series
 * @author kshing
 * @version 1.0
 * @date Jan 23, 2020 8:17:43 PM
 * @copyright kshing
 * @remark TODO
 *
 */
public class fibonacci {
	public static void main(String[] args){
		//0,1,1,2,3,5,8,....
		final int LengthOfSeries = 100;
		int[] nums = new int[LengthOfSeries];
		
		//initial first two number in series
		nums[0] = 0;
		nums[1] = 1;
		
		for(int i = 2; i < nums.length; i++) {
			nums[i] = nums[i-1] + nums[i-2];
		}
		
		//print result
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
	}
}
