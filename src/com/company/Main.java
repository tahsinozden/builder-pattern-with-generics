package com.company;

public class Main {

    public static void main(String[] args) {
	    Employee employee = new Employee.EmployeeBuilder()
                .company("X")
                .name("MasterOf")
                .surname("Disaster")
                .build();

	    System.out.println(employee);

	    OrdinaryPerson ordinaryPerson = new OrdinaryPerson.OrdinaryPersonBuilder()
                .name("John")
                .surname("Doe")
                .build();

        System.out.println(ordinaryPerson);
    }
}
