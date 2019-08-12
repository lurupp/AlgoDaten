package de.hska.iwi.ads.solution.list.DoubleLinkedList;

import de.hska.iwi.ads.dictionary.AbstractDictionary;
import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;
import de.hska.iwi.ads.sorting.AbstractMergesort;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {

	public V get(Object o) {

		/*
		 * x = list-search(list,k) 
		 * x = list,head 
		 * while x != null and x.key != k
		 *  x =  x.next
		 */

		@SuppressWarnings("unchecked")
		K key = (K) o;														// cast key nach K
		ListElement index = head;											//index initalisieren mit erstem element bzw head
		while (index != null && index.entry.getKey().compareTo(key) != 0) { //while �ber list
			index = index.next;												//neuen wert falls nicht gefunden...
		}
		if (index == null) {												//falls list leer ist
			return null;
		} else {
			return index.entry.getValue();									//r�chgabe von value falls gefunden
		}
	}

	public V put(K key, V value) {

		/*
		 * list-insert(list, x)
		 *  x.next = list.head
		 *   if list.head != null
		 * list.head.previous = x 
		 * else
		 *  list.tail = x 
		 *  list.head = x 
		 * x.previous = null
		 */

		ListElement index = head;
		if (head != null) {											//falls leereliste
			while (index != null) {									//durchgehen
				if (index.entry.getKey().compareTo(key) == 0) {		//vergleich um key zu finden
					V old = index.entry.getValue();					//alter wert von value
					index.entry.setValue(value);					//neues value einsetzen
					return old;										//alten value zur�ck geben
				}
				index = index.next;
			}
		}

		ListElement prev = null; //leere liste
		Entry<K, V> newEntry = new SimpleEntry<K, V>(key, value);	//neue eingabe
		ListElement neu = new ListElement(newEntry, prev, head);	//neues element vor head
		if (head != null) {
			head.previous = neu;									//neu ist vorhergendes von head.. bzw neues

		}
		head = neu;													//head ist neues element nach einsetzen
		size++;														//lsite verl�ngern
		return null;												//r�ckgabe nach einf�gen von nicht vorhandenem value

	}

}
