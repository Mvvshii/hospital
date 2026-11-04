/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public class dentist extends employee {
    private String specialization;
    
    public dentist(String name, 
                   String gender, 
                   int age, 
                   double salary,
                   String specialization) {
        super(name, gender, age, salary);
        this.specialization = specialization; 
        
    }
    public String getSpecialization(){
        return specialization;
    }
    
}
