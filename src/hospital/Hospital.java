/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.io.BufferedReader; // open the named file
import java.io.FileReader; // reads an opened file line by line
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Applicants> applicants = readFile("applicants");
        System.out.println("Records read: " + applicants.size());
        
        Applicants[] arr = applicants.toArray(new Applicants[0]);
        sort.mergeSort(arr, 0, arr.length -1);
        int limit = Math.min(20, arr.length);
        for (int i =0; i < limit; i++){
        System.out.println((i + 1)+ ". " + arr[i].getName());
        }
    }

    static List<Applicants> readFile(String filename) {
        List<Applicants> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line; // temporary hold the current line being read
            while ((line = reader.readLine()) != null) { // if not null, continue looping 
                String[] parts = line.split(",");

                if (parts.length == 7) {
                    String name = parts[0].trim();
                    String manager = parts[1].trim();
                    String department = parts[2].trim();
                    String gender = parts[3].trim();
                    int age = Integer.parseInt(parts[4].trim());
                    double salary = Double.parseDouble(parts[5].trim());
                    String jobPosition = parts[6].trim();
                    list.add(new Applicants(name, manager, department, gender, age, salary, jobPosition));
                } else if (parts.length == 3) {
                    list.add(new Applicants(parts[0].trim(),
                            parts[1].trim(),
                            parts[2].trim(),
                            parts[3].trim(),
                            Integer.parseInt(parts[4].trim()),
                            Double.parseDouble(parts[5].trim()),
                            parts[6].trim()));
                }
            }

        } catch (IOException e) { // if file not found program will print a message
            System.out.println("File not found! ");

        }
        return list;

    }
}
