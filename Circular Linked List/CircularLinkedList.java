public class CircularLinkedList{
    public static void main(String args[]){
        List l = new List();
        l.addAtBeginning(6);
        l.addAtBeginning(8);
        l.addAtBeginning(8);
        l.addAtEnd(64);
        l.addAtSpecificPosition(2,45);
        l.deleteAtBeginning();
        
        l.deleteAtEnd();
        l.showList();        
        }
}

class Node{
    int data;
    Node next;
    public Node(){
        next=null;
    }
}

class List{
    Node head;
    Node tail;
    public List(){
        head=tail=null;
    }

    public void addAtBeginning(int element){
    Node temp = new Node();
    if(head==null){
        head = tail = temp;
        temp.data = element;
        temp.next = head;
    }
    else{
        temp.next = head;
        head = temp;
        tail.next = head;
        temp.data = element;
    }        
    }

    public void addAtEnd(int element){
        Node temp = new Node();
        if(head==null){return;}
        else{
            tail.next = temp;
            temp.data = element;
            tail = temp;
            temp.next = head;
        }
    }

    public void addAtSpecificPosition(int position,int element){
        Node temp = new Node();
        if(head==null){return;}
        else if(position==1){
            temp.next = head;
            head = temp;
            temp.data = element;
            tail.next = temp;
         }
        else{
         int i=0;
         Node ptr = new Node();
        ptr = head;
         while(i<position-2){
            ptr = ptr.next;
            i++;
         }
        temp.next = ptr.next;
        ptr.next = temp;
        temp.data = element;
        }
    }

    public void deleteAtBeginning(){
        if(head==null){return;}
        else{
            Node temp = head;
            head = temp.next;
            tail.next = head;
        }
    }

    public void deleteAtEnd(){
        if(head==null){return;}
        else{
            Node temp,ptr;
            temp = head;
            while(temp.next.next!=head){
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }

    public void deleteAtSpecificPosition(int position,int element){
        Node temp = head;
        if(position==1){return;}
        else if(temp.next==head){return;}
        else
    }

    public void showList(){
        Node temp = new Node();
        temp=head;
        if(head==null){return;}
        else{
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }while(temp!=head);
        }
    }
}