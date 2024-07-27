package com.xiao.JUinit;

import com.xiao.domain.Employee;
import com.xiao.service.NameListService;
import com.xiao.service.TeamException;
import org.testng.annotations.Test;

/**
 * ClassName: NameListServiceTest
 * Package: com.xiao.JUinit
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/23 15:00
 * @Version 1.0
 */
public class NameListServiceTest {
    @Test
    public void testNameListService(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testNammeList() throws TeamException {
        int id = 3;
        NameListService nameListService = new NameListService();
        System.out.println(nameListService.getEmployee(id));



    }
}
