package com.company.ronnie;

public class MySimpleObjects {
    private int age;
    private String name;
    private Character dob;

    public MySimpleObjects(int age, String name, Character dob) {
        this.age = age;
        this.name = name;
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getDob() {
        return dob;
    }

    public void setDob(Character dob) {
        this.dob = dob;
    }

}
