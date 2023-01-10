import java.util.Scanner;

public class UserService {
    /**
     * 添加图书
     *
     * @param bookList
     */
    public void add(Record bookList) {
        System.out.println("新增图书!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要新增图书的名字:");
        String name = scanner.next();
        System.out.println("请输入作者的名字:");
        String author = scanner.next();
        System.out.println("请输入图书的类型:");
        String type = scanner.next();
        Boolean isBorrowed = false;
        Book book = new Book(name, author, type, isBorrowed);
        bookList.getBooks().add(book);
        System.out.println("添加成功!");
    }

    /**
     * 查找书籍
     *
     * @param bookList
     */
    public void find(Record bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要查找的书名:");
        String name = scanner.next();
        boolean flag = true;
        for (int i = 0; i < bookList.getBooks().size(); i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                flag = false;
                System.out.println("找到了!   信息如下:");
                System.out.println(bookList.getBook(i));
            }
        }
        if (flag) {
            System.out.println("没有找到该书");
        }
    }

    /**
     * 删除书籍
     *
     * @param bookList
     */
    public void delete(Record bookList) {
        System.out.println("请输入你想要删除的书籍:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean flag = true;
        for (int i = 0; i < bookList.getBooks().size(); i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                flag = false;
                bookList.getBooks().remove(i);
                System.out.println("删除成功!");
            }
        }
        if (flag) {
            System.out.println("没有找到该书");
        }
    }

    /**
     * 借出书籍
     *
     * @param bookList
     */
    public void sorrowBook(Record bookList) {
        System.out.println("请输入你想要借的书:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean flag = true;
        for (int i = 0; i < bookList.getBooks().size(); i++) {
            if (bookList.getBook(i).getName().equals(name)) { //查找到该书籍在图书馆中
                flag = false;
                if (bookList.getBook(i).isIsBorrowed() == true) {
                    System.out.println("借书失败，该书已被借出");
                } else {
                    System.out.println("借出成功!");
                    bookList.getBook(i).setIsBorrowed(true);

                }
            }
        }
        if (flag) {
            System.out.println("未查找到该书");
        }
    }

    /**
     * 归还书籍
     *
     * @param bookList
     */
    public void returnBook(Record bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要归还的书籍:");
        String name = scanner.next();
        boolean flag = true;
        for (int i = 0; i < bookList.getBooks().size(); i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                flag = false;
                System.out.println("成功归还!");
                bookList.getBooks().get(i).setIsBorrowed(false);
            }
        }
        if (flag) {
            System.out.println("未查找到该书");
        }
    }

    /**
     * 查看书库
     * @param bookList
     */
    public void see(Record bookList){
        for (int i = 0; i < bookList.getBooks().size(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }

    /**
     * 退出系统
     */
    public void stop() {
        System.exit(0);
    }

    /**
     * 登录页面
     *
     * @return
     */
    public int login() {
        System.out.println("----------欢迎来到图书管理系统-----------");
        System.out.println("");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.注销");
        System.out.println("4.退出");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }

    /**
     * 注册账号
     * @param readerlist
     */
    public void Register(Reader readerlist) {
        System.out.println("--------------注册页面--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入注册用户ID:");
        String ID = scanner.next();
        boolean flag = true;
        for (int i = 0; i < readerlist.getReaders().size(); i++) {
            if (readerlist.getReader(i).getID().equals(ID)) {
                flag = false;
                System.out.println("注册失败,已有该用户");
            }
        }
        if (flag) {
            Reader reader = new Reader(ID);
            readerlist.getReaders().add(reader);
            System.out.println("注册成功");
        }


    }


    /**
     * 注销账号
     * @param readerlist
     */
    public void withdraw(Reader readerlist) {
        System.out.println("--------------注销页面--------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入注销用户ID:");
        String ID = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < readerlist.getReaders().size(); i++) {
            if (readerlist.getReader(i).getID().equals(ID)) {
                flag = false;
                readerlist.getReaders().remove(i);
                System.out.println("注销成功:");
            }
        }
        if (flag) {
            System.out.println("没有找到该用户,注销失败");
        }
    }
}













