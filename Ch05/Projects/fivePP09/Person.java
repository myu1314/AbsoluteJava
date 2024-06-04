package Ch05.Projects.fivePP09;

/**
 * Class for a person with a name and dates for birth and death.
 * Class invariant: A Person always has a date of birth, and if the Person
 * has a date of death, then the date of death is equal to or later than the
 * date of birth.
 * @author: Mark and Java Textbook
 * @version: 3
 */

public class Person {
    private String name;
    private Date born;
    private Date died; 

    /**
    * @param initialName name of the person
    * @param birthDate date of birth
    * @param deathDate date of death (null if still alive)
    **/

    public Person(String initialName, Date birthDate, Date deathDate) {
        if (consistent(birthDate, deathDate)) {
            name = initialName;
            born = new Date(birthDate);
            if (deathDate == null)
                died = null;
            else
                died = new Date(deathDate);
        } else {
            System.out.println("Inconsistent dates.Aborting.");
            System.exit(0);
        }
    }
    /**
     * @param original person object to be copied
     */ 
    public Person(Person original) {
        if (original == null )
        {
            System.out.println("Fatal error.");
            System.exit(0);
        }
        name = original.name;
        born = new Date(original.born);
        if (original.died == null)
            died = null;
        else
            died = new Date(original.died);
    }

     /**
     * @return the a string version of person
     */ 
     

    public String toString() {
        String diedString;
        if (died == null)
            diedString = ""; //Empty string
        else
            diedString = died.toString();
        return (name + ", " + born + "-" + diedString);
    }
    /**
     * @param otherPerson other object to compare too
     * @return true or false depending on equality
     */ 
    public boolean equals(Person otherPerson) {
        if (otherPerson == null)
            return false;
        else
            return (name.equals(otherPerson.name)
                    && born.equals(otherPerson.born)
                    && datesMatch(died, otherPerson.died) );
    }
    /**
     * @param date1 the first date
     * @param date2 the second date
     * @return true or false depending on equality
     */ 
    private static boolean datesMatch(Date date1, Date date2) {
        if (date1 == null)
            return (date2 == null);
        else if (date2 == null) //&& date1 != null
            return false ;
        else //Both dates are not null.
            return (date1.equals(date2));
    }
    
    /**
     * @param newDate new birth date
     */ 
    public void setBirthDate(Date newDate) {
        if (consistent(newDate, died))
            born = new Date(newDate);
        else{
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    /**
     * @param newDate the new death date
     */ 
    public void setDeathDate(Date newDate) {
        if (!consistent(born, newDate))
        {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }

        if (newDate == null)
            died = null ;
        else
            died = new Date(newDate);
    }

    public void setName(String newName) {
        name = newName;
    }

    /**
     *  @param newYear the new birth year
     */
    public void setBirthYear(int newYear) {
        if (born == null) //Precondition is violated.
        {
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        born.setYear(newYear);
        if (!consistent(born, died))
        {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }

    /**
     *  @param newYear the new death year
     */
    public void setDeathYear(int newYear) {
        if (died == null) //Precondition is violated.
        {
            System.out.println("Fatal Error. Aborting.");
            System.exit(0);
        }
        died.setYear(newYear);
        if (!consistent(born, died))
        {
            System.out.println("Inconsistent dates. Aborting.");
            System.exit(0);
        }
    }
    /**
     *  @return the name
     */
    public String getName() {
        return name;
    }
    /**
     *  @return a string version of birthday.
     */
    public String getBirthDate() {
        return (born.getMonth() + ", " + born.getDay() + ", " + born.getYear());
    }
    /** 
     *  @return a string version of deathday.
     */
    public String getDeathDate() {
        if (died == null)
            return null;
        else
            return (died.getMonth() + ", " + died.getDay() + ", " + died.getYear());
    }

    /**
     * @param birthDate date of birth
     * @param deathDate date of death
     * @return true or false based on equality
     */
    private static boolean consistent(Date birthDate, Date deathDate) {
        if (birthDate == null)
            return false;
        else if (deathDate == null)
            return true;
        else
            return (birthDate.precedes(deathDate)
                    || birthDate.equals(deathDate));
    }
}