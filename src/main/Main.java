package main;

import com.company.Employee;
import com.company.OrdinaryPerson;
import com.company.Person;

public class Main {

    public static void main(String[] args) {
        Person employee = new Employee.EmployeeBuilder()
                .company("X")
                .name("MasterOf")
                .surname("Disaster")
                .build();

	    System.out.println(employee);

        Person ordinaryPerson = new OrdinaryPerson.OrdinaryPersonBuilder()
                .name("John")
                .surname("Doe")
                .build();

        System.out.println(ordinaryPerson);
    }
}
