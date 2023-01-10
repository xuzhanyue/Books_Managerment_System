public class Book {
    private String name;
    private String author;
    private String type;
    private boolean isBorrowed;


    public Book() {
    }

    public Book(String name, String author, String type, boolean isBorrowed) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return isBorrowed
     */
    public boolean isIsBorrowed() {
        return isBorrowed;
    }

    /**
     * 设置
     * @param isBorrowed
     */
    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String toString() {
        return "Book{name = " + name + ", author = " + author + ", type = " + type + ", isBorrowed = " + isBorrowed + "}";
    }


}
