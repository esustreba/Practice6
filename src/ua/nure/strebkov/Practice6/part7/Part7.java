package ua.nure.strebkov.Practice6.part7;

import java.util.Iterator;

public class Part7 {
	
	public static void main(String[] args) {
		Range range = new Range(3, 10, true);
		Iterator<Integer> iterator = range.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		Range range2 = new Range(3, 10, false);
		iterator = range2.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
