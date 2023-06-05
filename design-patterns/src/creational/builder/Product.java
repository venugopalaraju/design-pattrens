package creational.builder;

public class Product {
    private String productName;
    private String productCode;
    private Double procutPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getProcutPrice() {
        return procutPrice;
    }

    public void setProcutPrice(Double procutPrice) {
        this.procutPrice = procutPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", procutPrice=" + procutPrice +
                '}';
    }
}
