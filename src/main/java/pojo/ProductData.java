package pojo;

import java.util.Objects;

public class ProductData {
    String productName;
    double productTotalPrice;
    int productAmount;
    long productId;

    public String getProductName() {
        return productName;
    }

    public ProductData setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public double getProductTotalPrice() {
        return productTotalPrice;
    }

    public ProductData setProductTotalPrice(double productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
        return this;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public ProductData setProductAmount(int productAmount) {
        this.productAmount = productAmount;
        return this;
    }

    public long getProductId() {
        return productId;
    }

    public ProductData setProductId(long productId) {
        this.productId = productId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductData)) return false;
        ProductData that = (ProductData) o;
        return Double.compare(that.getProductTotalPrice(), getProductTotalPrice()) == 0 &&
                getProductAmount() == that.getProductAmount() &&
                getProductId() == that.getProductId() &&
                Objects.equals(getProductName(), that.getProductName());
    }
}
