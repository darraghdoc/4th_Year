package assignment1project1;
import java.util.ArrayList;
import org.joda.time.LocalDate;

/**
 * @author darraghoconnell(17371056)
 */

public class CourseProgramme{
    //Declaring Variables
    public int i;                                                   
    private String CourseName, newModule;
    private ArrayList <Module> modules;
    private ArrayList <Student> courseStudents;
    private LocalDate StartDate,EndDate;
    
    public CourseProgramme( String coursename, LocalDate startdate, LocalDate enddate){
    //Initialising Variables
        CourseName = coursename;                                   
        StartDate= startdate;
        EndDate = enddate;
        modules = new ArrayList<Module>();
        courseStudents = new ArrayList<Student>();
    }
    
    
    public void addModule(Module x){                        //Method to add Modules to the Course
        modules.add(x);
    }
    
     public void addStudents(Module x){                     //Method to add Students to the Course
         courseStudents.addAll(x.getStudents());
    }
   
    public String getModules(){                             //GET methods for Course attributes
         return modules.toString();
    }
    
    public String getStudents(){
         return courseStudents.toString();
    }
    
    public String getStartDate(){
         return StartDate.toString();
    }
    
    public String getEndDate(){
         return EndDate.toString();
    }
    
    public String getCoursename(){
        return CourseName;
    }
    
    public void setCourseName(String x){                        //SET Methods for Course Attributes
        CourseName = x;
    }
}

