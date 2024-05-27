package com.xiao.Study11;

/**
 * ClassName: Equipment
 * Package: com.xiao.Study11
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 16:20
 * @Version 1.0
 */
public class Equipment {

    private int id;
    private String factory;
    private double price;
    private String name;
    private Status status;

    public Equipment() {
    }

    public Equipment(int id, String factory, double price, String name, Status status) {
        this.id = id;
        this.factory = factory;
        this.price = price;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
