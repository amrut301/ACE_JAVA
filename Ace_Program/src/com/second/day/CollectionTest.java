package com.second.day;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

/**
 * @author amrmalaj
 *
 */
public class CollectionTest {

	public static void main(String[] args) {
	
		/*
		 * TreeMap<StringBuffer,Integer> tm = new TreeMap<StringBuffer,Integer>();
		 * tm.put(new StringBuffer("f"), 1); tm.put(new StringBuffer("g"), 1);
		 */
		
//		System.out.println(tm);
		
		Comparator<? super String> c = (x,y)->{
			if(x.compareTo(y)==0) return 0;
			if(x.compareTo(y)>0) return -1;
			if(x.compareTo(y)<0) return 1;
			return 0;
		};
		Map<String, Integer> map  = new TreeMap<String, Integer>(c);
		map.put("A", 5);
		map.put("Z", 1);
		map.put("B", 4);
		map.put("D", 2);
		map.put("C", 3);
		System.out.println(map);
		Queue<String> q =new PriorityQueue<String>(c);
		q.add("A");
		q.add("F");
		q.add("B");
		q.add("D");
		q.add("C");
		System.out.println(q);
		q.poll();
		
		System.out.println(q.stream().findFirst());
		
	}
	
	
}
