// Leo Wang || 12/18/25 || Pd. 6 || Computer Programming 3
// In this program we are asking users for number input, 5 for stacks and 10 for queues. Then we are duplicating their inputs for stack without changing the original order
// and for queues we are re-organizing their inputs from even to odds, without changing the original order. 
import java.util.Scanner; // Importing to be able to recieve user input 
import java.util.Stack; // Importing Stack data structure for this assignment 
import java.util.Queue; // Importing Queue data structure for this assignment 
import java.util.LinkedList; // Importing because Queue is an interface and cannot be instantiated directly 

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
    } // end while 

    System.out.println("Original stack contains: Bottom " + myStack + " Top"); 

    System.out.println("Duplicated stack contains: Bottom " + duplicate(myStack) + " Top");

    count = 0; 

    Queue <Integer> myQueue = new LinkedList<Integer>(); 

    while(count < 10){
    System.out.println("Please enter a whole number: ");
    int number = in.nextInt(); 
    myQueue.add(number); 
    count++; 
    } // end while 
    System.out.println( "Original Queue contains: Front " + myQueue + " Back");
    System.out.println("Even-Odds Queue contains: Front " + evenOdds(myQueue) + " Back");



  } // end main

  public static Stack<Integer> duplicate(Stack <Integer> e){
    Stack <Integer> temp = new Stack<Integer>(); 
    while(!e.isEmpty()){
      int x = 0; 
      x = e.pop(); 
      temp.push(x); 
      temp.push(x); 
    } // end while 
    while(!temp.isEmpty()){
      e.push(temp.pop());
    } // end while 
    return e; 
  } // end duplicate 

  public static Queue<Integer> evenOdds(Queue <Integer> e){
    Queue <Integer> temp = new LinkedList<Integer>(); 
    int store = 0; 
    for(int i = 0; i < 10; i++){
      store = e.remove(); 
      if(store % 2 == 1){
        temp.add(store); 

      } // end if 
      else{
        e.add(store); 
      } // end else 
        
    } // end for loop 
    while(!temp.isEmpty()){
      e.add(temp.remove()); 
    } // end while 

    return e; 
  
  } // end evenOdds 

} // end class