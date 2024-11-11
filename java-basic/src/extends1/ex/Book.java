package extends1.ex;

public class Book extends Item {
    protected String author;
    protected String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        System.out.println("이름 : " + name + " 가격" + price + "저자 : " + author + "제작년도 :" + isbn);
    }

}
