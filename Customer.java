package Version2;
import java.util.Vector;
public class Customer extends User {
    private Seller S;
    private Address address;
    private double accountBalance;
    private Vector<Product> cart;
    //constructors
    public Customer(){

    }
    public Customer(int userId, String name, double accountBalance){
        super(userId,name);
        this.accountBalance=accountBalance;
        super.accountType="Customer";
        address=new Address();
        Seller S=new Seller();
        cart= new Vector<Product>();
    }

    //mutators
    public void setCart(Vector<Product> cart) {
        this.cart = cart;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSeller(Seller s) {
        S = s;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    //accessors

    public Address getAddress() {
        return address;
    }

    public Seller getSeller() {
        return S;
    }

    //accessors
    public Vector<Product> getCart() {
        return cart;
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    //methods
    @Override
    public void addProduct(Product p) {

        if(accountBalance<p.getProductCost() && S.myProducts.contains(p)){
            System.out.println("You (" + name + ") Have insufficient balance to add product: "+p.getProductName());
        }

        if (p.getQuantity()== 0){
            System.out.println("Product: "+p.getProductName() + " is sold out.");
        }

        if (!S.myProducts.contains(p)){
            System.out.println("Product: "+p.getProductName()+" is not Sold by " +
                    S.getName());
        }
        if((accountBalance>=p.getProductCost()) && (p.getQuantity()>0) && S.myProducts.contains(p)){
            accountBalance-=p.getProductCost();
            p.setQuantity(p.getQuantity()-1);
            cart.add(p);
        }
    }

    @Override
    public void removeProduct(Product p) {
        if(cart.contains(p)){
            cart.remove(p);
            accountBalance+=p.getProductCost();
            p.setQuantity(p.getQuantity()+1);
        }
        else{
            System.out.println("Product: "+ p.getProductName() + "was not added to cart");
        }

    }

    @Override
    public void printInfo() {
        System.out.println("    Customer Information");
        System.out.println("********************************");
        super.printInfo();
        System.out.println("Address: " + address.getFullAddress());

    }


}
