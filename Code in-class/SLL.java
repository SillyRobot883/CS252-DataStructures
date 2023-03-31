class Node<T>{
    private T data;
    private Node<T> next;


    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    

    
    //do the setter and getter here for this class HM 21-3-2023
    
}

class LinkedList <T>{
    Node<T> head;
    int size;
    
    // default constructor
    LinkedList()
    {
        head = null;
        size=0;
    }
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty(){
        // if(head==null)
        //     return true;
        // else
        //     return false;
        return head==null;
    }
    
    public void addFirst(T val){
        Node<T> newNode = new Node<>(val);
        // newNode.data = val;
        if(head==null)
        {
            head = newNode;
        }
        else{
            // newNode.next =head;
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    
    public void addLast(T val){
        Node<T> n_node = new Node<>(val);
        // n_node.data = val;
        if(head == null)
            head=n_node;
        
        else{
        Node temp = head;
        // while(temp.next!=null)
        while (temp.getNext() != null)
            temp = temp.getNext();
            // temp.next = n_node;
            temp.setNext(n_node);
        }
        size++;
    }
    
    public void print()
    {
        Node<T> temp = head;
        while(temp!=null)
        {
            System.out.print("->" + temp.getData());
            temp=temp.getNext();
        }
        System.out.println();
        /*
        //another approach to do print
        for(int i=0;i<size;i++)
            {System.out.print(temp.data+"->");
            temp=temp.next;}*/
    }
}

public class Main
{
	public static void main(String[] args) {
		LinkedList<Object> ls = new LinkedList<>(); // Generic Type Object, in order to use different types
		ls.addFirst("Ali");
		ls.addFirst(11.1);
		ls.addFirst('C');
		
		ls.print();
		ls.addFirst(15);
		ls.print();
		
		ls.addLast(234);
		ls.print();
	}
}