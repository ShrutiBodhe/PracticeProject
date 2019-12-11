/**
 * Shruti Bodhe
 * 2019-12-10
 */
package com.incture.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product2 {
	int id;
	String name;
	float price;

	public Product2(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpr {

	public static void main(String[] args) {
		List<Product2> list = new ArrayList<Product2>();

		// Adding Product2s
		list.add(new Product2(1, "HP Laptop", 25000f));
		list.add(new Product2(3, "Keyboard", 300f));
		list.add(new Product2(2, "Dell Mouse", 150f));

		System.out.println("-----Sorting on the basis of name-----");
		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		// Display using lambda
		list.forEach(p -> {
			System.out.println(p.id + " " + p.name + " " + p.price);
		});

		// Handling null pointer
		Collections.sort(list, new Comparator<Product2>() {
			@Override
			public int compare(Product2 dto1, Product2 dto2) {
				return Comparator.nullsFirst(String::compareTo).compare(dto1.name, dto2.name);
			}
		});

	}

}
