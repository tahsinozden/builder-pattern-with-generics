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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Employee employee = (Employee) o;

        return company != null ? company.equals(employee.company) : employee.company == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
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
