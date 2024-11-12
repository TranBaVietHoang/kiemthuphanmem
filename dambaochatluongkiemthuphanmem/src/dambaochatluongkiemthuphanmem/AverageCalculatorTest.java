package dambaochatluongkiemthuphanmem;

import org.junit.jupiter.api.Test;

public class AverageCalculatorTest {

    
    public void testBasisPath1() {
        // Basis Path 1: value = [10, -999], minimum = 0, maximum = 100
        int[] value = {10, -999};
        int minimum = 0;
        int maximum = 100;

        AverageCalculator calculator = new AverageCalculator();
        int result = calculator.average(value, minimum, maximum);

        assertEquals(10, result);
    }

    
    private void assertEquals(int i, int result) {
		// TODO Auto-generated method stub
		
	}


	public void testBasisPath2() {
        // Basis Path 2: value = [-5, 10, -999], minimum = 0, maximum = 100
        int[] value = {-5, 10, -999};
        int minimum = 0;
        int maximum = 100;

        AverageCalculator calculator = new AverageCalculator();
        int result = calculator.average(value, minimum, maximum);

        assertEquals(10, result);
    }

    
    public void testBasisPath3() {
        // Basis Path 3: value = [-999], minimum = 0, maximum = 100
        int[] value = {-999};
        int minimum = 0;
        int maximum = 100;

        AverageCalculator calculator = new AverageCalculator();
        int result = calculator.average(value, minimum, maximum);

        assertEquals(-999, result);
    }
}
