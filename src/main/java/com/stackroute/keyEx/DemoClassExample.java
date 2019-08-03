package com.stackroute.keyEx;

public class DemoClassExample {
    int id;
    String name;

    public DemoClassExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void test(){
        System.out.println("running parent class");
    }
}

class ChildTest extends DemoClassExample{

    int age;

    public ChildTest(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "ChildTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}