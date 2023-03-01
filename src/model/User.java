/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Date;

/**
 *
 * @author akshb
 */
public class User {
    String name;
    String gender;
    String emailAddress;
    String level;
    int employeeID;
    int age;
    long phoneNumber;
    Date startDate;
    String photoPath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
    
}
