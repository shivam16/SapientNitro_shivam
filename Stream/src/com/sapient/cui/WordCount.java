/**
 * 
 */
package com.sapient.cui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author spra26
 *
 */
public class WordCount {

		public static int words =0, lines=0, chars=0;
		
		public static void wc(InputStreamReader isr) throws IOException{
			int c=0;
			boolean lastWhite= true;
			String WhiteSpace = " \t\n\r";
			
			while ((c=isr.read()) !=1){
				chars++;
				
				if(c=='\n'){
					lines++;
				}
				int index = WhiteSpace.indexOf(c);
				if(index==-1){
					if(lastWhite==true){
						++words;
					}
					lastWhite= false;
					
				}
				else{
					lastWhite=true;
				}
			}
			if(chars !=0){
				++lines;
			}
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr;
		try{
			if(args.length==0){
				wc(new InputStreamReader(System.in));
			}else{
				for(int i=0;i<args.length;i++){
					fr=new FileReader(args[i]);
					wc(fr);
					System.out.println();
				}
				
			}
		}catch(IOException e){
			System.out.println("IOException");
			
		}
}
}
