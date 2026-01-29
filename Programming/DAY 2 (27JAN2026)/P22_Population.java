/*Population Projection

The Indian Census Bureau projects population based on the following :
 - One birth every 7 seconds 
 - One death every 13 seconds
 - One new immigrant every 45 seconds
 
 Write a program to display the population for the next 5 years . Assume the 
 current population is 312,032,486 and one year has 365 days.
 
*/


class P22_Population{
public static void main (String[]args) {

long currPop = 312032486;
//              days  hrs  min secs    yrs
long seconds = (365 * 24 * 60 * 60 ) * 5;

final long BIRTH = seconds/7;
final long DEATH = seconds/13;
final long IMMIGRANTS = seconds/45;

long newPop = currPop + BIRTH - DEATH + IMMIGRANTS;

System.out.println ("Previous Population : " + currPop);
System.out.println("New Population: " + newPop);

}}