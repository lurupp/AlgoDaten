package de.hska.iwi.ads.solution.tree.BinarySearchTree;

import java.util.Map;

import de.hska.iwi.ads.dictionary.MapTest;

public class BinearySearchTreeTest extends MapTest {

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		return new BinarySearchTree<K, V>();
	}

}
