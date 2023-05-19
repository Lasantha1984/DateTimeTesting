/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimetesting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author user
 */
public class FormattingTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d = new Date("12:01:00");
        d = Calendar.getInstance().getTime();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
      
    }
    
}
