import java.awt.*;
import javax.swing.*;


public class framepong extends JFrame{
	panelpong pong;
	framepong()
	{
		pong = new panelpong();
		this.add(pong);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
