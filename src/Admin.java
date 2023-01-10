public class Admin extends User {
    /*
    管理员
    */
    UserService userService = new UserService();

    public Admin(String ID) {
        super(ID);
    }

    public void menu() {
        System.out.println("尊敬的管理员:" + this.getID() + "欢迎来到图书管理系统");
        System.out.println("0.退出账号 ");
        System.out.println("1.查看书库");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.退出系统");
    }

    public void option(int n, Record bookList) {

        switch (n) {
            case 0:
                System.out.println("退出账号成功");
                break;
            case 1:
                userService.see(bookList);
                break;
            case 2:
                userService.add(bookList);
                break;
            case 3:
                userService.delete(bookList);
                break;
            case 4:
                userService.stop();
                break;
            default:
                System.out.println("输入错误，请重新输入！");
        }

    }
}