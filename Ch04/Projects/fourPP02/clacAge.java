package Ch04.Projects.fourPP02;

public class clacAge {
    public String birthdayMonth;
    public int birthdayYear;
    public int birthdayDay;
    public String currentMonth;
    public int currentYear;
    public int currentDay;

    public void setCurrentDate(String month, int day, int year) {
        currentDay = day;
        currentMonth = month;
        currentYear = year;
    }

    public void setBirthdayDate(String month, int day, int year) {
        birthdayDay = day;
        birthdayMonth = month;
        birthdayYear = year;
    }

    public void findBirthdayDifferenceExact() {
        double differenceInDays;
        double differenceInMonths;
        double differenceInYears;
        int monthNumBirth = findMonth(birthdayMonth);
        int monthNumCurrent = findMonth(currentMonth);
        differenceInDays = currentDay - birthdayDay;
        differenceInMonths= monthNumBirth - monthNumCurrent;
        differenceInYears = currentYear - birthdayYear;
        if (differenceInDays < 0){
             if ((monthNumCurrent / 2) != 0 && (monthNumCurrent != 2)) {
                differenceInDays += 31;
            } else if ((monthNumCurrent / 2) == 0 && (monthNumCurrent != 2)) {
                differenceInDays += 30;
            } else if ((monthNumCurrent == 2) && (currentYear / 4 != 0)) {
                differenceInDays += 28;
            } else if ((monthNumCurrent == 2) && (currentYear / 4 == 0)) {
                differenceInMonths += 29;
            }
            differenceInMonths -= 1;
        }
        if (differenceInMonths < 0){
            differenceInMonths += 12;
            differenceInYears -= 1;
        }
        System.out.println("The Difference is " + differenceInYears + " years," + differenceInMonths + " months," + differenceInDays + " days.");
    }
    public void findBirthdayDifferenceDecimal (){
        double yearsInDifference = 0;
        int differenceInDays;
        double differenceInMonths;
        int differenceInYears;
        int monthNumBirth = findMonth(birthdayMonth);
        int monthNumCurrent = findMonth(currentMonth);
        differenceInDays = currentDay - birthdayDay;
        differenceInMonths= monthNumBirth - monthNumCurrent;
        differenceInYears = currentYear - birthdayYear;
        if (differenceInDays < 0){
             if ((monthNumCurrent / 2) != 0 && (monthNumCurrent != 2)) {
                differenceInDays += 31;
            } else if ((monthNumCurrent / 2) == 0 && (monthNumCurrent != 2)) {
                differenceInDays += 30;
            } else if ((monthNumCurrent == 2) && (currentYear / 4 != 0)) {
                differenceInDays += 28;
            } else if ((monthNumCurrent == 2) && (currentYear / 4 == 0)) {
                differenceInMonths += 29;
            }
            differenceInMonths -= 1;
        }
        if (differenceInMonths < 0){
            differenceInMonths += 12;
            differenceInYears -= 1;
        }
        yearsInDifference = differenceInDays * 1/365+ differenceInMonths * 1/12 + differenceInYears;
        System.out.println("The Difference is " + yearsInDifference + " years.");

    }

    public boolean check(String month, int day, int year) {
        boolean valid = true;
        int monthNum = findMonth(month);
        if (monthNum != 0) {
            if ((monthNum / 2) != 0 && (monthNum != 2)) {
                if (day > 31) {
                    valid = false;
                }
            } else if ((monthNum / 2) == 0 && (monthNum != 2)) {
                if (day > 30) {
                    valid = false;
                }
            } else if ((monthNum == 2) && (year / 4 != 0)) {
                if (day > 28) {
                    valid = false;
                }
            } else if ((monthNum == 2) && (year / 4 == 0)) {
                if (day > 29) {
                    valid = false;
                }
            }
            
        }
        if (monthNum == 0){
            valid = false;
        }
        return valid;

    }

    public int findMonth(String month) {
        int monthNum = 0;
        if (month == "January") {
            monthNum = 1;
        } else if (month == "Feburary") {
            monthNum = 2;
        } else if (month == "March") {
            monthNum = 3;
        } else if (month == "April") {
            monthNum = 4;
        } else if (month == "May") {
            monthNum = 5;
        } else if (month == "June") {
            monthNum = 6;
        } else if (month == "July") {
            monthNum = 7;
        } else if (month == "August") {
            monthNum = 8;
        } else if (month == "September") {
            monthNum = 9;
        } else if (month == "October") {
            monthNum = 10;
        } else if (month == "November") {
            monthNum = 11;
        } else if (month == "December") {
            monthNum = 12;
        }
        return monthNum;
    }
}
