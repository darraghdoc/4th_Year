/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 
 */
package assignment1project1;

import java.util.ArrayList;
/**
 *
 * @author darraghoconnell (17371056)
 */
public class Module {
    //Declare Variables
    private String ModuleName, ModuleID, Course, newStudent;
    private ArrayList <Student> moduleStudents;
    
    public Module(String modulename, String moduleID, String course ){
        //Initialise Variables
        ModuleName = modulename;
        ModuleID = moduleID;
        Course = course;
        moduleStudents = new ArrayList<Student>();
    }
   
    public void addStudent(Student x){                          //Add Students to the Module
       moduleStudents.add(x);
    }
    
    public ArrayList getStudents(){                             //GET Methods for Module attributes
        return moduleStudents;
    }
    
    public String getModuleID(){
        return ModuleID;
    }
    
     public String getModuleName(){
        return ModuleName;
    }
    
    public void setModuleID(String x){                          //SET Methods for Module attributes
        ModuleID = x;
    }
    
     public void getModuleName(String x){
        ModuleName = x;
    }
    
     
    @Override
    public String toString(){                                   //Module toString() method
        return "///////////\n" + "Module Name = " + ModuleName + "\n Module ID = " + ModuleID + "\n";  
    }
    
}
