package library.domain.mediator;

import library.domain.model.AbstractBookInfo;
import library.domain.model.Book;
import library.domain.model.User;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMILibraryClient extends UnicastRemoteObject implements IRemoteLibrary {

	private IRemoteLibrary iRemoteLibrary;

	public RMILibraryClient() throws RemoteException {

	}

	public void start() {

	}

	@Override
	public void addBorrower(String name, String email, String CPR) {
		
		
	}

	@Override
	public void addBook(String ISBN, String author, String title, int barcode) {
		
		
	}

	@Override
	public Book deleteBook(String ISBN) {
		
		return null;
	}

	@Override
	public User getBorrower(String CPR) {
		
		return null;
	}

	@Override
	public AbstractBookInfo getBookInfo(String ISBN) {
		
		return null;
	}

	@Override
	public Book getBookByBarcode(int barcode) {
		
		return null;
	}

	@Override
	public Book getBook(String ISBN) {
		
		return null;
	}

}
