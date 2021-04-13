package Version2;
public class OrderingApplication {
    public static void main(String[] args) {

        //Products
        Product shirt = new Product(231,"Shirt",54.99);
        Product pants = new Product(682,"Pants",119.99);
        Product shoes = new Product(102,"Shoes",84.90);
        Product shampoo = new Product(422,"Shampoo",15.45);
        Product bodyWash = new Product(422,"Body Wash",19.80);
        Product faceWash = new Product(422,"Face Wash",9.99);

        //Sellers
        Seller shopA = new Seller(1662,"H&M");
        Seller shopB = new Seller(1662,"Watsons");
        //Shop A products
        shopA.addProduct(shirt);
        shopA.updateQuantity(shirt,2);

        shopA.addProduct(pants);
        shopA.updateQuantity(shirt,2);

        shopA.addProduct(shoes);
        shopA.updateQuantity(shoes,3);

        //Shop B products
        shopB.addProduct(shampoo);
        shopB.updateQuantity(shampoo,10);

        shopB.addProduct(bodyWash);
        shopB.updateQuantity(bodyWash,0);

        shopB.addProduct(faceWash);
        shopB.updateQuantity(faceWash,7);

        //Addresses
        Address ad1 = new Address("No 2 Jalan Mawar", "Skudai", "Johor Bahru");
        Address ad2 = new Address("Block 1-7", "Cheras", "Kuala Lumpur");

        // Customers:
        Customer boy=new Customer(111,"John",140);
        boy.setAddress(ad1);

        Customer girl=new Customer(121,"Ashley",290);
        girl.setAddress(ad2);

        //Adding Products
        boy.setSeller(shopA);
        girl.setSeller(shopB);

        boy.addProduct(shirt);
        boy.addProduct(pants);
        boy.addProduct(shoes);
        boy.addProduct(shampoo);

        girl.addProduct(shampoo);
        girl.addProduct(shampoo);
        girl.addProduct(bodyWash);
        girl.addProduct(faceWash);

        girl.removeProduct(shampoo);

        // Order
        Order boyOrder = new Order(1234561);
        boyOrder.setCustomer(boy);
        boyOrder.setSeller(boy.getSeller());
        boyOrder.setCart(boy.getCart());

        Order girlOrder = new Order(1234562);
        girlOrder.setCustomer(girl);
        girlOrder.setSeller(girl.getSeller());
        girlOrder.setCart(girl.getCart());

        //Printing Order
        boyOrder.printOrder();
        girlOrder.printOrder();
    }
}
