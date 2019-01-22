package com.Dimmerling.week1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String city = "orinet";
        int dailyHighs[] = {27,24,35,29,40};
        int zip = 43146;
        float dailyHighstotal = dailyHighs[0] + dailyHighs[1] + dailyHighs[2] + dailyHighs[3] + dailyHighs[4];
        float dailyhighsavg = dailyHighstotal/5;

        System.out.println("city: " + city + ", zip code: " + zip + ", The average of the lat 5 days highest temp " + dailyhighsavg);







    }
}
