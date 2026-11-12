/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public class search {

    public static int binarySearch(Applicants[] a, String name, int low, int high) {
        if (low > high) {
            return -1;
        } 
        
        int mid = (low + high) / 2;
        int cmp = name.compareToIgnoreCase(a[mid].getName());
        if (cmp == 0) {
            return mid;
        }
        if (cmp < 0) {
            return binarySearch(a, name, low, mid - 1);
        } else {
            return binarySearch(a, name, mid + 1, high);
        }
    }
}
