package com.myspring.aop.springaop.testMain;

import com.myspring.aop.springaop.service.Hello;
import com.myspring.aop.springaop.service.World;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainTest {

    public static void main(String[] agrs){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) ctx.getBean("hello");
        hello.addUser("jack","12345");
        hello.deleteUser(3);

        World world = ctx.getBean("world",World.class);
        world.test();
    }
}
