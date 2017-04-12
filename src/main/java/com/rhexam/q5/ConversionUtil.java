package com.rhexam.q5;

import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;

/**
 * Created by jhorton on 11/5/16.
 *
 * Must be able to handle any base-10 integer that is submitted as command line argument, even negative numbers.   Provide suitable error handling.
 */
public class ConversionUtil {
    /**
     *     * Convert a base-10 integer to an 8-bit two's complement binary number, and  return the binary number.
     *   
     */

    public static String base10toBase2(String base10) throws Exception {
        boolean isNegative = false;

        int base10Int = Integer.parseInt(base10);
        if (base10Int<0) {
            isNegative = true;
        }

        if(base10Int > 127 || base10Int < -128) {
            throw new Exception("base10 value cannot be greater then 8 bits in base 2.  It must be a value between -128 and 127");
        }

        String base2String = Integer.toString(abs(base10Int), 2);

        String base2StringFormatted8Bit = base2String;

        if(base2String.length() < 8) { //pad left with 0's if less then 8 chars/bits
            base2StringFormatted8Bit = padLeft8(base2StringFormatted8Bit);
        }

        //return two's complement if negative
        if(isNegative && base10Int != -128) {
            base2StringFormatted8Bit = twosComplement(base2StringFormatted8Bit);
        }

        return base2StringFormatted8Bit;

    }

    /**
     *    * Return 2's complement negative of the given base10 positive number and return the binary number
     *    * Return 2's complement positive of the given base10 negative number and return the binary number
     *  
     */
     public static String negBase2(String base10) throws Exception {

         int base10Int = Integer.parseInt(base10);

         if(base10Int == 0) {
             throw new Exception("Zero is an invalid number, cannot invert to 0 a negative value");
         } else {
             //invert value to negative
             base10Int *= -1;
         }

         return base10toBase2(Integer.toString(base10Int));
     }

    //TODO: implement 2's complemtent
    private static String twosComplement(String bits) throws Exception {

        if(bits.length() > 8 || bits.length() == 0) {
            throw new Exception("base10 value cannot be greater then 8 bits or less then 1");
        }

        char[] base2 = bits.toCharArray();
        //1's complement
        for (int i=0;i<bits.length();i++) {
            if(base2[i]=='0') {
                base2[i] = '1';
            } else if(base2[i]=='1') {
                base2[i] = '0';
            } else {
                throw new Exception("bit chars can only be 0 or 1");
            }
        }

        //add 1
        int value = Integer.parseInt(String.valueOf(base2),2) + 1;
        return Integer.toString(value, 2);
    }

    private static String padLeft8(String bits) {
        return String.format("%0" + (8 - bits.length()) + "d%s", 0, bits);
    }

}