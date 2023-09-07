package com.example.demo.modules;

public class MyBean {
    private String name;
    private int age;
    // 可以添加其他属性

    public MyBean() {
        // 默认构造函数
    }
    // Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // 可以添加其他方法
    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                 '}';
    }
}