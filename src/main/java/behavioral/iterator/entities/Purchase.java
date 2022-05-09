package behavioral.iterator.entities;

import java.util.Objects;

public class Purchase {

    private String name;
    private Integer amount;
    private Double price;

    public Purchase(String name, Integer amount, Double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Purchase setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public Purchase setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Purchase setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(name, purchase.name) && Objects.equals(amount, purchase.amount) && Objects.equals(price, purchase.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, price);
    }
}
