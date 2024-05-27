package com.xiao.domain;

/**
 * ClassName: Printer
 * Package: com.xiao.domain
 * Description:
 * 打印机
 * @Author xiao-yu
 * @Create 2024/5/23 14:05
 * @Version 1.0
 */
public class Printer implements Equipment{
    private String name;
    private String type;

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return getName()+"("+getType()+")";
    }
}
