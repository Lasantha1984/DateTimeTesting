/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimetesting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author user
 */
public class GettingCurrentDate {
    public static void main(String[] args) {
        
        System.out.println(LocalDateTime.now().toString().replace("T", " "));
        System.out.println("2022-11-23 17:06:22.0".replace(".", "#").split("#")[0]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTimeStringConverter dateTime = new LocalDateTimeStringConverter();
            LocalDateTime tds;
        tds = LocalDateTime.parse("2022-11-23 17:06:22",formatter);
            System.out.println(tds);
               
           
    }
}
