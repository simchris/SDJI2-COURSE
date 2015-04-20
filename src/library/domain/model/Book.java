package library.domain.model;

public class Book {

	private String ISBN;
	private String author;
	private String title;
	private int barcode;

	private AbstractBookInfo bookInfo;

	public Book(String ISBN, String author, String title, int barcode) {

		this.ISBN = ISBN;
		this.author = author;
		this.title = title;
		this.barcode = barcode;
		this.bookInfo = BookInfoFactory.getBookInfo(ISBN, author, title);
	}

	public String getISBN() {
		return ISBN;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getBarcode() {
		return barcode;
	}

	public AbstractBookInfo getInfo() {
		return bookInfo;
	}

	public String toString() {
		return ISBN + ", " + author + ", " + title + ", " + barcode;
	}

}
