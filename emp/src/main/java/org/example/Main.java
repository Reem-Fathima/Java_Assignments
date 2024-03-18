package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<String, Employee> employeeRecords = new HashMap<>();
        employeeRecords.put("001", new Employee("001", "Manju", 45000, "IT"));
        employeeRecords.put("002", new Employee("002", "Blake", 50000, "HR"));
        employeeRecords.put("003", new Employee("003", "George", 65000, "Support"));
        employeeRecords.put("004", new Employee("004", "Ashly", 55000, "IT"));
        employeeRecords.put("005", new Employee("005", "Gowri", 35000, "HR"));

        Set<String> employeeId=employeeRecords.keySet();

        Set<String> uniqueId=new HashSet<>(employeeId);

        List<String > sortedId=new ArrayList<>(uniqueId);
        Collections.sort(sortedId,Collections.reverseOrder());

        Map<String,Employee> employeeDetails=new HashMap<>();
        for (String id: sortedId){
            employeeDetails.put(id,employeeRecords.get(id));

        }

        for (String id: sortedId){
            Employee employee=employeeDetails.get(id);
            System.out.println("Employee Id : "+id+",Employee Details: " +employee);
        }
    }

}


    class Employee {
        private String id;
        private String name;
        private double salary;
        private String department;

        public Employee(String id, String name, double salary, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.department = department;
        }
    }


