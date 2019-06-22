package pulse1;
import java.util.concurrent.TimeUnit;

public class Pluse {public static void main(String[] args) throws InterruptedException  {
	
	while(true) {
		
	SubPulse sa = new SubPulse();
	System.out.print(sa.ssprint());
	TimeUnit.SECONDS.sleep(1);
}
}
}
