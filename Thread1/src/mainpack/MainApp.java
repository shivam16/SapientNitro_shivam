package mainpack;

class Data{
	
	private int value;
	
	
	/*public Data(){
		System.out.println(value);
	}*/
	public void getValue() {
		System.out.println(value);
	}
	
	public void setValue(int value){
		this.value=value;
	}
}

class Runner implements Runnable {
	Data data;
	private Thread secondThread;
    public Runner(){
    	data=new Data();
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("Inside run");
		Thread currThread;
		
		for(int counter=0;counter<10;counter++){
		currThread=Thread.currentThread();
		
		
		if(currThread.getName().equals("Producer")){
			System.out.println(currThread);
			synchronized(data){
			data.setValue(counter+1);
			
			try {
				data.notify();
				if(!secondThread.isAlive()){
					secondThread.start();
				}
				data.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		else if(currThread.getName().equals("Consumer")){
			System.out.print(currThread);
			synchronized(data){
			data.getValue();
			
			  try {
				data.notify();
				//if(!firstThread)
				data.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		}
	}
	public void setSecondThread(Thread secondThread) {
		// TODO Auto-generated method stub
		this.secondThread =secondThread;
	}
	

}

public class MainApp {

	public static void main(String[] args) {
		// every Java Application is single threaded......
         /*     Thread mainThread=Thread.currentThread();
              
              try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              
              
              System.out.println(mainThread);
             */ 
              Runner runner = new Runner();
             Thread firstThread= new Thread(runner,"Producer");
             Thread  secondThread= new Thread(runner,"Consumer");
             /*
              System.out.println(th);
              System.out.println(th.getState());
              */
              firstThread.start();
            //  secondThread.start();
              
              runner.setSecondThread(secondThread);
            // System.out.println(th.getState());
            //  System.out.println("the end");
	}

}




