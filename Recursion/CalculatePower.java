public class Solution {

	public static int power(int x, int n) {
		
        if (n==0){
            return 1;
        }else if(n==1) {
			return x;
		}
		else {
		int smallAns=power(x,n-1);
		return x*smallAns;
	}
		
	}
}