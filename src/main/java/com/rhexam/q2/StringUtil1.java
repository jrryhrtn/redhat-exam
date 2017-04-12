package com.rhexam.q2;

/**
 * Created by jhorton on 11/5/16.
 */
public class StringUtil1 {

    /**
     *  Given there are 50000 items in the input String array, the
     *  function must add all array items to outputString and then return
     *  the outputString. if forceUpperCase is true, the return string must be upper case.
     */

     /*
      I would say this is thread safe, as Arrays[] in java are immutable
     */
    public static String addStringItems(String[] items, boolean forceUpperCase) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < items.length; i++) {
            builder.append(items[i]);
        }
        return forceUpperCase ? builder.toString().toUpperCase() : builder.toString();

    }


}
