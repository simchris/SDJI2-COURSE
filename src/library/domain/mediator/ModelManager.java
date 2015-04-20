package library.domain.mediator;

import library.domain.model.AbstractBookInfo;
import library.domain.model.BorrowerList;
import library.domain.model.ReserveList;
import library.domain.model.CdList;
import library.domain.model.BookList;
import library.domain.model.Book;
import library.domain.model.User;

public class ModelManager implements Model {

	private BorrowerList borrowerList;
	private ReserveList reserveList;
	private CdList cdList;
	private BookList bookList;

	public ModelManager() {
		this.bookList=new BookList();
		this.cdList=new CdList();
		this.borrowerList=new BorrowerList();
		this.reserveList=new ReserveList();

	}

	@Override
	public Book getBookByBarcode(int barcode) {
		return bookList.getBookByBarcode(barcode);
	}

	@Override
	public Book getBook(String ISBN) {
		return bookList.getBook(ISBN);
	}

	@Override
	public void addBorrower(String name, String email, String CPR) {
		this.borrowerList.add(name, email, CPR);
		
	}

	@Override
	public Book deleteBook(String ISBN) {
		Book temp = bookList.getBook(ISBN);
		bookList.removeBook(ISBN);
		return temp;
	}

	@Override
	public AbstractBookInfo getBookInfo(String ISBN) {
		return bookList.getBook(ISBN).getInfo();
	}

	@Override
	public void addBook(String ISBN, String author, String title, int barcode) {
		bookList.addBook(ISBN, author, title, barcode);
		
	}


	@Override
	public User getBorrower(String CPR) {
		return borrowerList.getUser(CPR);
	}

}
