package testing;

public class BiblioBook {
	private String author;
	private String title;
	private String year;

	public BiblioBook() {
	}

	public BiblioBook(String author, String title, String year) {
		this.author = author;
		this.title = title;
		this.year = year;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getTitle() {
		return this.title;
	}

	public String getYear() {
		return this.year;
	}
}
