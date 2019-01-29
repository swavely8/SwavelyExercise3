package com.swavely.Week1;

public class Main {

    public static void main(String[] args) {
	    double  celsiusLowTemp [] = {0.0,-2.4,7.7,14.3};
	    double celsiusHighTemp [] = {9.3,8.3,16.8,26.3};
	    for (int i = 0; i<(celsiusLowTemp.length); i++);
	        double fHigh = 9/5 * celsiusHighTemp[i] + 32;
	        double fLow = 9/5 * celsiusLowTemp[i] + 32;
        System.out.println("The low will be " + fLow + " The high will be " + fHigh);
    }
}
