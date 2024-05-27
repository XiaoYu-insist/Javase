package com.xiao.lianxi3;

/**
 * ClassName: Employee
 * Package: com.xiao.lianxi3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/22 15:43
 * @Version 1.0
 */
public class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }

    public double earing(){
        return 0.0;
    }
    public String getInfo(){
        return "员工姓名"+name+"，实发工资："+earing();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
