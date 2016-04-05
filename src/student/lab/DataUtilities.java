/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** This program will demonstrate two methods of converting date/time objects to formatted string and two methods of formatted string to date/time objects.
 * Also one method for performing Date/Time arithmetic, such 
   //  as the number of months, days, minutes, etc., between two dates.
 *
 * @author NStokesBeamon
 */
public class DataUtilities {
    
    /**
     * This Method Takes in a LocalDateTime object and a format, it then returns a string of that LocalDateTime Object 
     * in the format you provide.
     * @param date a LocalDateTime object
     * @param dateFormat a format string of your choosing.
     * @return String of a LocalDateTime object
     */
    public String dateTimeToString(LocalDateTime date, String dateFormat){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        String formattedDateTime = date.format(formatter);
        return formattedDateTime;
    }
    
  /**
   * This Method takes in a LocalDate object and a format, it then returns that date object in the format you provided.
   * @param date a LocalDate object
   * @param dateFormat The format you want that date object to convert to as a String.
   * @return String of a LocalDate object.
   */
    
     public String dateToString(LocalDate date, String dateFormat){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        String formattedDate = date.format(formatter);
        return formattedDate;
    }
     
     /**
     * This Method takes a sting and a format string and creates a LocalDate Object.
     * @param string the date you are creating
     * @param dateFormat the format of the string you are providing.
     * @return 
     * @throws IllegalArgumentException if the length of the strings do not match.
     */
     
    public LocalDate stringToLocalDate(String string, String dateFormat) throws IllegalArgumentException{
            if (string.length() != dateFormat.length()){
            throw new IllegalArgumentException();
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate thisDate = LocalDate.parse(string, formatter);
        return thisDate;
    }
    
     /**
     * This Method takes two strings of dates and a format of those two strings, it then
 converts the strings into LocalDate objects and finds the difference in days between them.
     * @param date1 String of first Date
     * @param date2 String of Second Date
     * @param dateFormat the format of your strings.
     * @return the difference in Days.
     * @throws IllegalArgumentException
     */
    
    public long betweenTwoLocalDates(String date1, String date2, String dateFormat) throws IllegalArgumentException{
        if( date1 == null || date2.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        LocalDate thisDate = stringToLocalDate(date1, dateFormat);
        LocalDate thisDate2 = stringToLocalDate(date2, dateFormat);
                
             
        Duration dur = Duration.between(thisDate, thisDate2);
        long days = (dur.toDays());
        return days;
    }
     
     public static void main(String[] args) {
        DataUtilities dateUtil = new DataUtilities();
        LocalDate date = LocalDate.now();
        LocalDateTime date1 = LocalDateTime.now();
        
        System.out.println(dateUtil.dateToString(date, "MM-dd-yyyy"));
        System.out.println(dateUtil.dateTimeToString(date1, "MM-dd-yyyy hh:mm"));
        
        System.out.println(dateUtil.stringToLocalDate("03-18-2016", "MM-dd-yyyy"));
        
        System.out.println(dateUtil.betweenTwoLocalDates("03-26-2016", "03-31-2016", "MM-dd-yyyy") + " days.");
        
    }
    
}
