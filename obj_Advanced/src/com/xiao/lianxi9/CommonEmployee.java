package com.xiao.lianxi9;

/**
 * ClassName: CommonEmployee
 * Package: com.xiao.lianxi9
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 15:16
 * @Version 1.0
 */
public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工");
    }

}
