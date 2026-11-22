package it.unibo.collections.sets;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * Program entry point.
     */
    public static void main() {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */

        Set<String> myTreeSet = new TreeSet<String>();

        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */

        for (int i = 1; i <= 20; i++){
            myTreeSet.add(String.valueOf(i));
        }

        /*
         * 3) Prints its content
         */

        for (final var s : myTreeSet){
            IO.println(s);
        }

        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */

        final var iterator = myTreeSet.iterator();
        while(iterator.hasNext()){
            final var s = iterator.next();
            if (Integer.parseInt(s)%3 == 0){
                iterator.remove();
            }
        }

        /*
         * 5) Prints the content of the Set using a for-each construct
         */

        for (final var s : myTreeSet){
            IO.println(s);
        }

        /*
         * 6) Verifies whether all the numbers left in the set are even
         */

        for (final var s : myTreeSet){
            if (Integer.valueOf(s)%2 != 0){
                System.err.println("ERR: Not all the numbers are even");
                return;
            }
        }
        IO.println("All the numbers are even");
    }
}
