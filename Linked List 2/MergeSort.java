public class Solution {
    
    	public static LinkedListNode<Integer> returnMiddleIndex(LinkedListNode<Integer> head) {
	        
	        LinkedListNode<Integer> slow = head;
	        LinkedListNode<Integer> fast = head;
	        LinkedListNode<Integer> ans = head;
	        if(slow.next==null){
	            return slow;
	        }
	        while(fast != null){
	            if(fast.next == null){
	                return slow;
	            }
	            ans=slow;
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return ans;
	    }
    
    	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> Head1, LinkedListNode<Integer> Head2) {

        LinkedListNode<Integer> head1 = Head1;
        LinkedListNode<Integer> head2 = Head2;
        LinkedListNode<Integer> lastnode = Head1;
        LinkedListNode<Integer> finalHead = Head1;
        int i=0;
        while(head1 != null || head2 != null){
            if(i==0){
                if(head1.data<=head2.data){
                    lastnode=head1;
                    finalHead=head1;
                    head1=head1.next;
                    i++;
            }else if(i==0){
                    lastnode=head2;
                    finalHead=head2;
                    head2=head2.next;
                    i++;
                }
            }
            if(head1==null) {
            	break;
            }
            if(head2==null) {
            	break;
            }
            if(head1.data<=head2.data){
                lastnode.next=head1;
                    lastnode=head1;
                    head1=head1.next;
            }else{
                lastnode.next=head2;
                    lastnode=head2;
                    head2=head2.next;
                }
        }
        
        if(head1==null){
            while(head2 != null){
                lastnode.next=head2;
                lastnode=head2;
                head2=head2.next;
            }
        }
        if(head2==null){
            while(head1 != null){
                lastnode.next=head1;
                lastnode=head1;
                head1=head1.next;
            }
        }
        
		return finalHead;
	}


	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		// write your code here
        if(head==null || head.next==null){
            return head;
        }
        
        LinkedListNode<Integer> temp = returnMiddleIndex(head);
        LinkedListNode<Integer> secondHead = temp.next;
        temp.next =null;
        LinkedListNode<Integer> head1 = mergeSort(head);
        LinkedListNode<Integer> head2 = mergeSort(secondHead);
        LinkedListNode<Integer> newHead = mergeTwoList(head1, head2);
        
        return newHead;
	}

}