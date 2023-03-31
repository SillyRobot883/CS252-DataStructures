import java.util.Comparator;
class Node<T>{
    public T data;
    public Node<T> next;
    
    //do the setter and getter here for this class HM 21-3-2023
    
}

class LinkedList<T>{
    Node<T> head;
    Node<T> tail;
    Node<T> curr;
    int size;
    
    LinkedList()
    {
        head = null;
        tail=null;
        curr = null;
        size=0;
    }
    public int size()
    {
        return this.size;
    }
    public T first(){
        if(!isEmpty())
            return head.data;
        else
            return null;
    }
    
    public void search(T val)
    {
        Node<T> curr = head;
        while(curr!=null)
        {
            if((curr.data)==val)// we need to do comparision as a generic
            {
                System.out.println("yes we found the data:"+ curr.data);
                break;
            }
            curr=curr.next;
        }
    }
    
    public T last(){
        if(!isEmpty())
            return tail.data;
        else
            return null;
    }
    public boolean isEmpty(){
        if(head==null)
            return true;
        else
            return false;
        //return head==null;// this is another way to do comparision
        
    }
    
    public void addFirst(T val){
        Node<T> newNode = new Node();
        newNode.data = val;
        if(head==null) // if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next =head;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(T val){//without using tail
        Node<T> n_node = new Node();
        n_node.data = val;
        if(head == null){
            head=n_node;
            tail=n_node;
        }
        
        else{
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = n_node;
        tail=n_node;
        }
        size++;
    }
    
    public void addLast2(T val)// this by using tail
    {
        Node<T> newNode = new Node();
        newNode.data=val;
        if(isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = tail.next;//tail=newNode;
        }
        size++;
    }
    
    public T removeFirst(){
        T val = null;
        if(!isEmpty()){
            Node<T> temp = head;
            head=head.next;
            temp.next=null;
            val = temp.data;
            size--;
        }
        return val;
    }
    
    //helper
    public void moveToStart(){
        curr = head;
    }
    public void moveToEnd(){
        curr= tail;
    }
    public T getValue(){
        return curr.data;
    }
    public void moveToPosition(int index)
    {
        curr = head;
        if(index<size)
        {
            for(int i=1;i<index;i++)
                curr = curr.next;
            System.out.println("we are in the position ("+index+ ") and the value is:"+curr.data);
        }
        else
            System.out.println("error position");
    }
    
    public void print()
    {
        Node<T> temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
        /*
        //another approach to do print
        for(int i=0;i<size;i++)
            {System.out.print(temp.data+"->");
            temp=temp.next;}*/
    }
}

class Main
{
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.addFirst("Ali");
		ls.addFirst(11.1);
		ls.addFirst('C');
		
		ls.print();
		ls.addFirst(15);
		ls.print();
		
		ls.addLast(234);
		ls.print();
		
		System.out.println(ls.first());
		ls.print();
		
		System.out.println(ls.removeFirst());
		ls.print();
		
		ls.addLast2(66);
		ls.print();
		
		System.out.println(ls.last());
		ls.print();
		
		ls.search(234);
		
		ls.moveToStart();
		System.out.println(ls.getValue());
		ls.moveToEnd();
		System.out.println(ls.getValue());
		ls.moveToPosition(2);
	}
}
