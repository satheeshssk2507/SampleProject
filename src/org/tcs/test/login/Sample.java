package org.tcs.test.login;

import java.util.LinkedList;
//similar datatype
public class Sample {
public static void main(String[] args) {

	LinkedList<Integer> li = new LinkedList<>();
	
	li.add(10);
	li.add(12);
	li.add(45);
	li.add(69);
	li.add(10);
	
	LinkedList<Integer> l2 = new LinkedList<>();
	
	l2.add(13);
	l2.add(22);
	l2.add(45);
	l2.add(26);
	l2.add(10);
	
	l2.retainAll(li);
	System.out.println(l2);
}
}
