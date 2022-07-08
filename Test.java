package Example1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Using Anonymous Inner class that extends a class
	        // Here a Thread class
	        Thread t = new Thread() {
	           
	            // run() method for the thread
	            public void run()
	            {
	                // Print statement for child thread
	                // execution
	                System.out.println("Child Thread");
	            }
	        };
	 
	        // Starting the thread
	        t.start();
	 
	        // Displaying main thread only for readability
	        System.out.println("Main Thread");
	    }
	}