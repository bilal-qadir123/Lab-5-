import java.lang.Math;
public class Task1 extends Thread {
	public void run(){
		for(int i=0; i<=26; i++) {
			int con=(int)(Math.random()*26);
			char alpha=(char)('A'+con-1);
			try
			{
			sleep(500); 
			System.out.println(Thread.currentThread().getName());
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
			if(alpha=='@') {
				continue;
			}
			System.out.println(alpha);
			}

			}
	}
