/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public class employee {
    private String name; 
    private String gender;
    private int age;
    private double salary;
    
public employee (String name, 
        String gender, 
        int age, 
        double salary) {
    this.name = name;
    this.gender = gender; 
    this.age = age;
    this.salary = salary;
}
   
    public String getName() { // утгыг гаднаас уншина
        return name; // утгыг буцаана.
    }
    public String getGender(){
        return gender;
    }
    public int getAge (){
        return age;
    }
    public double getSalary(){
        return salary;
    }
}
