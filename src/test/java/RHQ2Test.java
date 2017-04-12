import org.junit.Test;
import com.rhexam.q2.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class RHQ2Test {

    @Test
    public void testAppendNotUppercased() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String[] testItems = list.toArray(new String[0]);
        assertTrue("a,b,c,d equals abcd", StringUtil1.addStringItems(testItems, false).equals("abcd"));
    }

    @Test
    public void testAppendUppercased() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String[] testItems = list.toArray(new String[0]);
        assertTrue("a,b,c,d equals ABCD", StringUtil1.addStringItems(testItems, true).equals("ABCD"));
    }

}
