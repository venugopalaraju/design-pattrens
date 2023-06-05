package creational.builder;

public class ProductBuilder {

    private  Product product;

    public ProductBuilder(){
        product = new Product();
    }

    public ProductBuilder withProductName(String productName){
        product.setProductName(productName);
        return this;
    }

    public ProductBuilder withProductCode(String productCode){
        product.setProductCode(productCode);
        return this;
    }

    public ProductBuilder withProductPrice(Double productPrice){
        product.setProcutPrice(productPrice);
        return this;
    }

    public Product build(){
        return product;
    }
}
