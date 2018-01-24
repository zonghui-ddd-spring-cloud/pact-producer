package kata.pact.provider;

public class Product {
    private Integer productId;
    private String name;
    private Integer count;

    public Product() {
    }

    public Product(Integer productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public Product(Integer productId, String name, Integer count) {
        this.productId = productId;
        this.name = name;
        this.count = count;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return product.name.equals(name);
    }
}
