package com.xiao.domain;

/**
 * ClassName: PC
 * Package: com.xiao.domain
 * Description:
 * 电脑
 * @Author xiao-yu
 * @Create 2024/5/23 14:02
 * @Version 1.0
 */
public class PC implements Equipment{
    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return getModel()+"("+getDisplay()+")";
    }
}
