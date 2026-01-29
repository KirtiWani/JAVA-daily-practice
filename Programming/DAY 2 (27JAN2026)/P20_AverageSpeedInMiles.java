/*Average speed in miles 
Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
Write a program that displays the average speed in miles per hour.
(Note that 1 mile is 1.6 kilometers)
*/

public class P20_AverageSpeedInMiles {
public static void main(String[] args) {

 double distanceKm = 14.0;
 int minutes = 45;
 int seconds = 30;


 // Convert kilometers to miles
 double distanceMiles = distanceKm / 1.6;
 
 // Convert time to hours
 double timeHours = minutes / 60.0 + seconds / 3600.0;
 
 // Average speed
 double averageSpeed = distanceMiles / timeHours;
 
 
 System.out.println("The average speed is " + averageSpeed + " miles per h
 }
}
