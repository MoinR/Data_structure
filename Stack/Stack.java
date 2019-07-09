/*
	 * LIFO implementation using Array
	 * Written By : Moin Memon 
 */ 
import java.util.Scanner;

public class Stack {
	
	int[] arr = new int[10]; 
	int top = -1; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val,i = 0;
		
		Stack s = new Stack();
		
		do {
			System.out.println(" ");
			System.out.println("1. Push ");
			System.out.println("2. Pop " );
			System.out.println("3. Peep");
			System.out.println("4. Display ");
			System.out.println("5. Exit ");
			
			System.out.println("Enter Your choice : ");
			i = sc.nextInt();
			
			if(i == 1){
				System.out.println("Enter Value : ");
				val = sc.nextInt();
				s.push(val);
			}
			else if(i == 2){
				s.pop();
			}
			else if(i == 3){
				s.peep();
			}
			else if(i == 4){
				s.Display();
			}
			else if(i == 5){
				System.out.println("Good Bye !");
				break;
			}
			else{
				System.out.println("Invalid Input");
				continue;
			}
		} while(i < 6);
		sc.close();
	}
	
	private void push(int a){
		if(top > 10){
			System.out.println("Stack Overflow ");
			return ;
		}
		arr[++top] = a;
		
	}
	private void pop(){
		if(top == -1){
			System.out.println("Stack Underflow ");
			return ;
		}
		top--;
	}
	private void peep(){
		if(top == -1){
			System.out.println("Stack Underflow ");
			return ;
		}
		System.out.println(arr[top]);
	}
	private void Display(){
		for(int i = top; i >= 0; i--){
			System.out.println(arr[i]);
		}
	}
}
