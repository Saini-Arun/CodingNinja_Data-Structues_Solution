
public class Solution {  
    
    	public static void rotate(int[] arr,int d) {
		
		
		int[] temp=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}                                      // O(n)
		for(int i=d;i<arr.length;i++) {
			arr[i-d]=arr[i];
		}
		int k=0;
		for(int i=arr.length-d;i<arr.length;i++) {
			arr[i]=temp[k++];
		}
		
	}

    

}