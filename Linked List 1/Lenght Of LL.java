public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        LinkedListNode<Integer> temp=head;
        int length=0;
        while(temp !=null){
            temp=temp.next;
            length++;
        }
        return length;
	}
}