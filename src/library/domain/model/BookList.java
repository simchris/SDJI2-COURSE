package library.domain.model;

import java.util.ArrayList;

public class BookList {

	private ArrayList<Book> bookList;

	public BookList() {
		this.bookList= new ArrayList<>();

	}

	public void addBook(String ISBN, String author, String title, int barcode) {
		bookList.add(new Book(ISBN, author, title, barcode));

	}

	public void removeBook(String ISBN) {
		int index=0;
		for(int i=0;i<bookList.size();i++)
		{
			if(bookList.get(i).getISBN().equals(ISBN))
			{
				index=i;
				break;
			}
		}
		bookList.remove(index);

	}

	public Book getBook(String ISBN) {
		int index=0;
		for(int i=0;i<bookList.size();i++)
		{
			if(bookList.get(i).getISBN().equals(ISBN))
				index=i;
		}
		return bookList.get(index);
	}
	
	public Book getBookByBarcode(int barcode) {
		int index=0;
		for(int i=0;i<bookList.size();i++)
		{
			if(bookList.get(i).getBarcode()== barcode)
				index=i;
		}
		return bookList.get(index);
	}
	
	

}
