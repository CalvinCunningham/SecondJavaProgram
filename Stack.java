package SecondProgram;

public class Stack {

	/* This stack program will create a private stack 
	 * that can only access it members through operations.
	 */
	
	final int MAX_VALUE = 100;
	private int stck[] = new int[MAX_VALUE];
	private int tos;
	
	Stack ( ) {
		tos = -1;
		
	}
	
	void push (int item) {
		
		if( tos > (MAX_VALUE -1 )) 
			System.out.println("The Stack is full ");
		else 
			stck[++tos] = item;
					
	}
	
	
	int pop() {
		
		if( tos < 0) {
			System.out.println("The stack underflow or empty");
		    return 0;
		}    
		else 
			return stck[tos--];
				
	}
	
	void printStack() {
		
		System.out.print("The contents of the stack are ");
		for( int item: stck ) {
			
			 if( item > 0)
			     System.out.print(item + "  ");
		}
	
		System.out.println("Stack Complete.");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to your Second Java Program.");
		
		Stack stack = new Stack();
		
		
		
		for( int index = 1; index < (stack.MAX_VALUE ); index++) {
			
			stack.push(index);
		}
		
		stack.printStack();
		
		
	}

}
