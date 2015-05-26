
public class Animate implements Runnable {
	
	BlockBreakerPanel bp;
	
	Animate(BlockBreakerPanel b)
	{
		bp = b;
	}
	
	public void Run()
	{
		while(true)
		{
			bp.Update();
			Thread.sleep(10);
			
		}
		
	}

}
