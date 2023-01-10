import java.util.ArrayList;

public  class Reader extends User{
    /*
    借阅者
     */
    UserService userService = new UserService();
    public Reader(String ID){
        super(ID);
    }

    public Reader() {
        readers.add(new Reader("001"));
    }
    private ArrayList<Reader> readers =new ArrayList<Reader>();

    public Reader(UserService userService, ArrayList<Reader> readers) {
        this.userService = userService;
        this.readers = readers;
    }

    @Override
    public void menu() {
        System.out.println("尊敬的读者:"+this.getID()+"欢迎来到图书馆");
        System.out.println("0.退出账号");
        System.out.println("1.查看书库");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.退出系统");

    }
    public void option(int n, Record bookList) {

        switch(n) {
            case 0:
                System.out.println("退出账号成功");
                break;
            case 1:
                userService.see(bookList);
                break;
            case 2:
                userService.sorrowBook(bookList);
                break;
            case 3:
                userService.returnBook(bookList);
                break;
            case 4:
                userService.stop();
            default:
                System.out.println("输入错误，请重新输入！");
        }
    }

    /**
     * 获取
     * @return userService
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * 设置
     * @param userService
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 获取
     * @return readers
     */
    public ArrayList<Reader> getReaders() {
        return readers;
    }

    /**
     * 设置
     * @param readers
     */
    public void setReaders(ArrayList<Reader> readers) {
        this.readers = readers;
    }

    public String toString() {
        return "Reader{userService = " + userService + ", readers = " + readers + "}";
    }

    public Reader getReader(int a){
        return readers.get(a);
    }
}
