import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {
    public static void main(String[] args) {
//
//        Product product1= new Product("Knorr","Chilli Pepper",2.99);
//        Product product2 = new Product("Amino", "Tomato Soup", 4.62);
//        System.out.println(product1.compareTo(product2));

        Product[] products = new Product[7];
        products[0]= new Product("Amino","Zupa pomidorwa", 3.99);
        products[1]= new Product("Amino","Zupa ogórkowa", 3.99);
        products[2]= new Product("Winiary","Zupa pomidorwa", 4.20);
        products[3]= new Product("Winiary","Zupa pieczarkowa", 4.10);
        products[4]= new Product("Winiary","Rosół", 3.60);
        products[5]= new Product("Knorr","Placki ziemniaczane", 6.40);
        products[6]= new Product("Knorr","Racuchy", 7.99);

        System.out.println("Nieposortowana:");
        for (Product product: products) {
            System.out.println(product);
        }

//        Product.ProductNAmeComparator productNAmeComparator = new Product.ProductNAmeComparator();

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(final Product product1, final Product product2) {
                return product1.getProducer().compareTo(product2.getProducer());
            }
        });
        System.out.println("Posortowane:");
        for (Product product:products) {
            System.out.println(product);
        }


    }
}
