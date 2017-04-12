package com.rhexam.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jhorton on 11/5/16.
 */
public class StringUtil2 {

    /**
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
     */


    /*
      I would say this is thread safe, as Arrays[] in java are immutable
     */
    public static String addStringItems(String[] items, boolean forceUpperCase) {

        List<String> stringList = new ArrayList<String>(Arrays.asList(items));

        String concatedStrings = stringList.stream().collect(Collectors.joining());
        return forceUpperCase ? concatedStrings.toUpperCase() : concatedStrings;

    }

}
