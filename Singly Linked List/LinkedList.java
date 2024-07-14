public class LinkedList{
    public static void main(String args[]){
        List l = new List();
        l.AddAtBeggining(78);
        l.AddAtBeggining(788);
        l.AddAtEnd(7);
        l.AddAtSpecificPosition(2,56);
        l.AddAtSpecificPosition(1,66);
        l.AddAtSpecificPosition(2,46);
        l.DeleteAtSpecificPosition(3);
        l.show();
    }
}

class Node{
    public int data;
    public Node next;
    public Node(){
        next = null;
    }
}

class List{
    Node head;
    public List(){
        head = null;
    }

    public void AddAtBeggining(int element){
        Node temp = new Node();
        if(head==null){
            head = temp;
            temp.data = element;
            temp.next = null;
        }
        else{
            temp.next = head;
            head = temp;
            temp.data = element;
        }
    }

    public void AddAtEnd(int element){
        Node temp = new Node();
        if(head==null){
            head = temp;
            temp.data = element;
            temp.next = null;
        }
        else{
            Node ptr = new Node();
            ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.data = element;
            temp.next = null;
        }
    }

    public void AddAtSpecificPosition(int position,int element){
        Node temp = new Node();
        if(head==null){
            head = temp;
            temp.data = element;
            temp.next = null;
        }
        else if(position==1){
            temp.data=element;
            temp.next = head;
            head = temp;
        }
        else{
            Node ptr = new Node();
            ptr = head;
            int i=1;
            while(i<position-1){
                ptr = ptr.next;
                i++;
            }
            temp.next = ptr.next;
            ptr.next = temp;
            temp.data = element;
        }
    }

    public void DeleteAtBegining(){
        if(head==null){return;}
        else{
            head = head.next;
        }
    }

    public void DeleteAtEnd(){
        if(head==null){return;}
        else{
            Node temp = new Node();
            temp=head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }


    public void DeleteAtSpecificPosition(int position){
        Node temp = new Node();
        temp = head;       
        if(head==null){return;}
        else if(position==1){
            head = temp.next;
        }

        else{
            int i=0;
            Node ptr = new Node();
            while(i<position-1){
            ptr = temp;
            temp = temp.next;
            i++;
            }
            ptr.next = temp.next;
        }

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
