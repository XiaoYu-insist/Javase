package com.xiao.domain;

/**
 * ClassName: NoteBook
 * Package: com.xiao.domain
 * Description:
 *    笔记本
 * @Author xiao-yu
 * @Create 2024/5/23 14:04
 * @Version 1.0
 */
public class NoteBook implements Equipment{
    private String model;
    private double price;

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return getModel()+"("+getPrice()+")";
    }
}
