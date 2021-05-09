import java.util.*;
public class Solution {	

public static int pairSum(int[] arr, int num){
Arrays.sort(arr);
int numPair=0;
int SI=0;
int EI=arr.length-1;
while(SI<EI){
if(arr[SI]+arr[EI]<num){
SI++;
}
else if(arr[SI]+arr[EI]>num){
EI--;
}else{
int elementAtStart = arr[SI];
int elementAtEnd=arr[EI];
if(elementAtStart==elementAtEnd){
int totalElementsFromStartToEnd = (EI-SI)+1;
numPair+=(totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);
return numPair;
}
int tempSI = SI+1;
int tempEI=EI-1;
while(tempSI<=tempEI && arr[tempSI]==elementAtStart){
tempSI+=1;
}
while(tempEI>=tempSI && arr[tempEI]==elementAtEnd){
tempEI-=1;
}
int totalElementsFromStart = (tempSI-SI);
int totalElementsFromEnd =(EI-tempEI);
    
    numPair+=(totalElementsFromStart*totalElementsFromEnd);

SI=tempSI;
EI=tempEI;
}
}
return numPair;
}
}