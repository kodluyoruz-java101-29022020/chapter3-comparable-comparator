package chapter3.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import chapter3.comparable.model.Order;

public class Main {

	public static void main(String[] args) {
	
		
		
		runObjectBaseOrderSample();
		
		
		
	}
	
	public static void runStringList() {
		
		List<String> carBrands = new ArrayList<String>();
		carBrands.add("BMW");
		carBrands.add("Mercedes");
		carBrands.add("Porsche");
		carBrands.add("Mazda");
		carBrands.add("Honda");
		carBrands.add("Fiat");
		carBrands.add("Ferrari");
		carBrands.add("Audi");
		
		System.out.println("Sıralamasız haliyle:");
		for(String brand : carBrands) {
			System.out.println(brand);
		}
		System.out.println();
		
		Collections.sort(carBrands);
		
		System.out.println("Küçükten büyüğe doğal sıralanmış haliyle:");
		for(String brand : carBrands) {
			System.out.println(brand);
		}
		System.out.println();
		
		Comparator<String> reverseComparator = Collections.reverseOrder();
		Collections.sort(carBrands, reverseComparator);
		
		System.out.println("Büyükten küçüğe doğal sıralanmış haliyle:");
		for(String brand : carBrands) {
			System.out.println(brand);
		}
		System.out.println();
		
	}
	
	public static void runIntegerList() {
		
		List<Integer> ageList = new ArrayList<Integer>();
		ageList.add(21);
		ageList.add(30);
		ageList.add(26);
		ageList.add(90);
		ageList.add(56);
		ageList.add(71);
		ageList.add(67);
		ageList.add(10);
		
		System.out.println("Sıralamasız haliyle:");
		for(Integer age : ageList) {
			System.out.println(age);
		}
		System.out.println();
		
		Collections.sort(ageList);
		
		System.out.println("Küçükten büyüğe doğal sıralanmış haliyle:");
		for(Integer age : ageList) {
			System.out.println(age);
		}
		System.out.println();
		
		Comparator<Integer> reverseComparator = Collections.reverseOrder();
		Collections.sort(ageList, reverseComparator);

		
		System.out.println("Büyükten küçüğe doğal sıralanmış haliyle:");
		for(Integer age : ageList) {
			System.out.println(age);
		}
		System.out.println();
	}
	
	public static void runPrimitiveBaseOrderSample() {
		
		double price1 = 100.2;
		double price2 = 90.3;
		
		// Eğer price1 > price2 ise 1 döndürür.
		System.out.println(   Double.compare(price1, price2)   );	
		
		
		int age1 = 21;
		int age2 = 34;
		// Eğer age1 < age2 ise -1 döndürür.
		System.out.println(  Integer.compare(age1, age2)  );
		
		
		long pageCount1 = 1000;
		long pageCount2 = 1000;
		// Eğer pageCount1 == pageCount2 ise 0 döndürür.
		System.out.println(  Long.compare(pageCount1, pageCount2));
	}
	
	public static void runObjectBaseOrderSample() {
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(1001.5));
		orders.add(new Order(90.5));
		orders.add(new Order(1001.1));
		orders.add(new Order(20));
		orders.add(new Order(78.3));
		orders.add(new Order(9.4));
		
		System.out.println("Sıralamasız haliyle:");
		for(Order order : orders) {
			System.out.println(order);
		}
		System.out.println();
		
		Collections.sort(orders);
		
		System.out.println("Küçükten büyüğe doğal sıralanmış haliyle:");
		for(Order order : orders) {
			System.out.println(order);
		}
		System.out.println();
		
		Comparator<Order> reverseComparator = Collections.reverseOrder();
		Collections.sort(orders, reverseComparator);
		
		System.out.println("Büyükten küçüğe doğal sıralanmış haliyle:");
		for(Order order : orders) {
			System.out.println(order);
		}
		System.out.println();
	}

}
