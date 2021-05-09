
public class Solution {
    	public static int partition(int[] input, int sI, int eI) {
		int countsmaller=0;
		
		int pivotelement=input[sI];
		for(int i=sI+1;i<=eI;i++) {
			if(input[i]<=pivotelement) {
				countsmaller+=1;
			}
		}
		
		int pivotIndex=countsmaller+sI;
		int temp=input[pivotIndex];
		input[pivotIndex]=pivotelement;
		input[sI]=temp;
		
		int i=sI;
		int j=eI;
		while(i<pivotIndex && j>pivotIndex) {

			if(input[i]<=pivotelement) {
				i++;
			}
			else if(input[j]>pivotelement) {				
				j--;
			}else {
			if(i<=j) {
			int temps=input[i];
			input[i]=input[j];
			input[j]=temps;
			i++;
			j--;
		}		
		}
		}
		
		return pivotIndex;
	}
    
    	public static void quicksort(int[] input, int sI, int eI) {
		if(input.length<=1)
            return;
		if(sI<=eI) {		
			int pivotIndex=partition(input,sI,eI);
			quicksort(input,sI,pivotIndex-1);
		    quicksort(input,pivotIndex+1,eI);
		}
			
	}
    
//     	private static int partition(int[] input,int si , int ei)
//     {
//         int count=0;
//         int pivot=input[si];
        
//         for(int i=si+1 ; i<=ei ; i++)
//         {
//             if(input[i]<=pivot)
//             {
//                 count++;
//             }
//         }
        
//         int pivotPos=si+count;
        
//         int temp=input[pivotPos];
//         input[pivotPos]=pivot
//         input[si] = temp;
        
//         int i=si,j=ei;
        
//         while(i<pivotPos && j>pivotPos)
//         {
//             if(input[i]<=input[pivotPos] && input[j]>input[pivotPos])
//             {
//                 i++;
//                 j--;
//             }
//             else if(input[i]<=input[pivotPos])
//             {
//                 i++;
//             }
//             else if(input[j]>input[pivotPos])
//             {
//                 j--;
//             }
//             else
//             {
//                 int t=input[i];
//                 input[i]=input[j];
//                 input[j]=t;
//                 i++;
//                 j--;
//             }
//         }
        
//         return pivotPos;
        
//     }
	
    
//     	public static void quicksort(int[] input, int sI, int eI) {
// 		if(sI>=eI){
//             return;
//         }
        	
// 			int pivotIndex=partition(input,sI,eI);
// 			quicksort(input,sI,pivotIndex-1);
// 		    quicksort(input,pivotIndex+1,eI);
	
			
// 	}
    
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        quicksort(input,0,input.length-1);
        
		
	}
	
}