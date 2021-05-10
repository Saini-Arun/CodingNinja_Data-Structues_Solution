public class Solution {

	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> Head1, LinkedListNode<Integer> Head2) {

        LinkedListNode<Integer> head1 = Head1;
        LinkedListNode<Integer> head2 = Head2;
        LinkedListNode<Integer> lastnode = Head1;
        LinkedListNode<Integer> finalHead = Head1;
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
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

}