public abstract class User {
    private String ID;


    public User() {
    }

    public User(String ID) {
        this.ID = ID;
    }

    public abstract void menu();
    public abstract void option(int n, Record bookList);
    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public String toString() {
        return "User{ID = " + ID + "}";
    }
}
