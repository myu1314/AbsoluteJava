

import java.util.Scanner;

public class sixPP03 {
  public static void main(String[] args) {
    int[] salary = new int[12];
    int[] otHours = new int[12];
    int[] otMultipler = new int[12];
    Scanner keyboard = new Scanner(System.in);
    int totalSalary = 0;
    int totalOtPayout = 0;
    int OTmultiplier = 0;
    for (int i = 0; i < 12; i++) {
      System.out.println("Salary in month " + (i+1) + ":");
      salary[i] = keyboard.nextInt();
      totalSalary += salary[i];
      System.out.println("Overtime hours in month " + (i+1) + ":");
      otHours[i] = keyboard.nextInt();
      if (salary[i] > 10000){
        OTmultiplier = 25;
      }
      else if((10000 >= salary[i]) && (salary[i] > 5000)){
        OTmultiplier = 20;
      }
      else if((5000 >= salary[i]) && (salary[i] > 2000)){
        OTmultiplier = 15;
      }
      else if(2000 >= salary[i]){
        OTmultiplier = 10;
      }
      otMultipler[i] = OTmultiplier;  
      totalOtPayout += otHours[i] * OTmultiplier;
    }
    
    
    
    keyboard.close();
    System.out.printf("%-20s%-11s%-10s%-11s|%-11s\n","Month","Salary","OT Hours","OT Pay","Total Salary in Month");
    System.out.println("=============================================================================");
    for (int i = 0; i < 12; i++){
      String monthName = convertToMonth(i+1);
      int OTPay = otMultipler[i] * otHours[i];
      int totalPay = salary[i] + (otHours[i] * otMultipler[i]);
      System.out.printf("%-20s$%-10d%-10d$%-10d|$%-10d \n",monthName, salary[i],otHours[i], OTPay,totalPay);

      
     
          
    }
    
    
  }

  public static String convertToMonth(int month) {
    String monthName = "";
    if (month == 1) {
      monthName = "January";
    } else if (month == 2) {
      monthName = "February";
    } else if (month == 3) {
      monthName = "March";
    } else if (month == 4) {
      monthName = "April";
    } else if (month == 5) {
      monthName = "May";
    } else if (month == 6) {
      monthName = "June";
    } else if (month == 7) {
      monthName = "July";
    } else if (month == 8) {
      monthName = "August";
    } else if (month == 9) {
      monthName = "September";
    } else if (month == 10) {
      monthName = "October";
    } else if (month == 11) {
      monthName = "November";
    } else if (month == 12) {
      monthName = "Decemeber";
    }
    return monthName;
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}