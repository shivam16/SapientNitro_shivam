package com.sapient.client.cui;

/** This.
 * Hello
 * 
 * @author spra26
 * 
 */
public class Light {
  /** This.
  * 
  * @param args asdfdgf
  */
  public static void main(String[] args) {
    int lightSpeed;
    long days;
    long seconds;   
    lightSpeed = 186000;
    days = 1000;
    seconds = days * 24 * 60 * 60; // convert to seconds
    long distance = 0;
    distance = lightSpeed * seconds; // compute distance
    System.out.print("In " + days);
    System.out.print(" days light will travel about ");
    System.out.println(distance + " miles.");
  }
}
