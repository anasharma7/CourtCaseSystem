/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.View;

import java.text.SimpleDateFormat;
import java.util.Date;

public class courtEventView {
    
    public void showEventDetails(Date date, String time, int courtId, String judge) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        
        System.out.println("----- Court Event Details -----");
        System.out.println("Date: " + formattedDate);
        System.out.println("Time: " + time);
        System.out.println("Court ID: " + courtId);
        System.out.println("Judge: " + judge);
    }
}
