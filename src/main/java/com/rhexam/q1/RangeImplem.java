package com.rhexam.q1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jhorton on 11/5/16.
 *
 * Your java class must be named RangeImplem, and must have a default contructor.
 * Example:
 * RangeImplem r=new RangeImplem();
 * r.newRange(1,5).isIn(3) => returns true
 * r.newRange(1.5).isIn(6) => returns false
 * r.newRange(1.5).add(r.newRange(8,10)).isIn(6) => returns false
 * Bonus: implement public Range subtract(Range r)
 *
 */
public class RangeImplem implements Range {

    private Set<Integer> range;

    public RangeImplem() {
        //initialize storage with default value (empty)
        range = Collections.<Integer>emptySet();;
    }

    public RangeImplem(int from, int to) {
        //initialize storage with from to
        this.range = IntStream.rangeClosed(from, to).boxed()
                .collect(Collectors.toSet());
    }

    /**
     *     * Create a new Range object representing an integer interval starting from 'from' and 'to', both limits inclusive
     *    
     */
    @Override
    public Range newRange(int from, int to) {
        Range range = new RangeImplem(from, to);
        return range;
    }

    /**
     *     * Return if 'value' is in the range defined by this object
     *     * I will implement inclusive  
     */
    @Override
    public boolean isIn(int value) {
        return this.range.contains(Integer.valueOf(value));
    }

    /**
     *     * Return the minimum value in range
     *    
     */
    @Override
    public int min() {
        Integer min = this.range.stream().min(Comparator.comparing(Integer::valueOf)).get();
        return min.intValue();
    }

    /**
     *     * Return the maximum value in range
     *    
     */
    @Override
    public int max() {
        Integer max = this.range.stream().max(Comparator.comparing(Integer::valueOf)).get();
        return max.intValue();
    }

    /**
     *     * Add range 'r' to this range, and return 'this'.
     *     * 'r' and this may denote disjoint ranges, for instance:
     *     *  r.newRange(1.5).add(r.newRange(8,10)) denotes a range
     *     * including 1,2,3,4,5,8,9,10
     * <p>
     *    
     */
    @Override
    public Range add(Range r) {
        Set<Integer> range = ((RangeImplem)r).getRange();
        this.range.addAll(range);
        return this;
    }

    /*
    Bonus method
     */
    public Range subtract(Range r) {
        Set<Integer> range = ((RangeImplem)r).getRange();
        this.range.removeAll(range);
        return this;
    }

    protected Set<Integer> getRange() {
        return this.range;
    }

}
