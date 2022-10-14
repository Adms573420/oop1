package oop1;

import oop1.CorporateCustomer;
import oop1.Customer;
import oop1.IndividualCustomer;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setImageUrl("image1.jpg");
        product1.setUnitInStock(5);
        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setImageUrl("image2.jpg");
        product2.setUnitInStock(5);

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setImageUrl("image3.jpg");
        product3.setUnitInStock(5);


        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");

        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("05355648613");
        individualCustomer.setFirstName("Adem");
        individualCustomer.setLastName("Okur");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Adms");
        corporateCustomer.setPhone("05416313");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setCustomerNumber("2534968465");

        Customer[] customer = {individualCustomer, corporateCustomer};

        for (Customer customers : customer) {
            System.out.println(customers.getCustomerNumber());
        }


    }
}
