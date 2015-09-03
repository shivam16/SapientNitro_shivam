/**
 * 
 */
package com.sapient.client.cui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author spra26
 *
 */

class Data{
	private int value;

	public void getValue() {
		System.out.println(value);
	}

	public void setValue(int value) {
		this.value = value;
	}
}

class Runner implements Runnable{
	Data data;
	
	private Thread secondThread;
	public Runner(){
		
		data = new Data();
	}
	
	
	@Override
	public void run() {
		Thread currThread=Thread.currentThread();
		
		
		//System.out.println("Inside Run");
		for(int counter=0; counter<5;counter++){
			System.out.println(Thread.currentThread());
			
			if(currThread.getName().equals("Producer")){
				System.out.println(currThread);
				synchronized(data){
				data.setValue(counter+1);	
				
				try {
					data.notify();
					if(! secondThread.isAlive()){
						secondThread.start();
					}
					data.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}else if(currThread.getName().equals("Consumer")){
				System.out.println(currThread);
				synchronized(data){
					data.getValue();
					data.notify();
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		
	}


	


	public void setSetSecondThread(Thread secondThread) {
		this.secondThread = secondThread;
	}
	
}
public class MainApp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//every java Application is single threaded
		
	//	Thread mainThread= Thread.currentThread();
		
	//	System.out.println(mainThread);
		
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 
	/*	Runner runner= new Runner();
		
		Thread firstThread= new Thread(runner, "Producer");
		Thread secondThread= new Thread(runner, "Consumer");
		
		firstThread.start();
		runner.setSetSecondThread(secondThread);
		//secondThread.start();*/
		
	/*	try {
			firstThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			secondThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try(
				FileInputStream in= new FileInputStream("sapin.txt");
				FileOutputStream out= new FileOutputStream("sapout.txt");
				){
			int c;
			while((c=in.read())!=-1)
				try {
					out.write(c);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		System.out.println("The End");

	}

}
