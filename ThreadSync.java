package pack;
public class ThreadSync {
private final String name;
public ThreadSync(String name)
{
	this.name=name;
}
public String getName()
{
	return this.name;
}
public synchronized void call(ThreadSync caller)//method will locked
{
	System.out.println(this.getName()+"has asked to call me"
   +caller.getName());
	try
	{
		Thread.sleep(500);//500milliseconds(ms)
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	caller.call(this);//current obj in thread or not
}

public synchronized void callMe(ThreadSync caller)
{
	System.out.println(this.getName()+"has asked to call me"
			+caller.getName());
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ThreadSync caller1=new ThreadSync("caller1");
  ThreadSync caller2=new ThreadSync("caller2");
  new Thread(new Runnable() {
	  public void run()
	  {
		  caller1.call(caller2);
	  }
  }).start();
	}

}
