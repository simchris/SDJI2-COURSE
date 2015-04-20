package library.domain.mediator;

import RemoteTaskList;
import TaskServer;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import library.domain.model.AbstractBookInfo;
import library.domain.model.Book;
import library.domain.model.User;

public class RMILibraryServer extends UnicastRemoteObject implements IRemoteLibrary {

	private ModelManager modelManager;

	public RMILibraryServer() throws RemoteException {
		super();
		this.modelManager= new ModelManager();
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
	
	public static void main(String args[]) {
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			IRemoteLibrary rmiServer = new RMILibraryServer();
			Naming.rebind("Library", rmiServer);
			System.out.println("Starting server...");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
