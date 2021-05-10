public class Solution {
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> oddHead = null;
        LinkedListNode<Integer> evenHead = null;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> oddtemp = null;
        LinkedListNode<Integer> eventemp = null;
        int i=0;
        int j=0;
        if(head==null || head.next==null){
            return head;
        }
        while(temp != null){
            if(temp.data%2 != 0 && i==0){
                oddHead=temp;
                oddtemp=oddHead;
                i=1;
            }else if(temp.data%2 != 0){
                oddtemp.next=temp;
                oddtemp=temp;
            }else if(temp.data%2 == 0 && j==0){
                evenHead=temp;
                eventemp=evenHead;
                j=1;
            }else if(temp.data%2 == 0){
                eventemp.next=temp;
                eventemp=temp;
            }
            temp=temp.next;
        }
        if(evenHead !=null){
            eventemp.next=null;            
        }
        if(oddHead==null){
            return evenHead;
        }
        oddtemp.next=evenHead;
        return oddHead;

	}
}