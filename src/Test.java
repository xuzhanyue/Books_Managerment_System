import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Reader readerlist = new Reader();
        UserService userService = new UserService();
        Record record = new Record();
        do {
            int option = new UserService().login();
            if (option == 1) {
                System.out.println("请输入你的ID:");
                Scanner scanner = new Scanner(System.in);
                String ID = scanner.next();
                User user = null;
                boolean flag = true;
                if (ID.equals("001")) {
                    flag = false;
                    user = new Admin(ID);
                } else {
                    for (int i = 0; i < readerlist.getReaders().size(); i++) {
                        if (readerlist.getReader(i).getID().equals(ID)) {
                            flag = false;
                            user = new Reader(ID);
                            System.out.println("登录成功");
                        }
                    }
                }
                if (flag) {
                    System.out.println("登录失败");
                }
                while(!flag) {
                    user.menu();
                    System.out.println("请输入你要进行的操作:");
                    int input = scanner.nextInt();
                    user.option(input, record);
                    if(input == 0){
                        break;
                    }
                }
            }
            if (option == 2) {
                userService.Register(readerlist);
            }
            if (option == 3) {
                userService.withdraw(readerlist);
            }
            if (option == 4) {
                System.exit(0);
            }
        } while (true);
    }
}

