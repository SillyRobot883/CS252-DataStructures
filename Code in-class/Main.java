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
    int index = 0;
    public void search(T val)
    {
        Node<T> curr = head;
        while(curr!=null)
        {
            if(curr.data.equals(val))// we need to do comparision as a generic. fixed using equals() method
            {
                System.out.println(curr.data + " found.");
                break;
            }
            index++;
            curr=curr.next;
        }
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
            System.out.println("value: "+curr.data + " | position: " + index );
        }
        else
            System.out.println("invaild position");
    }
    
    // HOMEWORK 2
    // - next() 
    // change Curr position to the next node.
    public void next(){
        if (curr.next != null && curr != null) // check if next current is tail, or already a tail 
            curr = curr.next;
    }
    // - CurrPos()
    // return the position (index) of Curr.
    public int CurrPos(T val){
        curr = head;
        int index = 0;
        while (curr != null){
            if (curr.data.equals(val)){
                return index;
            }
            index++;
            curr = curr.next;
            
        }
        return -1; // if value not found
    }
    






    public void print()
    {
        Node<T> temp = head;
        System.out.print("HEAD");
        while(temp!=null)
        {
            System.out.print(" --> " +temp.data);
            temp=temp.next;
        }
        System.out.println(" --> TAIL");
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
		
        System.out.println("searching for value: 234");
		ls.search(234);
		
		// ls.moveToStart();
		// System.out.println(ls.getValue());
		// ls.moveToEnd();
		// System.out.println(ls.getValue());
		// ls.moveToPosition(2);
        System.out.println("next Method");
        // System.out.println("Before: " + ls.getValue());
        ls.next();
        // System.out.println("After: " + ls.getValue());

        System.out.println("Current Position Method");
        System.out.println(ls.CurrPos(66));



	}
}
