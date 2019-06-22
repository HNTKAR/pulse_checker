package pulse4;
import java.awt.Font;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.io.*;
import gnu.io.*;


public class Pulse4 {
	static int spulse;
public static void main(String[] args) throws InterruptedException, PortInUseException, NoSuchPortException, UnsupportedCommOperationException, IOException {

	
	// TODO 自動生成されたメソッド・スタブ
	//////////no change start//////////
    JFrame frame = new JFrame("title");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 150);
	frame.setLocationRelativeTo(null);
	Container conPane = frame.getContentPane();
	//////////no change end//////////

	/////set static label/////
	JLabel staticlabel =new JLabel("現在の脈拍");
	staticlabel.setHorizontalAlignment(SwingConstants.CENTER);
	staticlabel.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
	conPane.add(staticlabel,BorderLayout.NORTH);

	/////set change label/////
	JLabel Changelabel =new JLabel();
	Changelabel.setHorizontalAlignment(SwingConstants.CENTER);
	Changelabel.setFont(new Font(Font.SERIF, Font.ITALIC, 60));
	
	/////start setting/////
	for(int i=0;i<=5;i++) {
		if(i%2==0) {
			Changelabel.setText("Start...");
			conPane.add(Changelabel,BorderLayout.SOUTH);
			frame.setVisible(true);
			TimeUnit.SECONDS.sleep(1);
		}
		else {
			Changelabel.setText("");
			conPane.add(Changelabel,BorderLayout.SOUTH);
			frame.setVisible(true);
			TimeUnit.SECONDS.sleep(1);
			}
	}
	
	/////pause/////
	frame.setVisible(false);
	TimeUnit.SECONDS.sleep(1);
	/////loop/////
	CommPortIdentifier portID = CommPortIdentifier.getPortIdentifier( "COM5" );
	   SerialPort port = (SerialPort)portID.open("Sample", 5000); 
	   port.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
	   port.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
	   InputStream is = port.getInputStream();
	    
	   float c;
	   System.out.println("start reading");
	while(true) {
        c = is.read();
		if(c>-1) {
		c=(1/c)*25;
		c=60/c;
        System.out.println(c);
		String str = String.valueOf(c);
		Changelabel.setText(str+"[bpm]");
		conPane.add(Changelabel,BorderLayout.SOUTH);
		frame.setVisible(true);
		}
	}
	}
}
