package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class  Employee{


    private int id;
    private String name;
    private String skill;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, String skill, double salary){
        this.id=id;
        this.name=name;
        this.skill=skill;
        this.salary=salary;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public double getSalary() {
        return salary;
    }

        }




public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John", "C", 50000));
        employeeList.add(new Employee(2, "Jack", "Python", 60000));
        employeeList.add(new Employee(3, "Bob", "Java", 45000));
        employeeList.add(new Employee(4, "Tim", "Python", 40000));

//        Optional<List<Employee>>pythonEmployee = Optional.of(employeeList.stream().filter(employee -> "python".equals(employee.getSkill()))).toList();
        List<Employee>pythonEmployee = employeeList.stream()
                .filter(employee -> "Python".equals(employee.getSkill()))
                .toList();

        if (!pythonEmployee.isEmpty()) {
            System.out.println("Employee with skill python found!");
            pythonEmployee.forEach(System.out::println);

        }

    else {
        throw new RuntimeException("No employees found with skill python");
        }
    }
}