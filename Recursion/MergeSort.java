public class solution {
    
    public static void merge(int arr1[], int arr2[], int arr[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++; 
            }
            else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }while(i==arr1.length && j<arr2.length){
            arr[k]=arr2[j];
            k++;
            j++;
        }while(j==arr2.length && i<arr1.length){
            arr[k]=arr1[i];
            k++;
            i++;
        }
    }	

    public static void mergeSort(int[] input){
        // Write your code here
        if(input.length<=1)
            return;
        int first[]= new int[input.length/2];
        for(int i=0;i<first.length;i++){
            first[i]=input[i];
        }
        int second[]= new int[input.length-first.length];
        int k=0;
        for(int i=first.length;i<input.length;i++){
            second[k]=input[i];
            k++;
        }
        mergeSort(first);
        mergeSort(second);
        merge(first,second,input);
    }
}