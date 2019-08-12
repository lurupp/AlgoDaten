/*
package de.hska.iwi.ads.solution.search.BinarySearch;

import de.hska.iwi.ads.search.Search;

public class BinarySearch implements Search {

	@Override
	public int search(Comparable[] a, Comparable key, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;

		//best fall
		if (key.compareTo(a[mid]) == 0) {

			return mid;
		}
		//fall 1
			else if(key.compareTo(a[left])<0) {
				return left-1;
			}
		//fall 2
			else if(key.compareTo(a[right])>0) {
				return right +1;
			}
		if(key.compareTo(a[mid]) < 0) {
			return search(a, key, left, mid-1);
		
			}
		else if(key.compareTo(a[right])>0) {
			}else {
			return search(a, key,mid+1, right);
		}
		return mid;
			}
}
*/

package de.hska.iwi.ads.solution.search.BinarySearch;

import de.hska.iwi.ads.search.Search;

public class BinarySearch implements Search {

	@Override
	public int search(Comparable[] a, Comparable key, int left, int right) {
		
		
		if (left > right) {
			return -1; //IndexOutOfBonds 
		}
		
		
		int mid = (left + right) / 2;
		
		
			while(key.compareTo(a[mid])==0){
				mid = mid--;
			}
			if(key.compareTo(a[mid])==0){
				return mid;
			}
		
		//fall 1
			if(key.compareTo(a[left])<0) {
				return left-1;
			}
		
		
		//fall 2
			else if(key.compareTo(a[right])>0) {
				return right +1;
			}
		
		
		//rekursiver aufruf
		if(key.compareTo(a[mid]) < 0) {
			return search(a, key, left, mid-1);
			}
		else {
			return search(a, key,mid+1, right);
		}
			}
}