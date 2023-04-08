public class LL {

    private Node head;
    private Node tail;
    private int length;

   /*create node */
    class Node{
        int value;
        Node next;
    
    /*constructor  */
    Node(int value){
        this.value = value;
    }
}
    
     
     public LL(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
     }
     /*temp is created to traverse along the 
     list it traverses if the 
     value is not null and gets updated */
     public void printList(){
        Node temp = head;        
        while( temp != null){
            System.out.println(temp.value);
            temp =  temp.next;
        }
        
     }
     public void getHead(){
        System.out.println("Head : "+ head.value);
     }
     public void getTail(){
        System.out.println("Tail : "+ tail.value);
     }
     public void getlength(){
        System.out.println("Length : "+ length);
     }
     public void append(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail =newNode;
        }
        length++;
     }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre= temp;
            temp = temp.next;
        }
        tail = pre;
        temp.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;

    }
    /**
     * @param args
     */
    public static void main(String args[]){
        LL myLL = new LL(4);
        myLL.append(2);
        System.out.println(myLL.removeLast().value);
        myLL.getHead();
        myLL.getTail();
        myLL.getlength();

        myLL.printList();
    }

}