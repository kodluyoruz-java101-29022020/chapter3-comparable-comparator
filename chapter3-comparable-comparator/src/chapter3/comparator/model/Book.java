package chapter3.comparator.model;

public class Book implements Comparable<Book> {

	private String name;
	
	private String publisher;
	
	private int publishYear;
	
	private int pageCount;
	
	private double price;
	
	
	public Book(String name, String publisher, int publishYear, int pageCount, double price) {
		
		this.name = name;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.pageCount = pageCount;
		this.price = price;
	}
	

	public String getName() {
		return name;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public int getPageCount() {
		return pageCount;
	}

	public double getPrice() {
		return price;
	}


	@Override
	public int compareTo(Book book) {
		// doğal sıralamayı kitap ismine göre yapıyoruz.
		return this.getName().compareTo(book.getName());
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(this.getName());
		builder.append(" - ");
		builder.append(this.getPublisher());
		builder.append(" - ");
		builder.append(this.getPublishYear());
		builder.append(" - ");
		builder.append(this.getPageCount());
		builder.append(" - ");
		builder.append(this.getPrice());
		builder.append("]");
		
		return builder.toString();
	}
}
