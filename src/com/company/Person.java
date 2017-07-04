package com.company;

public abstract class Person {
    private String name;
    private String surname;

    Person(Builder builder) {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) {
            return false;
        }
        return surname != null ? surname.equals(person.surname) : person.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname;
    }

    @SuppressWarnings("unchecked")
    abstract static class Builder<T, K> {
        private String name;
        private String surname;

        abstract T build();

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
