package com.pck.practices;

import java.util.HashMap;

public class CharacterCount {

	
	public static void main(String[] args) {
		String s="aaabbbccc";
		
		HashMap<String, Integer> map= new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			String s1="";
			int count=1;
			s1=""+s.charAt(i);
			if(map.containsKey(s1)) {
				count=map.get(s1);
				count++;
				map.put(s1, count);
			}
			else {
				map.put(s1, count);
			}
		}
		System.out.println(map);
	}
}
