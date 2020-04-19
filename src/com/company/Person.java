package com.company;

/**
 *  人类
 * 表达的是现实生活中的父子关系
 */
public class Person {
    public static void main(String[] args) {
        //创建老马
        Person laoma = new Person("老马");
        //创建小马
        Person xiaoma = new Person("小马");
        //调用小马（父亲）方法，设置老马
        xiaoma.setFather(laoma);
        //调用老马的（孩子)方法，设置小马
        laoma.setChildren(new Person[]{xiaoma});

        System.out.println(xiaoma.getFather().getName());
    }
    /* 姓名 */
    private String name;

    /* 父亲 */
    private Person father;

    /* 母亲 */
    private Person mother;

    /* 孩子数组  */
    private Person[] children;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }
}
