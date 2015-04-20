package library.domain.model;

import java.util.HashMap;

public class BookInfoFactory {

	private static HashMap<String, AbstractBookInfo> bookInfo = new HashMap<String, AbstractBookInfo>();

	public static AbstractBookInfo getBookInfo(String ISBN, String author, String title) {
		AbstractBookInfo item =  bookInfo.get(ISBN);
		if (item == null)
		{
			item = new BookInfo(ISBN,author,title);
			bookInfo.put(ISBN, item);
		}
		return item;
	}

}
