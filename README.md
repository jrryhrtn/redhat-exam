Read all of the instructions carefully before proceeding.<br>
	1.	The quiz is honor system based.<br>
	•	No communication with any other individual is allowed.<br>
	2.	You have a total of 8 continuous hours from the time you open the quiz to the time you submit it.<br>
	3.	Scan and return all written material including diagrams in a document format.<br>
	4.	Return all source code (.java files) in one zip file.<br>
	5.	Sign your full name and total time you took to complete the quiz at the bottom of your file/email.<br>
Question 1<br>
	•	Write a java class that implements the following interface:<br>
public interface Range {<br>
    /**<br>
    * Create a new Range object representing an integer interval starting from 'from' and 'to', both limits inclusive<br>
    */<br>
    public Range newRange(int from,int to);<br>
   <br>
    /**<br>
    * Return if 'value' is in the range defined by this object<br>
    */<br>
    public boolean isIn(int value);<br>
   <br>
    /**<br>
    * Return the minimum value in range<br>
    */<br>
    public int min();<br>
   <br>
    /**<br>
    * Return the maximum value in range<br>
    */<br>
    public int max();<br>
   <br>
    /**<br>
    * Add range 'r' to this range, and return 'this'.<br>
    * 'r' and this may denote disjoint ranges, for instance:<br>
    *  r.newRange(1.5).add(r.newRange(8,10)) denotes a range<br>
    * including 1,2,3,4,5,8,9,10<br>
<br>
    */<br>
    public Range add(Range r);<br>
 <br>
}<br>
Your java class must be named RangeImplem, and must have a default contructor.<br>
<br>
Example:<br>
RangeImplem r=new RangeImplem();<br>
r.newRange(1,5).isIn(3) => returns true<br>
r.newRange(1.5).isIn(6) => returns false<br>
r.newRange(1.5).add(r.newRange(8,10)).isIn(6) => returns false<br>
Bonus: implement public Range subtract(Range r)<br>
Question 2<br>
	•	Optimize and correct any errors in this block of code.<br>
 /**<br>
 *  Given there are 50000 items in the input String array, the<br>
 *  function must add all array items to outputString and then return<br>
 *  the outputString. if forceUpperCase is true, the return string must be upper case.<br>
<br>
 */<br>
 <br>
public String addStringItems(String[] items, boolean forceUpperCase) {<br>
    String returnValue="";<br>
     for(int i = 0; i < items.length; i++) {<br>
      returnValue+=items[i];<br>
    }<br>
    return forceUpperCase?returnValue.toUpperCase():returnValue;<br>
 <br>
}<br>
Question 3<br>
	•	Using the Java Collections Framework:<br>
	•	Change the optimized function implementation from question #2 above.<br>
	•	Have the code:<br>
	1.	add each array item to a Collection implementation<br>
	2.	iterate over the Collection and return all values as a concatenated<br>
	3.	if forceUpperCase is true, returned value must be all upper case<br>
	•	Tell me why you chose the container implementation that you did.<br>
	•	Is the optimized function thread safe?<br>
	•	Is the unoptimized function thread safe?<br>
	•	If not, how can you make it thread safe?<br>
Question 4<br>
	•	Write a function:<br>
public List<String> combine(Iterator<String> itr1,Iterator<String> itr2);<br>
	•	itr1 and itr2 iterate over their contents in sorted order<br>
	•	The result is the combination of itr1 and itr2, in the same order itr1 and itr2 is sorted<br>
	•	The function should operate in O(n) time<br>
Bonus:  Instead of the above, write<br>
public Iterator<String> combine(Iterator<String> itr1,Iterator<String> itr2)<br>
using the same constraints as above, but runs in O(1)<br>
Question 5<br>
	•	Write a class:<br>
public class Conversion {<br>
  /**<br>
    * Convert a base-10 integer to an 8-bit two's complement binary number, and  return the binary number.<br>
   */<br>
 <br>
  public String base10to2(String base10) {<br>
    ...<br>
   }<br>
 <br>
 <br>
 <br>
  /**<br>
   * Return 2's complement negative of the given base10 number and return the binary number<br>
  */<br>
 <br>
  public String negBase2(String base10) {<br>
    ...<br>
   }<br>
} Must be able to handle any base-10 integer that is submitted as command line argument, even negative numbers.   Provide suitable error handling.<br>
Question 6<br>
	•	You are writing a web service to search customer objects:<br>
public class Customer {<br>
    String name;<br>
    String lastName;<br>
    ...<br>
     List<Address> addresses;<br>
}<br>
 <br>
public class Address {<br>
    String street1;<br>
    String street2;<br>
    String state;<br>
   ...<br>
}<br>
Define a searchCustomers API with the following requirements:<br>
	•	Return type is List<Customer><br>
	•	Caller will specify a search criteria with several search fields. Each search fieldName can be a customer fieldName, or an address fieldName. For instance, it should be possible to search for all customers living in a certain state with a given last name.<br>
	•	Caller can specify a sort fieldName and sort order in which the results will be returned.<br>
	•	Implementation will be stateless.<br>
	•	API must limit number of records returned by each call to protect against very large result sets.<br>
Write the API signature, and any other class required by that API. Write the API as a Java interface. Do not write an implementation for the interface.<br>
