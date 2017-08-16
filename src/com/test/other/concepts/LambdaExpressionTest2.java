package com.test.other.concepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionTest2 {

	public static void test() {

		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Neha");
		list.add("Pradeep");
		list.add("Kumar");
		list.add("Ajay");

		/* with inner class */
		/*
		  list.sort(new Comparator<String>() { public int compare (String o1,
		  String o2) { return o1.length() - o2.length(); } });
		*/

		/* with lambda expression */
		list.sort((o1, o2) -> o1.length() - o2.length());

		for (String s : list) {
			System.out.println(s);
		}
		
	}

	public static void main(String args[]) {
		test();
	}

}
