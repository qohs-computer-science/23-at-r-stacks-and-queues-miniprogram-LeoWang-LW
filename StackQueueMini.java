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

    System.out.println(myStack); 


  } // end main

  public static int duplicate(Stack <Integer> e){
    Stack <Integer> temp = e;
    Stack <Integer> temp2 = e; 
    Stack <Integer> temp3 = new Stack<Integer>(); 
    
  }
} // end class