package Version2;
public abstract class User {
    protected int userId;
    protected String name;
    protected String accountType;
    //constructors
    public User(){
        accountType=null;
    }
    public User(int userId, String name) {
        this.name=name;
        this.userId=userId;
    }
    //accessors
    public int getUserId() {
        return userId;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getName() {
        return name;
    }

    //mutators

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void printInfo(){
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }
    public abstract  void addProduct(Product p);
    public abstract  void removeProduct(Product p);
}
