package chapter3.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chapter3.comparator.comparators.BookOrderType;
import chapter3.comparator.comparators.BookPublishYearComparator;
import chapter3.comparator.comparators.BookPublisherComparator;
import chapter3.comparator.model.Book;

public class Main {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Java Book", "Penguen Yayınevi", 2019, 500, 50));
		books.add(new Book("Python Book", "Panda Yayınevi", 2012, 250, 45.5));
		books.add(new Book("C# Book", "Elma Yayınevi", 2020, 660, 70));
		books.add(new Book("Ruby Book", "Beyaz Balina Yayınevi", 2014, 450, 28));
		books.add(new Book("Go Book", "Kanarya Yayınevi", 2017, 420, 80));
		books.add(new Book("Javascript Book", "ABC Yayınevi", 2010, 300, 20));
		
		
		runPublisherComparatorSample(books);
		
		//runPublishYearComparatorSample(books);
		
	}
	
	private static void runPublisherComparatorSample(List<Book> books) {
		
		// "sort" fonksiyonuna herhangi bir Comparator vermedik. 
		// Bu nedenle "Book" sınıfı içindeki "compareTo" metoduna göre sıralayacaktır.
		// Doğal sıralama yapıp kitap ismine göre küçükten büyüğe doğru sıralama yapacaktır.
		Collections.sort(books);
		
		
		BookPublisherComparator bookPublisherComparatorDesc = new BookPublisherComparator(BookOrderType.DESC);
		Collections.sort(books, bookPublisherComparatorDesc);
		
		System.out.println("Yayınevi bilgisine göre büyükten küçüğe doğru sıralanmış:");
		printAll(books);
		
		
		BookPublisherComparator bookPublisherComparatorAsc = new BookPublisherComparator(BookOrderType.ASC);
		Collections.sort(books, bookPublisherComparatorAsc);
		
		System.out.println("Yayınevi bilgisine göre küçükten büyüğe doğru sıralanmış:");
		printAll(books);
		
	}
	
	public static void runPublishYearComparatorSample(List<Book> books) {
		
		Collections.sort(books);
		
		BookPublishYearComparator bookPublishYearComparatorDesc = new BookPublishYearComparator(BookOrderType.DESC);
		Collections.sort(books, bookPublishYearComparatorDesc);
		
		System.out.println("Yayınlanma yılına göre büyükten küçüğe doğru sıralanmış:");
		printAll(books);
		
		
		BookPublishYearComparator bookPublishYearComparatorAsc = new BookPublishYearComparator(BookOrderType.ASC);
		Collections.sort(books, bookPublishYearComparatorAsc);
		
		System.out.println("Yayınlanma yılına göre küçükten büyüğe doğru sıralanmış:");
		printAll(books);
		
	}

	private static void printAll(List<Book> books) {
		
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println();
	}
}
