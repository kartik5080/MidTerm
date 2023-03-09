/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midterm;

import java.util.Scanner;
import midterm.Weekdays.Days;

/**
 *
 * @author Asus
 */
public class MidTerm {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
         
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the day MONDAY TUEDAY  till Sunday.....");
    Days days = Days.valueOf(in.next().toUpperCase());
    
   
    Weekdays t= new Weekdays();
   
    t.nameOfDay(days);
    
    }// TODO code application logic here
    
    
}
