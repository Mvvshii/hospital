/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public enum menu {
    SORT(1, "Sort"),
    SEARCH(2, "Search"),
    ADD_RECORDS(3, "Add record"),
    CREATE_BINARY_TREE(4, "Create Binary Tree"),
    EXIT(5, "EXIT");

    private final int number;
    private final String label;

    menu(int number, String label) {
        this.number = number;
        this.label = label;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    public static menu fromNumber(int number) {
        for (menu menu : values()) {
            if (menu.number == number) {
                return menu;
            }
        }
        return null;
    }

}
