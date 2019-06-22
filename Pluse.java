package pulse2;
import java.awt.Font;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Pluse2 {	
	public static int ds1;
public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ

	ds1= 1 ;
	//////////no change start//////////
    JFrame frame = new JFrame("title");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 150);
	frame.setLocationRelativeTo(null);
	Container conPane = frame.getContentPane();
	//////////no change end//////////

	JLabel label =new JLabel("現在の脈拍");
	JLabel label2 =new JLabel(ds1+"bpm");
	label2.setFont(new Font("Century", Font.ITALIC, 50));
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label2.setHorizontalAlignment(SwingConstants.CENTER);
	conPane.add(label,BorderLayout.NORTH);
	conPane.add(label2,BorderLayout.SOUTH);
    frame.setVisible(true);
}

}
