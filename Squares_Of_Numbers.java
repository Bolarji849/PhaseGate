import java.util.Arrays;

public class Squares_Of_Numbers{


	public static void main(String [] args){
	int [] input = {2,1,4,3,5,9};
	int []square = SqaureOfNumber(input);

	sortedNumber(square);
	System.out.print(Arrays.toString(square));
	
	
}

public static int[] SqaureOfNumber( int [] number){

	int [] square = new int[number.length];
 
	for(int count = 0; count < number.length; count++){
	 square[count] = number[count] * number[count];
	  }

     return square;
		
	 }

	

public static void sortedNumber(int [] input){

  

for (int index = 0; index < input.length; index++ ){

	for(int count =1; count < input.length; count++){
	
		if(input[count-1]> input[count]){

		int store = input [count-1];

		input [count -1] = input [count];

		input [count] = store;
		
		}
		}

	
}
}
}

