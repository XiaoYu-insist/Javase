package com.xiao.Further3;

/**
 * ClassName: Kids
 * Package: com.xiao.Further3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 16:36
 * @Version 1.0
 */
public class Kids extends ManKind{
    private int yearsOld;
    public Kids(){}
    public Kids(int sex,int salary, int yearsOld){
        this.yearsOld = yearsOld;
        this.setSex(sex);
        this.setSalary(salary);
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println(yearsOld);
    }
}
