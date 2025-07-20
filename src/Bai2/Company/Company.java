package Bai2.Company;

import Bai2.Person.Person;

public class Company
{
    public static void main(String[] args) {
        Person person = new Person("Viet long",18,"Male","0775448558","14 hong gam");
        System.out.println("Name :" + person.name);
        System.out.println("Age  :" + person.age);
        System.out.println("Gender :" + person.gender);
    }
}
