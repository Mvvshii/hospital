/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public class Applicants {
    private String name;
    private String manager;
    private String department;
    private String gender;
    private int age;
    private double salary;
    private String jobPosition;
    
    public Applicants (String name,
            String manager,
            String department,
            String gender,
            int age,
            double salary, 
            String jobPosition){
        this.name = name;
        this.manager = manager;
        this.department = department;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.jobPosition = jobPosition;   
    }
    public String getName() {
         return name;    
}
    public String getManager(){
        return manager;
    }
    public String getDepartment() {
        return department;
    }
    public String getGender() {
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public String getJobPosition() {
        return jobPosition;
    }
}
