public class Solution {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp1 = null;
        if(M==0){
            return null;
        }
        if(N==0){
            return head;
        }
        while(temp != null){
            for(int i=1;i<=M;i++){
                if(temp==null)
                    break;
                temp1=temp;
                temp=temp.next;
            }
            for(int i=1;i<=N;i++){
                if(temp==null)
                    break;
                temp=temp.next;
            }
            temp1.next=temp;
        }
        return head;
	}
}