package com.myspring.aop.springaop.service;

public class Hello {

    public Integer addUser(String name ,String pass){
        System.out.println("模拟添加用户 ：" + name);
        return 19;
    }
    public void deleteUser(Integer id){
        System.out.println("模拟删除用户：" + id);
    }
}
