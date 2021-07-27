package assignment2;

import java.util.Scanner;

public class Stack {
	int redtop, bluetop; // initializing the top of the stack references
	int capacity; // reference the size of the array
	int[] array; //creating the array reference
	
	public Stack() {
		redtop = -1; // top of the red stack is -1
		bluetop = 9; // top of blue stack is space 9 in array
		
		capacity = 20; //size of array is 20
		array = new int[capacity]; // creates an array with the given size
	}
	
	public boolean redIsEmpty() {
		return redtop == -1; // red would be empty because there would be no data input
	}
	public boolean blueIsEmpty() {
		return bluetop == 9; // blue empty because no data input
	}
	public boolean redIsFull() {
		return redtop == 3; // red becomes full at array index 3.
		
	}
	public boolean blueIsFull() {
		return bluetop == 5; // blue becomes full at array index 5
	}
	public int pushRed(int data) {
		if(redIsFull()) {
			System.out.println("Red Stack is full");
		}
		return array[++redtop]=data;	//pushing the data into the array, adding to the index position
	}
	public int pushBlue(int data) {
		if(blueIsFull()) {
			System.out.println("Blue Stack is full"); 
		}
		else {
		return array[--bluetop]=data;	// pushes data into the array, subtracting the index position because the blue stack points inwards.
	}
		return data;}
	public int popRed() {
		if(redIsEmpty()) {
			System.out.println("Red Stack is Empty!");
		}
		return array[redtop--];} // removes an element from the red stack, - the index 
		
	public int popBlue() {
		if(blueIsEmpty()) {
			System.out.println("Blue Stack is Empty!");
		}
		return array[bluetop++]; // removes an element from the blue stack at the current index, + reference location
	
	}
	public int redpeek()
	{
		if (redIsEmpty()){
			System.out.println("Red stack is empty.");
			
		}
		return array[redtop]; // returns the current element on top of the red stack
	}
	public int bluepeek()
	{
		return array[bluetop]; // returns the current element on top of blue stack
	}
	

	
	
	
	
	public static void main(String[] args) {
		Stack array1 = new Stack();
		int choice = 0;
		int data;
		Scanner scan = new Scanner(System.in);

		while(true) {
		
			System.out.println("1. Blue Push | 2. Red Push | 3. Blue pop | 4. Red pop | 5. Blue peek | 6. Red peek | 7. Clear Red | 8. Clear Blue | Else Stop");
			choice = scan.nextInt();	
			if(choice == 1){
				System.out.println("What value would you like to push to the blue stack?");
				data = scan.nextInt();
				array1.pushBlue(data);
				
	         }
			else if(choice == 2) {
				System.out.println("What value would you like to push to the red stack?");
				data = scan.nextInt();
				array1.pushRed(data);			
				
			}
			else if (choice == 3) {
				if(array1.bluetop !=9) {
				System.out.println("Popped Blue: "+array1.popBlue());}
				else {
					System.out.println("Blue stack is empty");
				}
				
			}
			else if(choice ==4) {
				
				if(array1.redtop != -1) {
				System.out.println("Popped red: " +array1.popRed());
				}
				else {
					System.out.println("Red Stack is empty");
				}
			}
			else if(choice == 5) {
				if(array1.bluetop == 9) {
					System.out.println("The Blue Stack is empty!");
				}
				else {
				System.out.println("At the top of the blue stack is: " +array1.bluepeek());
				}
				}
			else if(choice == 6) {
				if(array1.redtop == -1) {
					System.out.println("The red stack is empty!");
				}
				else {
				System.out.println("At the top of the red stack is:" +array1.redpeek());
				}
				}
			else if (choice == 7) {
				
				while(array1.redtop != -1) {
					System.out.println("Popped red: " +array1.popRed());
				}	
				if(array1.redtop == -1) {
					
					System.out.println("You have cleared Red!");

				}
			}
			else if (choice == 8) {
				
				while(array1.bluetop != 9) {
					System.out.println("Popped Blue: " + array1.popBlue());
				}
				if(array1.bluetop == 9) {
					System.out.println("You have cleared Blue!");
				}
			}
			else {
				scan.close();
				break;
			}
			}
		
	}
}
	

