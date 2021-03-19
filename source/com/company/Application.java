package com.company;

public class Application{
    public static void main(String[] args){
        Person p1 = new Person("Rinat", 34, "MALE");
        System.out.println("Created new Person:\n\t" + p1);

        p1.eat();
        p1.gotowork();

        boolean isSigned = p1.checkInvoice("hello World");
        if(isSigned){
            System.out.println(p1.getName() + " подписал документ");
        }else{
            System.out.println(p1.getName() + " не подписал документ изза того что он не действителен!");
        }

        p1.comeHomeEarly();


        System.out.println(p1.getName() + " Молодец!");
    }
}

interface Todo{//Надо сделать -> распорядок дня
    void eat();
    boolean checkInvoice(String invoice);
    void gotowork ();
    void comeHomeEarly ();
}

class Person implements Todo {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void eat() {
        System.out.println(name + " покушал плов!");
    }

    @Override
    public void gotowork() {
        System.out.println(name + " пошел поработал!");
    }

    @Override
    public boolean checkInvoice(String i){
        if(i.equals("helloWorld")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void comeHomeEarly() {
        System.out.println(name + " пришел домой рано!");
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}