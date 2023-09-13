
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner getTemp = new Scanner(System.in);
        
        System.out.print("Enter the Weather Temperature (Celcius) :  ");
        
        int celcius = getTemp.nextInt();
        
        String event;
        
       switch (celcius) {
           case 5:
           case 4:
           case 3:
           case 2:
           case 1:
               event = "Ski";
               break;
           case 15:
           case 14:
           case 13:
           case 12:
           case 11:
           case 10:
           case 9:
           case 8:
           case 7:
           case 6:
               event = "Cinema";
               break;
           case 25:
           case 24:
           case 23:
           case 22:
           case 21:
           case 20:
           case 19:
           case 18:
           case 17:
           case 16:
               event = "Picnic";
               break;
           default:
               event = "Swim";
               break;
        }
       
        System.out.println("The Tempeture is " + celcius + " celcius." + " Recommended event is " + event );
        
        
        
        
        
        
    }
    
}



