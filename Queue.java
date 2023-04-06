import java.util.NoSuchElementException;

/*Linear DS for storing data
 * insertion done at one end(rear) and deletion at the front
 * first element inserted os the first one to be deleted hence called FIFO list
 * 
 * Initial stage front & rear = null
 * use ENQUEUE operation for insertion 
 * use DEQEUE operation for deletion
 */
public class Queue {
    /*create instance variables front rear & length of Q */
    private ListNode front;
    private ListNode rear;
    private int length;
    
    public Queue(){
        this.front = null;
        this.rear = null;           
        this.length = 0;
    }
    /* implement inner class ListNode */
    private class ListNode{
        private int data;
        private ListNode next;
    /* create a contructor which takes the data part*/
        public ListNode(int data){
            this.data = data;
            this.data=data;
            this.next=null;
        }
    }
    /*create this method to return the length of Q  */
    public int length(){
        return length;
    }
    /*boolean method to determine if the Q is empty or not */
public boolean isEmpty(){
    return length == 0;
}
/*insertion */
public void enqueue(int data){
    ListNode temp = new ListNode(data);/*implement temp list node */
    if(isEmpty()){
        front =temp;
    /* if empty front and rear all null */
    }
    else{ /* if not then rear will be temp */
        rear.next=temp;
    }
    rear = temp;
    length++;
}
/* again we check if the Q is empty after insertion */
public void print(){
    if(isEmpty()){
        return;
    }
    /*if not empty to print the elements on the console */
    ListNode current = front;
    while(current != null){
        System.out.print(current.data + " -> " );
        current = current.next;
    }           
    System.out.println("null");

}
/*deletion, return type is int for dq */
public int dequeue(){
    if(isEmpty()){
        /*check if Q empty */
       /*if empty throw an exception */ 
       throw new NoSuchElementException("Queue empty");

    }
    int result = front.data;
    /*we are removing front data so assign the front value to result */
    front =front.next;
    if(front == null){
        rear = null;
    }
    length--;
    /*since an element/node is removed decrement the length */

    return result;

}
/*first method */
public int first(){
    if(isEmpty()){
        throw new NoSuchElementException("Queue Empty");

    }
    return front.data;
}
public int last(){
    if(isEmpty()){
        throw new NoSuchElementException("Queue Empty");

    }
    return rear.data;
}

    public static void main(String args[]){
        /*create an instance of Q */
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.print();

        /* queue.dequeue();
       
        queue.print(); */
        System.out.println(queue.first());
        System.out.println(queue.last());
    }
    
}
