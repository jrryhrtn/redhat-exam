import com.rhexam.q4.StringUtil3;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.rhexam.q4.StringUtil3.combine2;
import static org.junit.Assert.assertTrue;

public class RHQ4Test {
    @Test
    public void testAppendOrder() {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2 = new ArrayList<String>();
        list1.add("d");
        list1.add("e");
        list1.add("f");

        List<String> listExspected = new ArrayList<String>();
        listExspected.add("a");
        listExspected.add("b");
        listExspected.add("c");
        listExspected.add("d");
        listExspected.add("e");
        listExspected.add("f");

        assertTrue("a,b,c + d,e,f equals a,b,c,d,e,f", StringUtil3.combine1(list1.iterator(), list2.iterator()).equals(listExspected));
    }

    @Test
    public void testAppendOrderOof1() {
        List<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2 = new ArrayList<String>();
        list1.add("d");
        list1.add("e");
        list1.add("f");

        List<String> listExspected = new ArrayList<String>();
        listExspected.add("a");
        listExspected.add("b");
        listExspected.add("c");
        listExspected.add("d");
        listExspected.add("e");
        listExspected.add("f");

        Iterator<String> itr = StringUtil3.combine2(list1.iterator(), list2.iterator());
        List<String> listActual = new ArrayList<String>();

        while (itr.hasNext()) {
            String item = (String) itr.next();
            listActual.add(item);
        }

        assertTrue("a,b,c + d,e,f equals a,b,c,d,e,f", listExspected.equals(listActual));

    }

}