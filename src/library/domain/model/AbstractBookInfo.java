package library.domain.model;

public abstract class AbstractBookInfo {

	private String ISBN;

	private String author;

	private String title;

	public AbstractBookInfo(String ISBN, String author, String title) {
		this.ISBN=ISBN;
		this.author=author;
		this.title=title;
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

}
