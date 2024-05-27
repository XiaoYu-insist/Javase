package com.xiao.Further3;

/**
 * ClassName: ManKind
 * Package: com.xiao.Further3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 16:30
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;
    public ManKind(){}
    public ManKind(int sex, int salary){
        this.sex = sex;
        this.salary = salary;
    }
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if(this.sex == 1){
            System.out.println("man");
        } else if (this.sex == 0) {
            System.out.println("woman");
        }
    }
    public void employeed(){
        if(this.salary == 0){
            System.out.println("no job");
        }else if (this.salary != 0){
            System.out.println("job");
        }
    }
}
