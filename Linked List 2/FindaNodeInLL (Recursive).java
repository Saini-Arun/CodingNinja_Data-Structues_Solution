public class Solution {
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
	
        if(head==null || head.next==null){
            return -1;
        }
        if(head.data==n){
            return 0;
        }
        int smallAns = findNodeRec(head.next , n);
        if(smallAns== -1){
            return smallAns;
        }
        else{
        int ans = smallAns+1;
              return ans;
        }
      
	}
}