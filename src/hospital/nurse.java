package hospital;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class nurse extends employee {
    private String shift;
    
    public nurse(String name, 
                   String gender, 
                   int age, 
                   double salary,
                   String shift) {
        super(name, gender, age, salary);
        this.shift = shift; 
        
    }
    public String getShift(){
        return shift;
    }
}

