package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void getMap(Map<Integer, String> map) {
		Set<Integer> set = map.keySet();
		Iterator <Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer num = iter.next();
			if(num>=80) {
			String value = map.get(num);
			System.out.println(value);
			}
			}
	}
	
	public static void main(String[] args) {
		Map<Integer, String> scores = new HashMap<>();
		scores.put(90, "H");
		scores.put(78, "Hw");
		scores.put(80, "P");
		
		System.out.println("80 이상인 학생.");
		getMap(scores);
		System.out.println("-----------");
		
		List<String> list = new ArrayList<>();
		list.add("H");
		list.get(0);
		
		Set<String> set = new HashSet<>();
		set.add("H");
		set.add("Hw");
		Iterator<String> iterator = set.iterator(); // 반복해서 배열에 있는 값을 가져옴.
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str.toString());
		}
		
		
		Map<String, Integer> map = new HashMap<>(); //String, Integer를 key와 value의 값으로 변환
		map.put("H", 98); //key, value
		map.put("Hw", 90);
		map.put("H",80); // key 값은 중복이 될 수 없다. 중복이 된다면 위의 값을 덮어 쓰게 된다.
		
		Set<String> keySet = map.keySet(); //key의 값을 가져옴
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key); //key에 해당하는 value를 출력해줌
			System.out.println("key :" + key + ", value : " + value);
		}
		
		Set<Entry<String, Integer>> entSet = map.entrySet();
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while(entIter.hasNext()) {
			Entry<String, Integer> entry = entIter.next(); 
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key :" + key + ", value :" +value);
		}
	}
}
