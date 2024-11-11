package com.github.curriculeon;

public class Employee {
    public static Employee LEON = new Employee(5l, "leon", 555.0);
    public static Employee MOHAMMED = new Employee(1l, "mohammed", 4444.0);
    private Long id;
    private String name;
    private Double salary;

    private Employee() {
    }

    private Employee(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
