/**
 * Shruti Bodhe
 * 2019-12-10
 */
package com.incture.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

}

public class StreamJava8 {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> productPriceList = new ArrayList<Float>();

		System.out.println("-----Filtering Collection without using Stream-----");
		for (Product product : productsList) {
			// filtering data of list
			if (product.price < 30000) {
				// adding price to a productPriceList
				productPriceList.add(product.price);
			}
		}
		System.out.println(productPriceList);

		System.out.println("\n-----Filtering Collection by using Stream-----");
		productPriceList = productsList.stream().filter(p -> p.price < 30000)// filtering_data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList);

		System.out.println("\n-----Stream to iterate any number of times-----");
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

		System.out.println("\n-----This is more compact approach for filtering data-----");
		productsList.stream().filter(product -> product.price == 28000)
				.forEach(product -> System.out.println(product.name));

		System.out.println("\n-----Finding the sum of numbers, or accumulating elements into a list-----");
		// accumulating price
		Float totalPrice1 = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price);
		System.out.println(totalPrice1);
		System.out.println("-----OR-----");
		System.out.println("-----More precise code-----");
		// accumulating price, by referring method of Float class
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum);
		System.out.println(totalPrice2);
		System.out.println("-----OR-----");
		System.out.println("-----Using Collectors's method to sum the prices-----");
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);

		System.out.println("\n-----Find Max and Min Product Price-----");
		System.out.println("-----max() method to get max Product price-----");
		Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productA.price);
		System.out.println("-----min() method to get min Product price-----");
		Product productB = productsList.stream().max((product1, product2) -> product1.price < product2.price ? 1 : -1)
				.get();
		System.out.println(productB.price);

		System.out.println("\n-----count() Method in Collection-----");
		// count number of products based on the filter
		long count = productsList.stream().filter(product -> product.price > 25000).count();
		System.out.println(count);

		System.out.println("\n-----Converting product List into Set-----");
		// filter product on the base of price
		// collect it as Set(remove duplicate elements)
		Set<Float> productPriceListSet = productsList.stream().filter(product -> product.price < 30000)
				.map(product -> product.price).collect(Collectors.toSet());
		System.out.println(productPriceListSet);

		System.out.println("\n-----Converting Product List into a Map -----");
		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(productPriceMap);

		System.out.println("\n-----Method Reference in stream-----");
		productPriceList = productsList.stream().filter(p -> p.price < 30000) // filtering_data
				.map(Product::getPrice) // fetching_price_by_referring_getPrice_method
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList);
	}

}
