/**
 * Shruti.Bodhe
 * 2019-11-29
 */
package com.incture.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

//Complexity is log(n)
public class TreeMapImplementation {

	public static void main(String[] args) {

		// Creating an empty TreeMap
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		System.out.println("Intialized TreeMap : " + tree_map);

		// Create add and display Tree map
		{
			// Mapping string values to int keys
			tree_map.put(10, "a");
			tree_map.put(15, "b");
			tree_map.put(20, "c");
			tree_map.put(25, "d");
			tree_map.put(30, "e");
			System.out.println("Added Data inside TreeMap : " + tree_map);
		}

		// Contains key
		{
			System.out.println("Tree_Map Contains key 20 : " + tree_map.containsKey(20));
			System.out.println("Tree_Map Contains key 5 : " + tree_map.containsKey(5));
		}
		// Contains value
		{
			// tree_map.put(6, "a");
			System.out.println("Tree_Map Contains value 'a' : " + tree_map.containsValue("a"));
			System.out.println("Tree_Map Contains value 'z' : " + tree_map.containsValue("z"));
		}
		// Get First Key and Last Key
		{
			System.out.println("Get First Key Tree_Map  : " + tree_map.firstKey());
			System.out.println("Get Last Key Tree_Map  : " + tree_map.lastKey());
		}
		// Remove Key-Value
		{
			tree_map.remove(10);
			System.out.println("After Removing By key 10, TreeMap: " + tree_map);
		}
		// Get subMap
		{
			System.out.println("Get Submap from 20 to 30 key, TreeMap: " + tree_map.subMap(20, 30)
					+ " it does not contains the last key ie. 30");
			System.out.println("Get Submap from 20 to 30 key, TreeMap: " + tree_map.subMap(20, false, 30, true));
		}

		// Converting Map into Tree Map
		{
			// Creating a Map
			Map<Integer, String> hash_map = new HashMap<Integer, String>();

			// Mapping string values to int keys
			hash_map.put(20, "a");
			hash_map.put(15, "b");
			System.out.println("Map hash_map: " + hash_map);

			// Creating the TreeMap using the Map
			TreeMap<Integer, String> tree_map1 = new TreeMap<Integer, String>(hash_map);
			System.out.println("Map to TreeMap: " + tree_map1);
			// or
			tree_map1.putAll(hash_map);
			System.out.println("Map toTreeMap using putAll: " + tree_map1);
		}

		// Sorted Map to Tree map
		{
			// Creating a SortedMap
			SortedMap<Integer, String> sorted_map = new ConcurrentSkipListMap<Integer, String>();

			// Mapping string values to int keys
			sorted_map.put(1, "a");
			sorted_map.put(5, "b");
			sorted_map.put(2, "c");
			sorted_map.put(4, "d");
			sorted_map.put(0, "e");
			System.out.println("sorted_map: " + sorted_map);

			// Creating the TreeMap using the SortedMap
			TreeMap<Integer, String> tree_map2 = new TreeMap<Integer, String>(sorted_map);
			tree_map.put(3, "r");

			// Displaying the TreeMap
			System.out.println("Sorted map to TreeMap: " + tree_map2);
			tree_map2.clear();
			System.out.println("TreeMap cleared: " + tree_map2);
		}

	}

}
