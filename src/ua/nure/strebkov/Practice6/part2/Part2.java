package ua.nure.strebkov.Practice6.part2;

import java.util.*;

public class Part2 {
	private static int size = 10000;

	public static long circle(List<Integer> list) {
		long time = System.currentTimeMillis();
		int count = 0;
		Iterator<Integer> it = list.iterator();
		while (list.size() > 1) {
			if (it.hasNext()) {
				it.next();
				count++;
				if (count == 3) {
					it.remove();
					count = 0;
				}
			} else it = list.iterator();
		}

		return System.currentTimeMillis() - time;
	}

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
		}

		System.out.println("Total time for ArrayList: " + circle(arrayList));

		List<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			linkedList.add(i);
		}

		System.out.println("Total time for LinkedList: " + circle(linkedList));
	}

}