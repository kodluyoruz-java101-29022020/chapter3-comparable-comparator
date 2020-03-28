package chapter3.comparator.comparators;

import java.util.Comparator;

import chapter3.comparator.model.Book;

public class BookPublisherComparator implements Comparator<Book> {

	// BookOrderType.ASC enum sabitini kullanırsak küçükten büyüğe doğru sıralama yapacak şekilde geliştirme yapacağız.
	// BookOrderType.DESC enum sabitini kullanırsak küçükten büyüğe doğru sıralama yapacak şekilde geliştirme yapacağız.

	private BookOrderType orderType;
	
	public BookPublisherComparator(BookOrderType orderType) 
	{
		this.orderType = orderType;
	}
	
	@Override
	public int compare(Book book1, Book book2) {
		
		String publisher1 = book1.getPublisher();
		String publisher2 = book2.getPublisher();
		
		int orderResult = publisher1.compareTo(publisher2);
		
		if(this.orderType.equals(BookOrderType.DESC)) {
			
			// "compareTo" fonksiyonun doğal sıralama davranışı küçükten büyüğe doğrudur.
			// Bunu tersine çevirmek için gelen sonucun negatifini alırsak bu sefer büyükten küçüğe doğru sıralamaya başlar.
			// normalde "orderResult" değişkenini -1 ile çarpıp kolayca işi çözebilirdik.
			// fakat çarpma işlemi işlemcide ciddi bir maliyet.
			// Bu nedenle ilk derslerde öğrendiğimiz bitwise operatörleri kullanarak, bir sayının negatifini alıyoruz.
			
			orderResult = ~(orderResult - 1);
		}
		
		return orderResult;
	}

}
