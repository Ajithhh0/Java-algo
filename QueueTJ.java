import java.util.NoSuchElementException;

public class QueueTJ{
    private ListNode front;
    private ListNode rear;
    private int length;
    

/**
 * 
 */
public QueueTJ(){
    this.front = null;
    this.rear = null;
    this.length = 0;
}
private class ListNode{
        private int data;
        private ListNode next;
        
            public ListNode(int data){
            this.data = data;
            this.next = null;
            
                
            }
            
            
}
public int length() {
   return length;
    
}
public boolean isEmpty(){
    return length == 0;
    
}
public void enqueue(int data){
    ListNode temp = new ListNode(data);
    if (isEmpty()){
        front = temp;
    }
    else{
        rear.next=temp;
    }
    rear =temp;
    length++;
}
public void print(){
    if (isEmpty()){
        return;
    }
    ListNode current =front;
    while(current != null){
        System.out.println(current.data+ " ");
        current = current.next;
    }
    System.out.println("null");
}
public int dequeue(){
    if(isEmpty()){
        /*check if Q empty */
       /*if empty throw an exception */ 
       throw new NoSuchElementException("Queue empty");

    }
    int result = front.data;
    
    front =front.next;
    if(front == null){
        rear = null;
    }
    length--;
    

    return result;

}
public static void main(String args[]){
    QueueTJ queue = new QueueTJ();
    queue.enqueue(10);
    queue.enqueue(12);
    queue.enqueue(13);

    queue.dequeue();
    
    queue.print();
    
}
}