package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class CalculateDateOfWeek
{
    public static String calculateFirstAndLastDateOfTheWeek()
    {
        String str="";
       Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        str=str+df.format(c.getTime());
        for(int i=0;i<6;i++)
        {
            c.add(Calendar.DATE,1);
        }
        return str+df.format(c.getTime());


    }
}
