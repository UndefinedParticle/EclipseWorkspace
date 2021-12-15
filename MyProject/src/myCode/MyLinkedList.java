package myCode;
import java.util.*;
class LL{
	
}

public class MyLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}Node head;
	public void add(int newData){
	    Node newNode=new Node(newData);
	    if(head==null){
	        head=newNode;
	        return;
	    }
	    Node temp=head;
	    while(temp.next!=null){
	        temp=temp.next;
	    }
	    temp.next=newNode;
	}
	public void addFirst(int newData){
	    Node newNode=new Node(newData);
	    if(head==null){
	        head=newNode;
	        return;
	    }
	    newNode.next=head;
	    head=newNode;
	}
	void insertAt(int newData,int loc){
	    Node newNode=new Node(newData);
	    Node temp=head;
	    if(temp==null){
	        System.out.println("Can't Insert.");
	        return;
	    }
	    for(int i=1;i<loc-1;i++){
	    
	    temp=temp.next;
	    }
	    newNode.next=temp.next;
	    temp.next=newNode;

	}
	public void show(){
		Node temp=head;
	    System.out.print("[ ");
	    while(temp!=null){
	        System.out.print(temp.data+" ");;
	        temp=temp.next;
	    }System.out.println("]");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyLinkedList l=new MyLinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.addFirst(0);
		l.show();
	    l.insertAt(5,3);
	    l.show();
	}

}
