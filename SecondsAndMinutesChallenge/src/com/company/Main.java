package com.company;

public class Main {
    //Constants are usually typed in upper case to identify the constants.
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(10021));
        System.out.println(getDurationString(72,59));
        System.out.println(getDurationString(7201,9));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(-1,59));
        System.out.println(getDurationString(1,-1));
        System.out.println(getDurationString(1,60));

    }
    private static String getDurationString(int min,int seconds){
        if (min < 0 || (seconds<0 || seconds>59))
            return INVALID_VALUE_MESSAGE;
        int hr = min/60;
        int minRemainder = min%60;
        String hr_s;
        String min_s;
        String sec_s;

        hr_s = hr<=9 ? "0"+hr : String.valueOf(hr);
        min_s = minRemainder<=9 ? "0"+minRemainder : String.valueOf(minRemainder);
        sec_s = seconds<=9 ? "0"+seconds : String.valueOf(seconds);

        return hr_s+"h "+min_s+"m "+sec_s+"s";

    }
    private static String getDurationString(int seconds) {
        if (seconds < 0)
            return INVALID_VALUE_MESSAGE;
        int min = seconds/60;
        int secRemainder = seconds%60;
        return(getDurationString(min,secRemainder));
    }
}
