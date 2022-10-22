package Class17;

import java.util.Scanner;

public class Person {

    public class Employee {
        private String name;
        private String department;
        private double salary;
        private String id;
        private int age;
        private double actualSalary;
        String companyName = "Syntax";

        public Employee(String empName, String empDepart, double empSalary, int empAge) {
            name = empName;
            department = empDepart;
            salary = empSalary;
            age = empAge;
        }

        void printSalary() {
            actualSalary = salary + 20000 + 10000;
            System.out.println(actualSalary);
        }

        void calculatePrintTax() {
            double tax = actualSalary * .3;
            System.out.println("Tax " + tax);


        /*
        Below we have more constrcutor calls
         */
            Scanner scanner=new Scanner(System.in);
            StringBuilder sb=new StringBuilder("Str");
            String str=new String("value");

        }

    }}






