package com.company;

public abstract class Person {
    protected String name;
    protected String surname;

    protected Person() {}
    protected Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static abstract class Builder<T, K> {
        protected String name;
        protected String surname;

        public abstract T build();

        public K name(String name) {
            this.name = name;
            return (K)this;
        }

        public K surname(String surname) {
            this.surname = surname;
            return (K)this;
        }
    }
}
