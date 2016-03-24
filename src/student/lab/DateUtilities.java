/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author NStokesBeamon
 */
public class DateUtilities {
    public static void main(String[] args) {
        
        LocalDateTime startDate = LocalDateTime.now();
        
         // Solution #1
        LocalDateTime endDate = startDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(startDate.until(endDate, ChronoUnit.HOURS));
        
        // Solution #2
        Duration diff = Duration.between(startDate, endDate);
        System.out.println(diff.toHours());
        
         LocalDateTime curDate = LocalDateTime.now();
        
        // Solution #1
        LocalDateTime endDate2 = curDate.with(TemporalAdjusters.lastDayOfMonth()).minusMinutes(500);
        long minutes = curDate.until(endDate2, ChronoUnit.MINUTES) % 60;
        long hours = curDate.until(endDate2, ChronoUnit.HOURS);
        System.out.println(hours + " hours, " + minutes + " minutes");
        
        // Solution #2
        Duration diff2 = Duration.between(startDate, endDate2);
        long hrs = diff2.toHours();
        long min = diff2.toMinutes() % 60;
        System.out.println("Hours: " + hrs + ", Minutes: " + min);
        
        
        
        
        
    }
}
