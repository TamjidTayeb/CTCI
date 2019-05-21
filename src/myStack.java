import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.EmptyStackException;

public class myStack<T> {
   public class StackNode<T> {
       T value;
       StackNode<T> prev;

       public StackNode(T value) { this.value = value;};
    }

   StackNode<T> top;

   public void push(T val) {
       StackNode<T> node = new StackNode<>(val);
       node.prev=top;
       top = node;
   }

   public T pop() {
       T val = this.peek();
       top = top.prev;
       return val;
   }

   public T peek() {
       if (top==null) throw new EmptyStackException();
       return top.value;
   }


    public static void main(String[] args) {
        myStack<Integer> stack = new myStack<>();
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
