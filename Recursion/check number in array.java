public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
	
		if (input[0]==x) {
			return true;
		}
		if(input.length<=1) {
			return false;
		}
		int Smallarr[]=new int[input.length-1];
		for (int i=1;i<input.length;i++) {
			Smallarr[i-1]=input[i];
		} 
		boolean b=checkNumber(Smallarr,x);
		return b;
	}
}