package pack;
 class ThreadProgram extends Thread {
    //thread is a process
     //life cycle of thread
	//1.new(constructing)//--starting the thread by initializing the object
	//in the class(extends)
	//2.Runnable(prepared to execute the code in interface
	//3.Running(thread for execution with/without time slot)
	//4.Blocked(in active)
	 //5.dead/terminated(thread exit at the  run() process)
	 //thread priorities(based on the  scenario)
	 //1-lowest (Thread.MIN_PRIORITY)
	 //5-standard(Thread.NORM_PRIORITY)
	 //10---highest(Thread.MAX_PRIORITY)
	 
	 public void run() {
		 System.out.println("the code is running inside the thread");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadProgram tp=new ThreadProgram();
tp.start();
System.out.println(" the code is running outside the thread");
	}

}
