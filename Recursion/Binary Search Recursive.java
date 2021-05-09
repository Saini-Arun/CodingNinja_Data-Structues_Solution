public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
        return binarySearch(input,0,input.length-1,element);		
	}
	public static int binarySearch(int arr[],int start,int end,int num) {
		
		if(start>end){
			return -1;
		}
		int mid=(start + end)/2;
		if(arr[mid]==num) {
			return mid;
		}
		else if(num < arr[mid]) {
			return binarySearch(arr, start, mid-1, num);
		}
		else {
			return binarySearch(arr, mid+1, end, num);
		}

	}
}
