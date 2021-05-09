public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
        if(input.length()==1 && input.charAt(0)=='a' ) {
			return true;
		}
		
		if(input.charAt(0) != 'a') {
			return false;
		}
		boolean smallans= false;
		if(input.charAt(0)=='a') {
			if(input.charAt(1)=='a') {
				smallans=checkAB(input.substring(1));
			}else if(input.charAt(1)=='b' && input.charAt(2)=='b') {
                smallans= true;
                if(input.length() >3){
				smallans=checkAB(input.substring(3));
			}
            }
			
		}
		
		return smallans;

	}
}
