package pack;

public class ThreadRuna implements Runnable{
public void run()
{
	System.out.println("thread is running successfully");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r1=new ThreadRuna();//interface's obj thread
//passing interface objthread to the main thread
Thread t1=new Thread(r1,"Mythread");
t1.start();
String str=t1.getName();
System.out.println(str);
	}

}
