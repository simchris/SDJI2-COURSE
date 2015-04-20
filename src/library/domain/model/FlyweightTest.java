package library.domain.model;

public class FlyweightTest {

	public static void main(String[] args) {
		Book[] books= new Book[10];
		books[0]= new Book("1234", "Jonas","DaShit" , 1233);
		books[1]= new Book("1234", "Jonas","DaShit" , 1234);
		books[2]= new Book("1234", "Jonas","DaShit" , 1234);
		books[3]= new Book("1111", "Paulius","NoMoney" , 1111);
		books[4]= new Book("2222", "Steffan","INeedMoneY" , 2222);
		books[5]= new Book("2222", "Steffan","INeedMoneY" , 3333);
		books[6]= new Book("2222", "Steffan","INeedMoneY" , 4444);
		books[7]= new Book("2222", "Steffan","INeedMoneY" , 5555);
		books[8]= new Book("2222", "Steffan","INeedMoneY" , 6666);
		books[9]= new Book("1111", "Paulius","NoMoney" , 7777);
		
		
		System.out.println("Book objects:");
		for (int i = 0; i < books.length; i++) {
			System.out.printf("%-40s %d\n", books[i], books[i].getInfo().hashCode());
		}

	}

}
