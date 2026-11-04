/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public class reception extends employee {
    private int deskNumber;
    
    public reception(String name, 
                   String gender, 
                   int age, 
                   double salary,
                   int deskNumber) {
        super(name, gender, age, salary);
        this.deskNumber = deskNumber; 
        
    }
    public int getDeskNumber(){
        return deskNumber;
    }

}
