import com.rhexam.q3.StringUtil2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class RHQ3Test {
    @Test
    public void testAppendNotUppercased() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String[] testItems = list.toArray(new String[0]);
        assertTrue("a,b,c,d equals abcd", StringUtil2.addStringItems(testItems, false).equals("abcd"));
    }

    @Test
    public void testAppendUppercased() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String[] testItems = list.toArray(new String[0]);
        assertTrue("a,b,c,d equals ABCD", StringUtil2.addStringItems(testItems, true).equals("ABCD"));
    }
}
