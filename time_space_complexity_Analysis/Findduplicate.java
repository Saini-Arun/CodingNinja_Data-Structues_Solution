public class Solution{	

	public static int findDuplicate(int[] arr) {
		int sum=0;
		int sumN=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(i!=arr.length-1) {
			sumN+=i;			
		}
		}
		return (sum-sumN);
	}
}