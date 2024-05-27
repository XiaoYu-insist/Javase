package com.xiao.Study12;
import static com.xiao.Study12.Data.*;


/**
 * ClassName: Test
 * Package: com.xiao.Study12
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/18 10:10
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Employee[] arr = new Employee[EMPLOYEES.length];
        for (int i = 0;i < arr.length;i++){
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            switch (type){
                case EMPLOYEE:
                    arr[i] = new Employee(id,name,age,salary);break;
                case PROGRAMMER:
                    arr[i] = new Programmer(id,name,age,salary);break;
                case DESIGNER:
                    double bouns = Double.parseDouble(EMPLOYEES[i][5]);
                    arr[i] = new Designer(id,name,age,salary,bouns);break;
                case ARCHITECT:
                    bouns = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    arr[i] = new Architect(id,name,age,salary,bouns,stock);break;
            }
            System.out.println(arr[i]);
        }

    }

}
