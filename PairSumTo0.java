import java.util.*;
import java.util.HashMap;
public class Solution {
	public static int PairSum(int[] input, int size) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result=0;
        for(int i=0;i<input.length;i++){
            int key=input[i];
            if(map.containsKey(key)){
                int value=map.get(key);
                map.put(key,value+1);
            }else{
                map.put(key,1);
            }
        }
        
        for(int i=0;i<input.length;i++){
            int key=input[i];
            if(map.containsKey(-key) && map.get(key)!=0){
                int times;
                if(key==(-key)){
                    int occurence=map.get(key);
                    times=occurence*(occurence-1)/2;
                    result=result+times;
                    map.put(key,0);
                    continue;
                }
                
                times=map.get(key) * map.get(-key);
                result=result+times;
                map.put(key,0);
                map.put(-key,0);
            }
        }
        return result;
    }
}
