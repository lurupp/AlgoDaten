package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public class ReverseMergeSort <E extends Comparable<E>>extends AbstractMergesort<E> {
	@Override
	protected void mergesort(E[] a, int left, int right) {
		int mid = 0;
		ReverseArray<E> sort = new ReverseArray<E>();
		if (left < right) {
			mid = (left + right) / 2;
			
			mergesort(a, left, mid);
			mergesort(a, mid + 1, right);
			
			sort.reverse(a,mid+1, right);
			merge(a,b,left,mid,right);
		}
	}

	private void merge(E[] a, E[] b, int left, int mid, int right) {
		
		int l = left;
		int r = right;
		int i = left;
		
			while(l<=r) {
				if(a[l].compareTo(a[r])<=0) {
					b[i] = a[l];
					l++;
				}else {
					b[i] = a[r];
					r--;
				}
				i++;
			}
		
		for (i = left; i <= right; i++) {
			a[i] = b[i];
		}
	}

}
