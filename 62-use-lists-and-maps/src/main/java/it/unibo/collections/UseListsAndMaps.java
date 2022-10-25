package it.unibo.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private static final int ELEM = 2_000;
    private static final int ELEM = 100_000;  

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {

        ArrayList<Integer> array = new ArrayList<>();

        int i = 0;
        for (i = 1_000 ; i < ELEM ; i++) {
            array.add(i);
        }
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(array);
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        int temp = array.get(array.size()/array.size());
        array.set(array.size()/array.size() , array.get(array.size()));
        array.set(array.size(), temp);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        for (int a : array){
            System.out.print("" + array.get(a) + " ");
        }
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        //to do, devi calcolare per entrambe e devi pulirle prima di inserire nuovi elementi
        long time = System.nanoTime();
        for (int i = 1; i <= ELEMS; i++) {
            array.add(Integer.toString(i));
        }
        time = System.nanoTime() - time;
        final var millis = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println(
            "Converting "
                + set.size()
                + " ints to String and inserting them in a Set took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example PerfTest.java.
         */
        Map<String, Integer> map = new HashMap<>();
        String Africa = new String(); 
        map.put(Africa, 1_110_63_000 );
        String Americas = new String(); 
        map.put(Americas, 972_005_000 );
        String Antartica = new String(); 
        map.put(Antartica, 0 );
        String Asia = new String(); 
        map.put(Asia, (int) 4_298_723_000d );
        String Europe = new String(); 
        map.put(Europe, 742_452_000 );
        String Oceania = new String(); 
        map.put(Oceania, 38_304_000 );

        long population = 0;
        for(Entry<String, Integer> b : map.entrySet()){
            population += map.get(b);
        }

        System.out.println("" + population);
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
