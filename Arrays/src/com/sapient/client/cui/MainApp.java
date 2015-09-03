package com.sapient.client.cui;

import java.util.Calendar;
import java.util.GregorianCalendar;

//class Process{
	/*public int[] create(){
		int [] num;
		num=new int[10];
		
		num[3]=6;
		num[7]=9;
		
		return num;
	}
	
	
	public void display(int [] src){
		for(int data:src){
			System.out.println(data);
		}
	}
}
*/
public class MainApp {

	public static void main(String[] args) {
		
		float gradePointAverage = Statistics.average(4, 3, 4);
		float averageAge = Statistics.average(24, 32, 27, 18);
		System.out.println(gradePointAverage);
		System.out.println(averageAge);
		
		//Process p = new Process();
	//	 int[] result = p.create();
	//	 p.display(result);
		// 
		// int[][][] num;
		 
	//	 num =new int [5][3][2];
	/*	 for(int counter=0;counter<num.length;counter++){
			 for(int data:num[counter]){
				 System.out.println(data);
			 }
		 }*/
			
		/* for(int [][]dimension1:num){
			 for(int []dimension2:dimension1){
				 for(int dimension3:dimension2){
					 System.out.println(dimension3);
				 }
			 }
		 }*/
				 
		//createArray();
		//Calendar c= new GregorianCalendar();
	//	System.out.println(c.getTime());
		
	/*	int num[][][];
		num =new int[5][3][2];
		
		num[0][1][1]=5;
		
		int[][][] dest;
		dest=new int[5][3][2];
		
		System.arraycopy(num, 0, dest, 0, num.length);
		
		System.out.println(dest[0][1][1]);
		
		
		}*/
	/* public static Point[] createArray(){
			Point[] p1;
			
			p1=new Point[10];
			for(int i=0;i<10;i++){
				p1[i]= new Point(i,i+1);
			
			}
			return p1;
		}*/
}
		




class Point{
	int x;
	int y;
	
	public Point(int value1, int value2){
		x=value1;
		y=value2;
	}
	
	
	
}
}

class Statistics{
	public static float average(int... nums ){
		int sum=0;
		for(int i:nums){
			sum+=i;
		}
		return ((float) sum) / nums.length;
	}
}



