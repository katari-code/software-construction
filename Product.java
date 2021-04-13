package Version2;
public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double productCost;
    //constructors
    public Product(int productId,String productName,double productCost)
    {
        this.productId=productId;
        this.productName=productName;
        this.productCost=productCost;
    }
    //mutators
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    //accessors

    public int getProductId(){return productId;}
    public String getProductName(){return productName;}
    public int getQuantity(){return quantity;}
    public double getProductCost(){return productCost;}

    public void printInfo(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + productCost);
    }
}
