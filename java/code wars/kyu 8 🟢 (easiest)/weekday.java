/*
 *DESCRIPTION:
Complete the function which returns the weekday according to the input number:

1 returns "Sunday"
2 returns "Monday"
3 returns "Tuesday"
4 returns "Wednesday"
5 returns "Thursday"
6 returns "Friday"
7 returns "Saturday"
Otherwise returns "Wrong, please enter a number between 1 and 7" 
 * 
*/





package com.mycompany.hkr_tasks;


public class test1 {

   public static String weekday(int day){
        return switch(day){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Wrong, please enter a number between 1 and 7";
        }; 
  } 
    
    
    
    
    public static void main(String[] args) {
        
        System.out.println(weekday(6)); 
       
    }
    
}
