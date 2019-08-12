package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray <E extends Comparable<E>> implements Reverse<E> {
	@Override
	public void reverse(E[] a, int from, int to) {
		
		E temp;
		if (from < to) {
			while (from < to) {
				temp = a[to];
				a[to] = a[from];
				a[from] = temp;
				to--;
				from++;
			}
		}
	}
}
