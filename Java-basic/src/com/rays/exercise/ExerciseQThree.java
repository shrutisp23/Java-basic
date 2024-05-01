package com.rays.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExerciseQThree {
public static void main(String[] args) {
	List list = new ArrayList();

	list.add("Shruti ");
	list.add("anshul");
	list.add(12);
	list.add('B');

	ListIterator it = list.listIterator();

	while (it.hasNext()) {

		System.out.println(it.next());

	}
}
}
