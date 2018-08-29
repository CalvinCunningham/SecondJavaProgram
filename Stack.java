package SecondProgram;

public class Stack {

	/* This stack program will create a private stack 
	 * that can only access it members through operations.
	 */
	
	final private int MAX_VALUE = 100;
	private int stck[] = new int[MAX_VALUE];	
	private int tos;	
	private int value;

	
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
		else {
			 value  = stck[tos--];
			 					 
			 System.out.println("currentValue  " + value);
			 
			 return value;
			 
		}
		
		
	}
			 
		    
	void resetStackContent() {
		// While traversing an array or list modifying the array
		// or list will corrupt the memory and give unwanted
		// and unexpected results.
		for( tos = (MAX_VALUE -1 ); tos > 0 ; tos--) {
			
		    if( tos > 0) {
			
			    System.out.println("tos: " + tos);
			    stck[tos] = 0;
		    }
		
		}
		//Reset tos integer so we can add more items to the list.
		tos = -1;
		
	}
	   
				
	
	
	void printStack() {
		
		System.out.print("The contents of the Stack1 are ");
		for( int item: stck ) {
			
			 if( item > 0)
			     System.out.print(item + "  ");
		}
	
		System.out.println("Stack1 Complete.");
		
		
	}
	
	int getMaxValue() {
		
		return stck.length;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to your Second Java Program.");
		int popReturnValue;
		Stack stack = new Stack();

		int maxValue = stack.getMaxValue();
		
		for( int index=0; index <  maxValue; index++) {
			
			stack.push(index);
			
		}
		
		stack.printStack();
		
		
		System.out.println("*********************Remove from Stack********************");
		
		for( int index=0; index <  maxValue; index++) {
			
			 popReturnValue = stack.pop();
			 						 
			 if( popReturnValue > 0)
		         System.out.println("Stack Value removed " + popReturnValue);
			 
		
		}
		
			
		stack.resetStackContent();
		
		
		stack.printStack();
		

		
	}

}
