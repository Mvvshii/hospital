/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public class sort {

    public static void mergeSort(Applicants[] applicants, int left, int right) {

       if (left >= right){
           return;
       }
       
       int middle = left + (right - left) /2;
       
       mergeSort(applicants, left, middle); // sort left middle
       mergeSort(applicants, middle +1, right); // sort right middle
       merge(applicants, left, middle, right);
}
    private static void merge (Applicants[] applicants, int left, int middle, int right){
        Applicants[] temporary = new Applicants[right - left + 1];
        int leftIndex = left; // compare 2 side
        int rightIndex = middle + 1; // compare 2 side
        int temporaryIndex = 0; // temporarily save the merged sequence
        
        while (leftIndex <= middle && rightIndex <= right) {
            String leftName = applicants[leftIndex].getName();
            String rightName = applicants[rightIndex].getName();

            if (leftName.compareToIgnoreCase(rightName) <= 0) { // compare names without distinguishing between uppercase and lowercase letters.
                temporary[temporaryIndex] = applicants[leftIndex];
                leftIndex++;
            } else {
                temporary[temporaryIndex] = applicants[rightIndex];
                rightIndex++;
            }

            temporaryIndex++;
        }
        // add the ramaining people on the left
         while (leftIndex <= middle) {
            temporary[temporaryIndex] = applicants[leftIndex];
            leftIndex++;
            temporaryIndex++;
        }

        // add the remaining people on the right
        while (rightIndex <= right) {
            temporary[temporaryIndex] = applicants[rightIndex];
            rightIndex++;
            temporaryIndex++;
        }

        // copy the merged sequence to the main array
        for (int index = 0; index < temporary.length; index++) {
            applicants[left + index] = temporary[index];
        }
    }
}
