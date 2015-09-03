package com.sapient.client.cui;

import java.util.logging.Level;
import java.util.logging.Logger;
/** This.
 * 
 * @author spra26
 *
 */
public class AreaOfCircle {
/** This calculates area.
 * 
 * @param args aSDSADFF
 */
  public static void main(final String...args) {
    double piconstant;
    double radius;
    double area; 
    
    radius = 10.8; // radius of circle
    piconstant = 3.1416; // pi, approximately
    area = piconstant * radius * radius; // compute area
    final Logger log = Logger.getLogger(AreaOfCircle.class.getName());
    if (log.isLoggable(Level.FINE)) {
      log.fine("Area of circle is " + area);
    }
  }

}
