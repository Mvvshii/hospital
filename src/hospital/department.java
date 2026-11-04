/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public class department {
    private String depName;
    private int floor;
    private int staff;

    public department (String depName,
            int floor,
            int staff) {
        this.depName = depName;
        this.floor = floor;
        this.staff = staff;
    }

    public String getDepName() {
        return depName;
    }

    public int getFloor() {
        return floor;
    }
    public int getStaff(){
        return staff;
    }
}
