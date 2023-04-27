/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kereta_api;

/**
 *
 * @author KYC
 */
public class id {
    private static id instance = null;
    private String ID = "";

    private id() {}

    public static id getInstance() {
        if (instance == null) {
            instance = new id();
        }
        return instance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String username) {
        this.ID = username;
    }
}
