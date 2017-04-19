/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.jwr.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jordanrehbein
 */
public class DateUtilities {
    //Convert a LocalDateTime object to a formatted string
    public final String convertLocalDateTimeToFormattedString(LocalDateTime dateTime, String pattern){
        String dateTimeString = "";
        
        dateTimeString = dateTime.format(DateTimeFormatter.ofPattern(pattern)).toString();
        
        return dateTimeString;
    }
    
    //Convert a formatted string to a LocalDateTime object
    public final LocalDateTime convertFormattedStringToLocalDateTime(String dateTimeString){
        
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString);
        
        return dateTime;
    }
    
    //Get the difference in some time unit between two dates, times or both
    
    public final double getDifferenceDateTime(String firstDateTimeString, String secondDateTimeString, String dateType){
        double difference = 0;
        
        LocalDateTime firstDateTime = convertFormattedStringToLocalDateTime(firstDateTimeString);
        LocalDateTime secondDateTime = convertFormattedStringToLocalDateTime(secondDateTimeString);
        
        difference = firstDateTime.until(secondDateTime, ChronoUnit.valueOf(dateType));
        
        return difference;
    }
    
    //Get a LocalDate or LocalDateTime object for a date or time in the future, or in the past
    
}
