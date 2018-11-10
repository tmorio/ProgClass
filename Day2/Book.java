class Book{
	String title;
	String author;
	int price;

	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void showBook(){
		System.out.println("title:" + title);
		System.out.println("author:" + author);
		System.out.println("price:" + price);
	}

	public static void main(String[] args){
		Book Book1 = new Book("Java入門", "半田", 2500);
		Book Book2 = new Book("C入門", "金田", 2000);
		Book Book3 = new Book("苦しんで覚えるC言語", "MGames", 2800);
		System.out.println("----------一冊目の情報----------");
		Book1.showBook();
		System.out.println("----------二冊目の情報----------");
		Book2.showBook();
		System.out.println("----------三冊目の情報----------");
		Book3.showBook();

	}
}
