package chapter3.comparator.comparators;

import java.util.Comparator;

import chapter3.comparator.model.Book;

public class BookPublishYearComparator implements Comparator<Book> {

	private BookOrderType orderType;
	
	public BookPublishYearComparator(BookOrderType orderType) 
	{
		this.orderType = orderType;
	}
	
	@Override
	public int compare(Book book1, Book book2) {
		
		Integer book1PublishYear = book1.getPublishYear();
		Integer book2PublishYear = book2.getPublishYear();

		int orderResult = book1PublishYear.compareTo(book2PublishYear);
		
		if(this.orderType.equals(BookOrderType.DESC)) {
			
			orderResult = ~(orderResult - 1);
		}
		
		return orderResult;
	}
}
