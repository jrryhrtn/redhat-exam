Read all of the instructions carefully before proceeding.
	1.	The quiz is honor system based.
	•	No communication with any other individual is allowed.
	2.	You have a total of 8 continuous hours from the time you open the quiz to the time you submit it.
	3.	Scan and return all written material including diagrams in a document format.
	4.	Return all source code (.java files) in one zip file.
	5.	Sign your full name and total time you took to complete the quiz at the bottom of your file/email.
Question 1
	•	Write a java class that implements the following interface:
public interface Range {
    /**
    * Create a new Range object representing an integer interval starting from 'from' and 'to', both limits inclusive
    */
    public Range newRange(int from,int to);
   
    /**
    * Return if 'value' is in the range defined by this object
    */
    public boolean isIn(int value);
   
    /**
    * Return the minimum value in range
    */
    public int min();
   
    /**
    * Return the maximum value in range
    */
    public int max();
   
    /**
    * Add range 'r' to this range, and return 'this'.
    * 'r' and this may denote disjoint ranges, for instance:
    *  r.newRange(1.5).add(r.newRange(8,10)) denotes a range
    * including 1,2,3,4,5,8,9,10

    */
    public Range add(Range r);
 
}
Your java class must be named RangeImplem, and must have a default contructor.

Example:
RangeImplem r=new RangeImplem();
r.newRange(1,5).isIn(3) => returns true
r.newRange(1.5).isIn(6) => returns false
r.newRange(1.5).add(r.newRange(8,10)).isIn(6) => returns false
Bonus: implement public Range subtract(Range r)
Question 2
	•	Optimize and correct any errors in this block of code.
 /**
 *  Given there are 50000 items in the input String array, the
 *  function must add all array items to outputString and then return
 *  the outputString. if forceUpperCase is true, the return string must be upper case.

 */
 
public String addStringItems(String[] items, boolean forceUpperCase) {
    String returnValue="";
     for(int i = 0; i < items.length; i++) {
      returnValue+=items[i];
    }
    return forceUpperCase?returnValue.toUpperCase():returnValue;
 
}
Question 3
	•	Using the Java Collections Framework:
	•	Change the optimized function implementation from question #2 above.
	•	Have the code:
	1.	add each array item to a Collection implementation
	2.	iterate over the Collection and return all values as a concatenated
	3.	if forceUpperCase is true, returned value must be all upper case
	•	Tell me why you chose the container implementation that you did.
	•	Is the optimized function thread safe?
	•	Is the unoptimized function thread safe?
	•	If not, how can you make it thread safe?
Question 4
	•	Write a function:
public List<String> combine(Iterator<String> itr1,Iterator<String> itr2);
	•	itr1 and itr2 iterate over their contents in sorted order
	•	The result is the combination of itr1 and itr2, in the same order itr1 and itr2 is sorted
	•	The function should operate in O(n) time
Bonus:  Instead of the above, write
public Iterator<String> combine(Iterator<String> itr1,Iterator<String> itr2)
using the same constraints as above, but runs in O(1)
Question 5
	•	Write a class:
public class Conversion {
  /**
    * Convert a base-10 integer to an 8-bit two's complement binary number, and  return the binary number.
   */
 
  public String base10to2(String base10) {
    ...
   }
 
 
 
  /**
   * Return 2's complement negative of the given base10 number and return the binary number
  */
 
  public String negBase2(String base10) {
    ...
   }
} Must be able to handle any base-10 integer that is submitted as command line argument, even negative numbers.   Provide suitable error handling.
Question 6
	•	You are writing a web service to search customer objects:
public class Customer {
    String name;
    String lastName;
    ...
     List<Address> addresses;
}
 
public class Address {
    String street1;
    String street2;
    String state;
   ...
}
Define a searchCustomers API with the following requirements:
	•	Return type is List<Customer>
	•	Caller will specify a search criteria with several search fields. Each search fieldName can be a customer fieldName, or an address fieldName. For instance, it should be possible to search for all customers living in a certain state with a given last name.
	•	Caller can specify a sort fieldName and sort order in which the results will be returned.
	•	Implementation will be stateless.
	•	API must limit number of records returned by each call to protect against very large result sets.
Write the API signature, and any other class required by that API. Write the API as a Java interface. Do not write an implementation for the interface.
