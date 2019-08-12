package de.hska.iwi.ads.solution.search.BinarySearch;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class BinarySearchTest extends SearchTest {
	
	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		BinarySearch search = new BinarySearch();
		return search;
	}
	

}
