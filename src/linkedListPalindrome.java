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

        Stack<reverseLinkedList.ListNode> stack = new Stack<>();

        reverseLinkedList.ListNode copy = n;

        while (copy!= null) {
            stack.push(copy);
            copy= copy.next;
        }

        while(!stack.isEmpty()) {
            if (stack.pop().val!=n.val) return false;
            n = n.next;
        }
        return true;
    }


}
