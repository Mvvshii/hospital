/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author User
 */
public class manager {

    private String title;
    private String appLevel;

    public manager(String title,
            String appLevel) {
        this.title = title;
        this.appLevel = appLevel;
    }

    public String getTitle() {
        return title;
    }

    public String getAppLevel() {
        return appLevel;
    }
}
