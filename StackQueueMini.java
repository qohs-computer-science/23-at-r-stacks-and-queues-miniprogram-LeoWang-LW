import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in); 
    int count = 0;
    Stack<Integer> myStack = new Stack<Integer>(); 

    while(count < 5){
    System.out.println("Please enter a whole number: ");
    int number = in.nextInt(); 
    myStack.push(number); 
    count++; 
    }

    System.out.println("Bottom " + myStack + " Top"); 

    System.out.println("Bottom " + duplicate(myStack) + " Top");

    count = 0; 

    Queue <Integer> myQueue = new LinkedList<Integer>(); 

    while(count < 10){
    System.out.println("Please enter a whole number: ");
    int number = in.nextInt(); 
    myQueue.add(number); 
    count++; 
    }
    System.out.println( "Front " + myQueue + " Back");



  } // end main

  public static Stack<Integer> duplicate(Stack <Integer> e){
    Stack <Integer> temp = new Stack<Integer>(); 
    while(!e.isEmpty()){
      int x = 0; 
      x = e.pop(); 
      temp.push(x); 
      temp.push(x); 
    }
    while(!temp.isEmpty()){
      e.push(temp.pop());
    }
    return e; 
  }

  public static Queue<Integer> evenOdds(Queue <Integer> e){
    Queue <Integer> temp = new LinkedList<Integer>(); 
    for(int i = 0; i < 10; i++){
      
    }
  }

} // end class