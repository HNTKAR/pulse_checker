package pulse3;
import java.io.*;
import gnu.io.*;

public class SubPulse {
	int subcount(){
		try{
			   CommPortIdentifier portID = CommPortIdentifier.getPortIdentifier( "COM5" );
			   SerialPort port = (SerialPort)portID.open("Sample", 5000); 
			   port.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			   port.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
			   InputStream is = port.getInputStream();
			    
			   int c;
	                    c = is.read();
	                    	System.out.println(c);
	                    	return c;
			   		
			   }catch(NoSuchPortException e){
	               System.err.println("Can Not Find Device");
	               e.printStackTrace();
	           } catch(PortInUseException e){
	               System.err.println("Can Not Open Device");
	               e.printStackTrace();
		  } catch(UnsupportedCommOperationException e){
	               System.err.println("Invalid Parameter");
	               e.printStackTrace();
		  } catch(IOException e){
	               e.printStackTrace();
		  } catch(Exception e){
	               e.printStackTrace();
		  }
		return 9999;
		}
	

}
