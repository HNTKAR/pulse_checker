package pulse3;
import java.awt.Font;
import java.util.concurrent.TimeUnit;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Pulse3 {
	static int spulse;
public static void main(String[] args) throws InterruptedException {

	
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
	while(true) {
		SubPulse sub=new SubPulse();
		spulse=0;
		spulse=sub.subcount();
		String str = String.valueOf(sub.subcount());
		Changelabel.setText(str+"[bpm]");
		conPane.add(Changelabel,BorderLayout.SOUTH);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(1);
    }

}
}
