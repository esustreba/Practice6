package ua.nure.strebkov.Practice6.part7;

import java.util.ArrayList;
import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private boolean reverse;
    ArrayList<Integer> list;

    public Range(int min, int max, boolean reverse) {
        this.reverse = reverse;
        list = fillList(min, max);
    }

    private ArrayList<Integer> fillList(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        if (reverse) {
            for (int i = min; i <= max; i++) {
                list.add(i);
            }
        } else {
            for (int i = max; i >= min; i--) {
                list.add(i);
            }

        }
        return list;
    }

    class RangeIterator implements java.util.Iterator<Integer> {
        private int mark = 0;

        @Override
        public boolean hasNext() {
            return mark < list.size();
        }

        @Override
        public Integer next() {
            return list.get(mark++);
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

}
