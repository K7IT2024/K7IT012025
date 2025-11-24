package com.k7it;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

//		ArrayList list =  new ArrayList();
//		list.add("abc");
//		list.add("pqr");
//		list.add("123");
//		list.add("456");
//		
//		System.out.println(list);
//		
//		list.add(1,"xyz");
//		
//		System.out.println(list);
//		
//		System.out.println(list.get(4));//456
//		System.out.println(list.get(1));//xyz
//		
//		System.out.println(list.size());
//		System.out.println(list);

		ArrayList list1 = new ArrayList(10);
		list1.add("abc");
		list1.add("123");

		ArrayList list2 = new ArrayList();

		list2.add("pqr");
		list2.add("xyz");
		list2.add("456");

		System.out.println(list1);
		System.out.println(list2);
		System.out.println("adding list1 into list2 using addAll");
		list2.addAll(list1);
		System.out.println(list2);

		System.out.println("adding list1 into list2 using addAll with specified index");
		list2.addAll(1, list1);
		System.out.println(list2);

		System.out.println(list1.isEmpty());

		System.out.println(list2.containsAll(list1));

		list1.set(1, "efg");

		if (!list1.isEmpty()) {
			for (Object v : list1) {
				System.out.println(v);
			}
		}

		System.out.println("is sneha avaiable in list1:" + list1.contains("sneha"));
		System.out.println("is abc avaiable in list1:" + list1.contains("abc"));

		System.out.println("index of sneha avaiable in list1:" + list1.indexOf("sneha"));
		System.out.println("index of  abc avaiable in list1:" + list1.indexOf("abc"));

		System.out.println(list2.containsAll(list1));

		System.out.println(list2.subList(2, 4));

		// condition? true statement : false statement;

		int i = 10;
		if (i == 10) {
			System.out.println("you are hero");
		} else {
			System.out.println("you are heroine");
		}

		System.out.println(i == 10 ? "you are hero" : "you are heroine");

		ArrayList list3 = new ArrayList();
		list3.add("roopa");
		list3.add("deepa");
		list3.add("madhu");
		list3.add("sneha");
		list3.add("madhu");

		System.out.println(list3);
		
		// 5th way reading using enhanced for loop:
		for( Object element :list3) {
			System.out.println(element);
		}
		// 6th iterator()
		System.out.println("iterator");
//		Iterator it =  list3.iterator();
//		//list3.add("K7it");
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		ListIterator  it =  list3.listIterator();
		System.out.println("reading forward direction:");
		while(it.hasNext()) {
			System.out.println(it.next());
			it.set("java");
		}
		it.add("k7it");
		
		System.out.println("reading backward direction :");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println("for each");
		list3.forEach(e -> System.out.println(e));
		
		list3.forEach(e -> {
			System.out.println(e);
			System.out.println("I am at lamda exprssion body");
		});
		System.out.println("using double colon");
		list3.forEach(System.out::println);
		
		//list3.add("java");
		//System.out.println(list3);
//		for(;it.hasNext();) {
//			System.out.println(it.next());
//		}
		
		
		
		
//       System.out.println("replace all");
//       list3.replaceAll(e -> e.equals("madhu")?"K7it":"java");
//       System.out.println(list3);
//       list3.replaceAll(e -> "K7it");
//       System.out.println(list3);
	}
}
