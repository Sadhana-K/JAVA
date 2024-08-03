//import java.io.*;
//import java.util.*;
 
public class StackDemo {
  char Alpha[]= new char[10]; 
  int tos=-1;        //tos=top of the stack  

  void push(char a){
    if(tos==9){
      System.out.println("Stack is full");
    }
    else{
      Alpha[++tos]= a;
    }
  }

  char pop(){
    if(tos<=0){
      return Alpha[tos--];
    }
    else{
      System.out.println("Stack is empty");
    }
  }
   
      // Main Method
    public static void main(String[] args)
    {
 
        // Default initialization of Stack
        StackDemo stack1 = new StackDemo();
 
        StackDemo stack2 = new StackDemo();
 
        // pushing the elements
        stack1.push('a');
        stack1.push('e');
        stack1.push('i');
        stack1.push('o');
        stack1.push('u');
 
        stack2.push('b');
        stack2.push('c');
        stack2.push('d');
        stack2.push('f');
        stack2.push('g');
 
          // Printing the Stack Elements
        System.out.println(stack1);
        
    }
}