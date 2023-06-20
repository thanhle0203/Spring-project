package com.thanhle;

import com.thanhle.dao.EmployeeDao;
import com.thanhle.domain.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        String[] beans = context.getBeanDefinitionNames();

        for (String beanName : beans) {
            System.out.println(beanName);
        }

        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");

        Employee e = new Employee(3, "Thanh Le", "Software Engineer", 100000);

        //employeeDao.save(e);
        //employeeDao.save2(e);
        //employeeDao.findAll();
        //employeeDao.findById(3);
        //employeeDao.updateById(3, "FullStack Engineer", 120000);
        //employeeDao.deleteById(3);
        employeeDao.findEmployee(50000);


    }
}