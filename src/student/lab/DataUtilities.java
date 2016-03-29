/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** This program will demonstrate two methods of converting date/time to formatted string 
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
    
}
