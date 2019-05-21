import java.util.LinkedList;
import java.util.Stack;

public class reverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Hello");
        l.add("How");
        l.add("Are");
        l.add("You");
//        System.out.println(solution(l));
        ListNode lol = new ListNode(1);
        ListNode lol2 = new ListNode(2);
        ListNode lol3 = new ListNode(3);
        ListNode lol4 = new ListNode(4);
        lol.next = lol2;
        lol2.next=lol3;
        lol3.next = lol4;
        System.out.println(nodeSolution(lol));


    }

    //Reverse a linked list using a stack, O(n) time, O(n) space

    static LinkedList<String> solution(LinkedList<String> list) {
        Stack<String> s = new Stack<>();
        LinkedList<String> r = new LinkedList<>();
        for (String item : list) {
            s.push(item);
        }
        for (int i =0; i < list.size(); i++) {
            r.add(s.pop());
        }
        return r;
    }

    static ListNode nodeSolution(ListNode node) {
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node=node.next;
        }
        ListNode pointer = new ListNode(-1);
        node = pointer;
        while(!stack.isEmpty()) {
            node.next=new ListNode(stack.pop().val);;
            node = node.next;
        }
        return pointer.next;
    }







    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            String str="";
            ListNode temp = this;
            while (temp!= null) {
                str += " " +temp.val;
                temp = temp.next;
            }
            return str;
        }
    }
}
