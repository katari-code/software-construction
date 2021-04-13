package Version2;
import java.util.*;
public class Order implements ViewTotalNo{
    Vector<Product> orderItems;
    Customer C;
    Seller S;
    private Date dateCreated;
    private int orderId;
    private double orderPrice;
    //constructors
    public  Order(){

    }
    public Order(int orderId){
        orderItems =new Vector<Product>();
        C= new Customer();
        S=new Seller();
        this.orderId=orderId;
    }
    //accessors
    public int getOrderId() {
        return orderId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public Seller getS() {
        return S;
    }

    public Customer getC() {
        return C;
    }

    public Vector<Product> getOrderItems() {
        return orderItems;
    }
    //mutators

    public void setCart(Vector<Product> orderItems) {
        this.orderItems = orderItems;
    }

    public void setCustomer(Customer c) {
        C = c;
    }

    public void setSeller(Seller s) {
        S = s;
    }

    public double calcPrice(){
        orderPrice=0;
        for (int i=0;i<orderItems.size();i++){
            orderPrice+=orderItems.elementAt(i).getProductCost();
        }
        return orderPrice;
    }
    public void getTotalItemsNo() {
        System.out.println("Number of products in the Order: " + orderItems.size());

    }

    public void printOrder(){
        System.out.println(" ");
        System.out.println("Viewing Order: " + orderId + ". Sold by: "+S.getName()+". To: " + C.getName()+".");
        dateCreated=new Date();
        S.printInfo();
        C.printInfo();
        System.out.println("        Order Details");
        System.out.println("********************************");
        System.out.println("Order ID: " + orderId);
        System.out.println("Date: " + dateCreated);
        getTotalItemsNo();
        System.out.println("        Products");
        System.out.println("********************************");
        for(int i=0; i<orderItems.size();i++){
            System.out.println("* " + (i+1) +" *");
            orderItems.elementAt(i).printInfo();
        }
        System.out.println("Total order price: " + calcPrice());
        System.out.println("********************************");
        System.out.println(" ");
    }

}
