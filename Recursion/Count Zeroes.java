
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        		if (input>=0 && input<9) {
			return 0;
		}
		int ans= countZerosRec(input/10);
		if (input%10==0) {
			ans+=1;
			return ans;
		}		
		return ans;
	}
}
