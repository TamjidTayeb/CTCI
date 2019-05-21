import java.util.Stack;

public class linkedListPalindrome {
    public static void main(String[] args) {
        reverseLinkedList.ListNode lol = new reverseLinkedList.ListNode(1);
        reverseLinkedList.ListNode lol2 = new reverseLinkedList.ListNode(2);
        reverseLinkedList.ListNode lol3 = new reverseLinkedList.ListNode(1);
        reverseLinkedList.ListNode lol4 = new reverseLinkedList.ListNode(1);
        lol.next = lol2;
        lol2.next=lol3;
        lol3.next = lol4;
        System.out.println(solution(lol));
    }

    static boolean solution(reverseLinkedList.ListNode n) {
        Stack<reverseLinkedList.ListNode> s = new Stack();

        while(n!=null) {
            s.push(n);
            n=n.next;
        }

        int start=0;
        int end = s.size()-1;

        while(start<end) {
            if (s.get(start).val!=s.get(end).val) return false;
            start++;
            end--;
        }
        return true;
    }


}
