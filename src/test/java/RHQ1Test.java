import org.junit.Test;
import com.rhexam.q1.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
 * Your java class must be named RangeImplem, and must have a default contructor.
 * Example:
 * RangeImplem r=new RangeImplem();
 * r.newRange(1,5).isIn(3) => returns true
 * r.newRange(1,5).isIn(6) => returns false
 * r.newRange(1,5).add(r.newRange(8,10)).isIn(6) => returns false
 * Bonus: implement public Range subtract(Range r)
 *
 * Add range 'r' to this range, and return 'this'.
 * 'r' and this may denote disjoint ranges, for instance:
 *  r.newRange(1.5).add(r.newRange(8,10)) denotes a range
 * including 1,2,3,4,5,8,9,10
 *
*/

public class RHQ1Test {

    @Test
    public void testRangeMin() {
        Range r = new RangeImplem();
        assertTrue("r.newRange(1,5).Min() == 1",r.newRange(1,5).add(r.newRange(8,10)).min() == 1);
    }

    @Test
    public void testRangeMax() {
        Range r = new RangeImplem();
        assertTrue("r.newRange(1,5).Max() == 1",r.newRange(1,5).max() == 5);
    }

    @Test
    public void testRangeIsIn1() {
        Range r = new RangeImplem();
        assertTrue("r.newRange(1,5).isIn(3) => returns true",r.newRange(1,5).isIn(3));
    }

    @Test
    public void testRangeIsIn2() {
        Range r = new RangeImplem();
        assertFalse("r.newRange(1,5).isIn(6) => returns false",r.newRange(1,5).isIn(6));
    }

    @Test
    public void testRangeIsIn3() {
        Range r = new RangeImplem();
        assertFalse("r.newRange(1,5).add(r.newRange(8,10)).isIn(6) => returns false",r.newRange(1,5).add(r.newRange(8,10)).isIn(6));
    }

    @Test
    public void testDisjointAddRange() {
        Range r = new RangeImplem();
        Range disjointRange = r.newRange(1,5).add(r.newRange(8,10));

        assertTrue("1 is in",disjointRange.isIn(1));
        assertTrue("2 is in",disjointRange.isIn(2));
        assertTrue("3 is in",disjointRange.isIn(3));
        assertTrue("4 is in",disjointRange.isIn(4));
        assertTrue("5 is in",disjointRange.isIn(5));
        assertFalse("6 is out",disjointRange.isIn(6));
        assertFalse("7 is out",disjointRange.isIn(7));
        assertTrue("8 is in",disjointRange.isIn(8));
        assertTrue("9 is in",disjointRange.isIn(9));
        assertTrue("10 is in",disjointRange.isIn(10));

    }

    @Test
    public void testDisjointSubtractRange() {
        Range r = new RangeImplem();
        Range disjointRange = r.newRange(1,5).add(r.newRange(8,10)).subtract(r.newRange(2,3));

        assertTrue("1 is in",disjointRange.isIn(1));
        assertFalse("2 is out",disjointRange.isIn(2));
        assertFalse("3 is out",disjointRange.isIn(3));
        assertTrue("4 is in",disjointRange.isIn(4));
        assertTrue("5 is in",disjointRange.isIn(5));
        assertFalse("6 is out",disjointRange.isIn(6));
        assertFalse("7 is out",disjointRange.isIn(7));
        assertTrue("8 is in",disjointRange.isIn(8));
        assertTrue("9 is in",disjointRange.isIn(9));
        assertTrue("10 is in",disjointRange.isIn(10));

    }

}
