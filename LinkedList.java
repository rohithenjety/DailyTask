class Node{
    int value;
    Node next;
public Node(int value){
   this.value=value;
}
public Node(int value, Node next) {
    this.value = value;
    this.next = next;
}
 
}
public class LinkedList {
  Node head;
  Node temp;
  public void insertNode(int value){
     Node node=new Node(value);
     node.next=head;
     head=node;
  }
  public void insertNodeLast(int value){
    
    Node node=new Node(value);
    if(head==null){
        head=node;
        return;
    }
    Node temp=head;
    while(temp.next !=null){
    temp=temp.next;
   }
    temp.next=node;
   

    
 }
  public void display(){
    Node temp=head;
    while(temp.next !=null){
        System.out.print(temp.value+"-->");
      temp=temp.next;
    }
    System.out.println(temp.value);
    
  }


public static void main(String[] args) {
    LinkedList l=new LinkedList();
    // l.insertNode(7);
   for(int i=0;i<10;i++){
    l.insertNodeLast(i);
   }
   
    l.display();
}
}