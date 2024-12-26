class Node{
    int value;
    Node prev;
    Node next;
    public  Node(int value){
        this.value=value;
    }
    public Node(int value, Node next, Node prev){
        this.value=value;
        this.next=next;
        this.prev=prev;
    }
}
class double_linkedlist {
 Node head;
 public void insertfirst(int value){
    Node newNode=new Node(value);
    newNode.next=head;
   if(head!=null){
    head.prev=newNode;
   }
    
    head=newNode;
    newNode.prev=null;
 }

 public void insertlast(int value){
    Node temp=head;
    Node newnode=new Node(value);
    if(head ==null){
        head=newnode;
        return;
    }
   
    while(temp.next !=null){
        temp=temp.next;
    }
    temp.next=newnode;
  newnode.prev=temp;
}

public void insertatany(int index, int value){
    Node temp=head;
    int i=0;
    Node newnode=new Node(value);
    if (index == 0) {
        newnode.next = head;
        if (head != null) {
            head.prev = newnode;
        }
        head = newnode;
        return;
    }
    while(i<index-1 && temp != null){
        temp=temp.next;
        i++;
    }
    if (temp == null) {
        System.out.println("Index out of bounds");
        return;
    }
    newnode.next=temp.next;
    if (temp.next != null) {
        temp.next.prev = newnode;
    }
    temp.next=newnode;
    newnode.prev=temp;
}

public void reverseList(){
    Node current=head;
    Node nxt=null;
    Node pre=null;
    while(current !=null){
        nxt= current.next;
       current.next=pre;
       pre=current;
       current=nxt;
    }
    head=pre;
 }
    
public void display(){
Node temp=head;
// Node last=null;

while(temp !=null){
    //  last=temp;  // This varible used for the reversing of the nodes on the list.
    System.out.print(temp.value+"-->");
    temp=temp.next;
  
}


//  System.out.println("Printing in reverse of the list");
// while(last !=null){
//     System.out.print(last.value+"-->");
//     last=last.prev;
// }
}
public static void main(String args[]){
 double_linkedlist dd=new double_linkedlist();
 dd.insertfirst(20);
 dd.insertfirst(22);
 dd.insertfirst(15);
 dd.insertfirst(754);
 dd.insertfirst(280);
 dd.insertfirst(90);
 dd.insertfirst(65);
 dd.insertfirst(53);
 dd.display();
 System.out.println();
 dd.insertatany(4, 17);
//  dd.insertlast(19);
 dd.display();
 System.out.println();
//  dd.reverseList();
//  dd.display();

}
}