package creational.builder;

public class BuilderTest {

    public static void main(String[] args) {
        Product product = new ProductBuilder()
        .withProductName("LAPTOP")
        .withProductCode("ITEM1")
        .withProductPrice(30.00)
        .build();

        System.out.println(product.toString());


    }
}
