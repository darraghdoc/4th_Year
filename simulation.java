package assignment1;
import java.util.*;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Darragh OConnell 17371056
 */
public class simulation {
    public int hour, numOfCalls, droppedCalls, callPointer, zero, callAdded;
    public double gradeOfService;
    ArrayList<Integer> callLengths = new ArrayList<Integer>();
    ArrayList<Integer> callStartTimes = new ArrayList<Integer>();
    ArrayList<Integer> operators = new ArrayList<Integer>(Collections.nCopies(33, 0));
    Random gauss = new Random();
    
    public void simulation( int Calls ){
        numOfCalls = Calls;
        hour= 3600;
        callPointer= 0;
        callAdded = 0;
        droppedCalls = 0;
        
        /*
        * Getter ArrayList of random call start times 
        */ 
        for (int i = 0; i < numOfCalls; i++){
            int randomNum = ThreadLocalRandom.current().nextInt(0, hour + 1);
            callStartTimes.add(randomNum); 
        }
        //Sort Call Start times
        Collections.sort(callStartTimes);                                       
        
        /*
        * Generate ArrayList of Call lengths based on Normal/Gaussian distrubution
          with an average of 3 minutes and a standard deviation of 1 minute
        */ 
        
        for (int i = 0; i < numOfCalls; i++){
            //int randomNum = (int) Math.round(gauss.nextGaussian() * 60 + 180);
            int randomNum = ThreadLocalRandom.current().nextInt(0, 240);
            callLengths.add(randomNum); 
        }
        
        /*
        * Siulate 1 hour of calls
        */ 
        for (int x=0; x<hour; x++){
            /*
            * Decrement all current calls by 1 second, simulating 1 second passing 
            */ 
            for( int y = 0; y < 33; y++){
                if (operators.get(y)!=0){
                    Integer v = operators.get(y); 
                    v = v - 1; 
                    operators.set(y, v);  
                }
            }
              /*
               * Assign call to agent if possible
                 If not, the call is dropped.
              */ 
            if (callStartTimes.contains(x)){
                callAdded=0;
                for( int y = 0; y < 33; y++){
                    if ((operators.get(y))== 0){
                        int v = callLengths.get(callPointer); 
                        operators.set(y, v); 
                        callPointer++;
                        callAdded++;}
                    
                    if (callAdded>0){
                        break;}
                }      
                if (callAdded == 0){
                    callPointer++;
                    droppedCalls++;
                }
               }
              }
             /*
            * Print dropped calls statistics and generate GOS 
            */ 
            System.out.println("\nDropped Calls=" + droppedCalls);
            System.out.println("No. Calls=" + numOfCalls);
            gradeOfService = ((double)droppedCalls/numOfCalls)*100;
            System.out.printf("GOS =" + "%3f",gradeOfService);
            System.out.print("%");
          } 
    }