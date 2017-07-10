package com.ideabag2.Haversine;

import java.util.Scanner;

/**
 * Created by AWOJIDE Martins on 7/5/2017.
 * This script is used to calculate distance between two geographical locations using
 * latitude, longitude and height difference of the locations
 * This computation is based on the Haversine Method
 **/

public class Haversine {
    // declaration of variables
    public static final double R = 6372.8;  //constant in kilometers

    /**
     * @return distance btw point 1 and 2 in kilometers w/o height difference considerations
     */
    public static double haversine() {

        //taking user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values here");
        //System myVar = new Scanner(System.in);

        System.out.println("Enter value of lat1 in degrees");
        double lat1 = input.nextDouble();
        //double lat1 = myVar.nextDouble();

        System.out.println("Enter value of lon1 in degrees");
        double lon1 = input.nextDouble();

        System.out.println("Enter value of lat2 in degrees");
        double lat2 = input.nextDouble();

        System.out.println("Enter value of lon2 in degrees");
        double lon2 = input.nextDouble();

        // write your code here
        double differenceInLatitude = Math.toRadians(lat2 - lat1);
        double differenceInLongitude = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double a = Math.pow(Math.sin(differenceInLatitude / 2), 2) +
                Math.pow(Math.sin(differenceInLongitude / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);

        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c * 1000;
    }

    public static void main(String[] args) {

        System.out.println(haversine() + " kilometers");
    }
}

