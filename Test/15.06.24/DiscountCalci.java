/*
E-Commerce Discount Calculation:

    Create a base class Product with attributes like productName and price. Include methods to display product details.
    Create derived classes Electronics and Clothing.
    Electronics should have an attribute warrantyPeriod. Add a method to calculate the final price after applying a fixed discount (e.g., 10%).
    Clothing should have an attribute season. Add a method to calculate the final price after applying a seasonal discount (e.g., 15%).
    Write a program to create objects of both types of products, calculate their final prices, and display the details.
     */
    
public class DiscountCalci {
    class Product{
        String productName;
        float price;

        public void setData(String productName , float price){
            this.productName = productName;
            this.price = price;
        }

        public void displayProduct(){
            System.out.println("\nProduct Name = "+ productName);
            System.out.println("Price of the product = " + price);

        }
    }
    //Electronics
    class Electronics extends Product{
        String warrantyPeriod;
        float discountedPrice = price - (price * 0.10f);

        public void setData(String productName, float price, String warrantyPeriod){
            super.setData(productName, price);
            this.warrantyPeriod = warrantyPeriod;
        }

        public void display(){
            System.out.println("The warranty period of electronic = " + warrantyPeriod);
        }

        public void elecPrice(){
            super.displayProduct();
            display();
            System.out.println("The final price of electronic after the discount of 10% = " + discountedPrice );
        }
    }
    //Clothing
    class Clothing extends Product{
        String season;
        float discountedPrice = price - (price * 0.15f) ;

        public void setData(String productName, float price, String season){
            super.setData(productName, price);
            this.season = season;
        }
        public void display(){
            System.out.println("The Season of CLothing = " + season);
        }

        public void clothingPrice(){
            super.displayProduct();
            display();
            System.out.println("The final price on Clothings after the discount of 15% = " + discountedPrice );
        }
    }

    //main function
    public static void main(String[] args) {
        DiscountCalci discountCalci = new DiscountCalci();

        Electronics e1 = discountCalci.new Electronics();
        e1.setData("Microwave", 10000 ,"2 years");
        // e1.setData();
        e1.elecPrice();

        Clothing c1 = discountCalci.new Clothing();
        c1.setData("T-Shirt", 1000,"Summer");
        // c1.setData();
        c1.clothingPrice();

    }
}
