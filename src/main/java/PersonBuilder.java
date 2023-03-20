package main.java;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) throws IllegalAccessException {
        if (name == null || name.isEmpty()) {
            throw new IllegalAccessException("!!!Warning!!! ADD YOU NAME");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalAccessException {
        if (surname == null || surname.isEmpty()){
            throw new IllegalAccessException("!!!Warning!!! ADD YOU SURNAME");
        }
        this.surname = surname;
        return  this;
    }

    public PersonBuilder setAge(int age) throws IllegalAccessException {
        if (age < 0 || age > 140){
            throw new IllegalAccessException("!!!Warning!!! ");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalAccessException {
        Person person;
        if (name == null || name.isEmpty() || surname == null || surname.isEmpty()){
            throw new IllegalAccessException("WARNING");
        }
        if (age < 0 || age > 140){
            throw new IllegalAccessException("!!!Warning!!! ");
        }
        person = new Person(name,surname,age);
        person.setAddress(address);
        return person;
    }

}
