import org.junit.Test;
import com.rhexam.q5.ConversionUtil;

import static org.junit.Assert.assertTrue;

public class RHQ5Test {

    /**
     *  Convert a base-10 integer to an 8-bit two's complement binary number, and  return the binary number.
     */
    @Test
    public void testBase10toBase2Positive() throws Exception {
        String base2Value = ConversionUtil.base10toBase2("27");
        assertTrue("", base2Value.equals("00011011"));
    }

    @Test
    public void testBase10toBase2Negitive1() throws Exception {
        String base2Value = ConversionUtil.base10toBase2("-128");
        assertTrue("", base2Value.equals("10000000"));
    }

    @Test
    public void testBase10toBase2Negitive2() throws Exception {
        String base2Value = ConversionUtil.base10toBase2("-100");
        assertTrue("", base2Value.equals("10011100"));
    }

    @Test
    public void testBase10toBase2Negitive3() throws Exception {
        String base2Value = ConversionUtil.base10toBase2("-127");
        assertTrue("", base2Value.equals("10000001"));
    }

    @Test
    public void testBase10toBase2Zero() throws Exception {
        String base2Value = ConversionUtil.base10toBase2("0");
        assertTrue("", base2Value.equals("00000000"));
    }

    @Test
    public void testBase10toBase2NegitiveZero() throws Exception {
        String base2Value = ConversionUtil.base10toBase2("-0");
        assertTrue("", base2Value.equals("00000000"));
    }

    @Test(expected = Exception.class)
    public void testBase10toBase2ExceptionPositive() throws Exception {
        String base2Value = ConversionUtil.base10toBase2("128");
    }

    @Test(expected = Exception.class)
    public void testBase10toBase2ExceptionNegitive() throws Exception {
        String base2Value = ConversionUtil.base10toBase2("-129");
    }

    /**
     *  Return 2's complement negative of the given base10 number and return the binary number 
     */
    @Test
    public void testBase10toBase2Negative1() throws Exception {
        String base2Value = ConversionUtil.negBase2("100");
        assertTrue("", base2Value.equals("10011100"));
    }
    @Test
    public void testBase10toBase2Negative2() throws Exception {
        String base2Value = ConversionUtil.negBase2("128");
        assertTrue("", base2Value.equals("10000000"));
    }

    @Test
    public void testBase10toBase2Negative3() throws Exception {
        String base2Value = ConversionUtil.negBase2("-127");
        assertTrue("", base2Value.equals("01111111"));
    }

    @Test(expected = Exception.class)
    public void testBase10toBase2NegativeException1() throws Exception {
        String base2Value = ConversionUtil.negBase2("0");
    }

    @Test(expected = Exception.class)
    public void testBase10toBase2NegativeException2() throws Exception {
        String base2Value = ConversionUtil.negBase2("129");
    }

}
