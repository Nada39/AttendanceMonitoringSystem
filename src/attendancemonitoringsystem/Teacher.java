/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attendancemonitoringsystem;

/**
 *
 * @author Nadam_2kg0od8
 */
public class Teacher {
    private int ID ;
    private String Name;
    private String Email;
    private String Password;

    public Teacher() {
    }

    public Teacher(int ID, String Name, String Email, String Password) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }
    
    
}
