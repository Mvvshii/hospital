/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class add_employee {
    public static String readManager(Scanner scanner){
        String[] validManagers = {
            "Team Lead", 
            "Assistant Manager",
            "Department Head"
        };
        while (true){
            System.out.println("Enter manager type " 
                    + "(Team Lead/ Assistant Manager/ Department Head):" 
            );
            String input = scanner.nextLine().trim();
            
            for (String manager : validManagers) {
                if (input.equalsIgnoreCase(manager)){
                    return manager;
                }
            }
            System.out.println("Invalid manager type! Try again.");
        }
    }
        public static String readDepartment(Scanner scanner){
        String[] validDepartments = {
            "Treatment", 
            "Surgery",
            "Administration"
        };
        while (true){
            System.out.println("Enter department type " 
                    + "(Treatments/ Surgery/ Administration):" 
            );
            String input = scanner.nextLine().trim();
            
            for (String department : validDepartments) {
                if (input.equalsIgnoreCase(department)){
                    return department;
                }
            }
            System.out.println("Invalid department! Try again.");
        }
        }
}
