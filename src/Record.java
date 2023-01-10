import java.util.ArrayList;

public class Record {
    private ArrayList<Book> books =new ArrayList<Book>();
    public Record() {
        books.add(new Book("母猪的产后护理","匿名","专业书",false));
        books.add(new Book("Java的养成计划","xuzhanyue","小说",false));
    }


    public Record(ArrayList<Book> books) {
        this.books = books;
    }


    /**
     * 获取
     * @return book
     */
    public Book getBook(int a){
        return books.get(a);
    }



    /**
     * 获取
     * @return books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * 设置
     * @param books
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String toString() {
        return "Record{books = " + books + "}";
    }
}
