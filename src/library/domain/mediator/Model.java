package library.domain.mediator;

import library.domain.model.AbstractBookInfo;
import library.domain.model.Book;
import library.domain.model.User;

public interface Model {

	public abstract void addBorrower(String name, String email, String CPR);

	public abstract void addBook(String ISBN, String author, String title, int barcode);

	public abstract Book deleteBook(String ISBN);

	public abstract User getBorrower(String CPR);
	
	public abstract AbstractBookInfo getBookInfo(String ISBN);
	
	public abstract Book getBookByBarcode(int barcode);
	
	public abstract Book getBook(String ISBN);

}
