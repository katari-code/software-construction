package Version2;
import java.util.Vector;

public class Seller extends User implements ViewTotalNo {
    private int productsNum; //number of products seller added
    Vector<Product> myProducts;

    Seller(){

    }
    public Seller(int userId,String name) {
        super(userId,name);

        super.accountType="Seller";
        myProducts = new Vector<Product>();
        productsNum=myProducts.size();
    }

    public int getProductsNum() {
        return productsNum;
    }

    @Override
    public void addProduct(Product p) {
        myProducts.add(p);
    }

    public void  removeProduct(Product p){
        assert myProducts.contains(p) : "The product doesn't exist in your list";
        myProducts.remove(p);
    }

    public void updateQuantity(Product p, int q){

        p.setQuantity(q);
    }

    @Override
    public void printInfo() {
        System.out.println("    Seller Information");
        System.out.println("********************************");
        super.printInfo();
        getTotalItemsNo();
    }

    @Override
    public void getTotalItemsNo() {
        assert  myProducts != null : "There is no products list";
        productsNum=myProducts.size();
        System.out.println("Number of products: " + productsNum);

    }
}

