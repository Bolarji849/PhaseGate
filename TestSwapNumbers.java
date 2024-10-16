import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestSwapNumbers{
		
	@Test
	public void testNumbersAreSwap(){
		//Given


	 int[] array = {1,2,3,4,5,6};

	 SwapNumbers   swapNumbers = new SwapNumbers();

		// when

	int[] result = swapNumbers.getSwapNumber(array);
		
	int[] expected = {2,1,4,3,6,5};

		//check

	assertArrayEquals(expected, result);


}



}