/**
 * 
 */
package com.sapient.cui;

import java.io.Serializable;

/**
 * @author spra26
 *
 */
public class Address implements Serializable {

		private static final long serialVersionUID =2L;
		 private String city;
		private String street;
		private String country;
		  public void setStreet(String street){
			  this.street= street;
		  }
		  public void setCountry(String country){
			  this.country= country;
		  }
	
		  public String getStreet(){
			  return this.street;
		  }
		  
		  public String getCountry(){
			  return this.country;
		  }
		  
		  @Override
		public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer(" Street : ")
		.append(this.street)
		.append(" Country : ")
		.append(this.country).toString();
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
	
	
	
}
