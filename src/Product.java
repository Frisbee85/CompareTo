import java.util.Comparator;

public class Product implements Comparable<Product> {

    private String producer;
    private String name;
    private double price;

    public Product(final String producer, final String name, final double price) {
        this.producer = producer;
        this.name = name;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(final String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "producer='" + producer + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

//    @Override// porównanie cen
//    public int compareTo(final Product product) {
//        if (this.price > product.price)
//            return 1;
//        else if (this.price < product.price)
//            return -1;
//        return 0;
//    }

//    @Override// Porównanie nazw
//    public int compareTo(final Product product) {
//       int compare = this.name.compareTo(product.name);
//       return compare;
//    }

    @Override
    public int compareTo(final Product product) {
        if (price > product.price)
            return 1;
        else if (price < product.price)
            return -1;
        int producerCompare = producer.compareTo(product.producer);
        if (producerCompare != 0)
            return producerCompare;
        return this.name.compareTo(product.name);
    }
    static public class ProductNAmeComparator implements Comparator<Product> {
        @Override
        public int compare(final Product product1, final Product product2) {
            return product1.getName().compareTo(product2.getName());
        }
    }

}
