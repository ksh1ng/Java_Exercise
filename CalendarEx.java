/**
 * 
 * Print July of 1997 in calendar for exercising 'for' loop
 * given 1997/7/1(Tue)
 * @author kshing
 * @version 1.0
 * @date Jan 23, 2020 4:26:51 PM
 * @copyright kshing
 * @remark TODO
 *
 */
public class CalendarEx {
	public static void main(String[] args){
		System.out.println("Mon\tTue\tWed\tThur\tFri\tSat\tSun");
		System.out.print("\t");
			
		int dayOfMonth = 31;
		
		for(int i=1; i <= dayOfMonth ; i++) {
			System.out.print(i+"\t");
			
			if((i+1) % 7 == 0){
				System.out.print("\n");
			}
			
		
			
		}
		
		
		
	}
}
