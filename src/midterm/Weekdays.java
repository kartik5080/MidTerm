/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

/**
 *
 * @author Asus
 */
public class Weekdays {
    public enum Days{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
    public void nameOfDay(Days days)
     {
    switch(days)
      {
      case MONDAY:
        System.out.println("Monday");
        break;
      case TUESDAY:
        System.out.println("Tuesday");
        break;
      case WEDNESDAY:
        System.out.println("Wednesday");
        break;
      case THURSDAY:
        System.out.println("Thursday");
        break;
      case FRIDAY:
        System.out.println("Friday");
        break;
      case SATURDAY:
        System.out.println("Saturday");
        break;
      case SUNDAY:
        System.out.println("Sunday");
        break;
    }
  
}
}
