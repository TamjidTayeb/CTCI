import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue<T> {
    public class QueueNode<T> {
       T value;
       QueueNode<T> next;

       public QueueNode(T value) { this.value = value;}
    }

    QueueNode<T> first;
    QueueNode<T> last;

    public void add(T val) {
        QueueNode<T> node = new QueueNode<>(val);
        if (first == null) first=last=node;
        else {
            last.next=node;
            last=node;
        }
    }

    public T remove() {
        if (first==null) throw new NoSuchElementException();
        else {
            T val = first.value;
            first = first.next;
            return val;
        }
    }

    public static void main(String[] args) {
//        Queue<Integer> q= new PriorityQueue<Integer>();
        MyQueue<Integer> q = new MyQueue<>();
        int[] arr = {1,2,3,4};
        for(int i : arr) q.add(i);
        q.remove();
        q.remove();
    }

}
