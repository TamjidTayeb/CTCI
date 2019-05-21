public class Stack {
    private String[] array;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.top = 0;
        this.array=new String[size];
    }

    public boolean isEmpty() {
        if (top==0) return true;
        else return false;
    }

    public void push(String str) {
        if (top<size) {
            array[top] = str;
            top++;
        } else {
            System.out.println("STACK OVERFLOW!");
        }
    }

    public String pop() {
        if (this.isEmpty()) {
            return null;
        } else {
            top--;
            String r = array[top];
            array[top]=null;
            return r;
        }
    }

    public String peek() {
        if (this.isEmpty()) return null;
        else return array[top-1];
    }

    public static void main(String[] args) {
        Stack s = new Stack(4);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.push("1");
        System.out.println(s.peek());
        s.push("2");
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.push("3");
        s.push("4");
        s.push("5?");
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
