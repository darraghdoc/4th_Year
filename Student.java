/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

 */
package assignment1project1;

import java.lang.Math;

/**
 *
 * @author darraghoconnell (17371056)
 */
public class Student {
    //Declaring Variables
    private String Name, Age, DOB, Username, username, Courses, Modules;
    private double ID;
    
    
    public Student (String name, String age, String dob, String modules, String courses ){
        //Initialising Variables
        Name = name;
        Age = age;
        DOB = dob;
        Courses = courses;
        Modules = modules;
        
        ID = (999999)*Math.random();
        Username = getUserName();
    }
    
    
    public String getUserName(){                            //Generate UserName
        username = Name.concat(Age);
        return username;
    }   
    
    public double getID(){                                  //GET Method for Student attributes
        return ID;
    }  
    
    public String getModules(){
        return Modules;
    }
    
    public String getCourses(){
        return Courses;
    }
    
    public String getDOB(){
        return DOB;
    }
    
    public void setDOB(String x){                           //SET Methods for Student attributes
        DOB = x;
    }
    
    public void setName(String x){
        Name = x;
    }
    
    public void setAge(String x){
        Age = x;
    }
    
    
    @Override
    public String toString(){
        return "///////////\n" + "User Name = " + Username + "\n Student ID = " + ID + "\n";  
    }
}

