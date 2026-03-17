class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackLinkedList {
    Node top;  
  
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;  
        top = newNode;    
        System.out.println(data + " pushed to stack");
    }

  
    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow (no elements to pop)");
            return;
        }

        System.out.println(top.data + " popped from stack");
        top = top.next;
    }
   
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

       
        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop(); 
    }
}
import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char ans=0;
        for(char ch:(s1+s2).toCharArray()){
            ans^=ch;
        }
        System.out.println(ans);
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    Node top;  

   
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;  
        top = newNode;    
        System.out.println(data + " pushed to stack");
    }

  
    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow (no elements to pop)");
            return;
        }

        System.out.println(top.data + " popped from stack");
        top = top.next;
    }
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.peek();
        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop(); 
    }
    }
