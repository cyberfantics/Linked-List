public class DoublyLinkedList{
    public static void main(String args[]){
        List l = new List();
        l.insertAtBeggining(8);
        l.insertAtBeggining(676);
        l.insertAtBeggining(7);
        l.insertAtEnd(74);
        l.insertAtSpecificPosition(1,56);
        l.deleteAtSpecificPosition(3);
        l.show();
    }
}

class Node{
    public int data;
    public Node next;
    public Node back;
    public Node(){
        next=back=null;
    }
}

class List{
    public Node head;
    public Node tail;
    public List (){
        head=tail=null;
    }

    public void insertAtBeggining(int element){
        Node temp = new Node();
        if(head==null){
            head = temp;
            tail = temp;
            temp.data = element;
        }
        else{
            head.back = temp;
            temp.next = head;
            temp.data=element;
            head = temp;
        }
    }

    public void insertAtEnd(int element){
        Node temp = new Node();
    if(head==null){    
            head = temp;
            tail = temp;
            temp.data = element;
        }
        else{
            tail.next = temp;
            temp.back = tail;
            tail = temp;
            temp.data=element;
        }
    }
    
    public void insertAtSpecificPosition(int position,int element){
        Node temp = new Node();
        Node newNode = new Node();
        if(head==null){    
            head = temp;
            tail = temp;
            temp.data = element;
        }
        else if(position==1){
            temp.back = null;
            temp.next = head;
            head = temp;
            temp.data = element;
        }

        else{
            int i=1;
            Node ptr = new Node();
            temp = head;
            ptr = temp.next;
            while(i<position-1){
                temp = ptr;
                ptr = temp.next;
                i++;
            }
            newNode.back= temp;
            newNode.next =ptr;
            temp.next = newNode;
            ptr.back = newNode;
            newNode.data = element;
        }
    }
    
    public void deleteAtBeginning(){
        if(head==null){return;}
        else{
            head = head.next;
            head.back=null;
        }
    }

    public void deleteAtEnd(){
        if(head==null){return;}
        else{
            tail = tail.back;
            tail.next = null;
        }
    }

    public void deleteAtSpecificPosition(int position){
        Node temp = new Node();
        temp = head;
        Node ptr = temp.next;
        int i=1;
        while(i<position-1){
            temp = ptr;
            ptr = temp.next;
        }
        temp.next = ptr.next;
        ptr.next.back = temp;
    }
    public void show(){
        Node temp = new Node();
        temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
