/**
     In progress 
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Linked_List {
     
     static class node{
          int data; 
          node next;    
          node(int x){
               data = x;
               next = null;
          }
     }    
     
     node first = null; 

     void create(Linked_List ln){
          if(first != null){
               System.out.println("Linked List created already ");
               return;
          }
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Number of elements you want to create : ");
          int n = sc.nextInt();

          for(int i = 0; i < n; i++){
               System.out.println("Enter Value : ");
               int val = sc.nextInt();

               node new1 = new node(val);
               new1.next = null;
          
               node curr; 
          
               if(first == null){
                    first = new1;
                    System.out.println("Inserted At first \n");
               }
               else { 
                    curr = first; 
                    while(curr.next != null){
                         curr = curr.next;
                    }
                    curr.next = new1;
               }
          }    
     }

     void insert(int val){ 
          System.out.println("Called Insert ");
          Scanner sc = new Scanner(System.in);
          
          if(first != null){
               System.out.println("Enter value : ");
               val = sc.nextInt(); 
          } 
          
          node new1 = new node(val);
          new1.next = null;
          
          node curr; 
          
          if(first == null){
               first = new1;
               System.out.println("Inserted At first ");
               return;
          }

          curr = first; 
          while(curr.next != null){
               curr = curr.next;
          }

          curr.next = new1;
     }

     void display(){
          node curr;
          
          if(first == null){
               System.out.println("Linked list is empty ");
               return;
          }
          
          curr = first; 
          while(curr.next != null){
               System.out.println(curr.data);
               curr = curr.next;
          }
          System.out.println(curr.data);


     }

     public static void main(String[] args) {

          Linked_List ln = new Linked_List();
          Scanner sc = new Scanner(System.in);

          char ch; 
          
          do{
               System.out.println("|--------------- MENU ---------------| ");
               System.out.println("1. Create a Linked list ");
               System.out.println("2. Insert Node at end ");
               System.out.println("3. Display ");
               System.out.println("4. Exit ");
               
               try{
                    System.out.println("Enter Your choice : ");
                    ch = sc.next(".").charAt(0);

                    if(ch == '1'){
                         ln.create(ln);
                    }
                    else if(ch == '2'){
                         ln.insert(1);
                    }
                    else if(ch == '3'){
                         ln.display();
                    }
                    else if(ch == '4'){
                         System.out.println("Good Bye User..!");
                    }
                    else{
                         System.out.println("Invalid Input ");
                    }
               }
               catch(Exception e){
                    System.out.println("Invalid Input, Please enter valid input " +  e.getMessage() );
                    
                    System.out.println("Enter Your choice : ");
                    ch = sc.next(".").charAt(0);
               }
          }while(ch != '4');
     }
}
