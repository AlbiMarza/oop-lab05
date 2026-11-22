package it.unibo.collections.comparators;

import java.util.TreeSet;
import java.lang.Math;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * Program entry point.
     */
    public static void main() {

        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings.
         * To order the set, define a new Comparator in a separate class.
         * The comparator must convert the strings to double, then compare the doubles to find the biggest.
         * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
         */

        TreeSet<String> myTreeSet = new TreeSet<>(new CustomComparator());

        /*
         * 2) Inserts in the set a hundred strings containing randomly generated numbers
         * (use Math.random(), and convert to String appropriately)
         */

        for (int i = 0; i < 100; i++){
            myTreeSet.add(String.valueOf(Math.random()));
        }

        /*
         * 3) Prints the set, which must be ordered
         */
        int count = 0;
        for (final var s : myTreeSet){
            IO.println(s);
            count++;
        }
        IO.println("Number count: "+count);
    }
}
