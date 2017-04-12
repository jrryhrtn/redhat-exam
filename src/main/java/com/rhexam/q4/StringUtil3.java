package com.rhexam.q4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jhorton on 11/5/16.
 */
public class StringUtil3 {


    /*
        •	itr1 and itr2 iterate over their contents in sorted order
	    •	The result is the combination of itr1 and itr2, in the same order itr1 and itr2 is sorted
	    •	The function should operate in O(n) time

     */
    public static List<String> combine1(Iterator<String> itr1, Iterator<String> itr2) {

        List<String> list = new ArrayList<String>();

        while (itr1.hasNext()) {
            String item = (String) itr1.next();
            list.add(item);
        }

        while (itr2.hasNext()) {
            String item = (String) itr2.next();
            list.add(item);
        }

        return list;
    }

    /*
        using the same constraints as above, but runs in O(1)
        * this is bonus question, create custom iterator to traverse both interators
     */


    public static Iterator<String> combine2(Iterator<String> itr1, Iterator<String> itr2) {
        List<String> list = new ArrayList<String>();

        while (itr1.hasNext() || itr2.hasNext()) {
            if (itr1.hasNext()) {
                String item = (String) itr1.next();
                list.add(item);
            } else if (itr2.hasNext()) {
                String item = (String) itr2.next();
                list.add(item);

            }

        }
        return list.iterator();

    }

}