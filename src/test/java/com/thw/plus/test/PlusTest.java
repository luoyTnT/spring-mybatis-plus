package com.thw.plus.test;

import com.thw.plus.entity.Admin;
import com.thw.plus.service.impl.AdminServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlusTest {

    @Test
    public void plusTest01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis-plus.xml");

        AdminServiceImpl adminServiceImpl = context.getBean("adminServiceImpl", AdminServiceImpl.class);

        Admin byId = adminServiceImpl.getById(1);

        System.out.println(byId);
    }

}
