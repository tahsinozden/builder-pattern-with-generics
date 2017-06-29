package com.company;

public class Employee extends Person {
    private String company;

    private Employee(EmployeeBuilder employeeBuilder) {
        super(employeeBuilder);
        this.company = employeeBuilder.company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static class EmployeeBuilder extends Person.Builder<Employee, EmployeeBuilder> {
        private String company;

        public EmployeeBuilder company(String company) {
            this.company = company;
            return this;
        }

        @Override
        public Employee build() {
            return new Employee(this);
        }
    }
}
