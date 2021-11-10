import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Launchpage implements ActionListener {
private static final int EXIT_ON_CLOSE = 0;
JFrame frame = new JFrame();
JButton snakebutton = new JButton("Play");
JButton pinball = new JButton("Play");
JButton tictac = new JButton("Play");
  
Launchpage()
{
	JFrame frame = new JFrame();

	//Main page title
	JPanel title_panel = new JPanel();
	JLabel textfield = new JLabel();
	textfield.setForeground(new Color(25,255,0));
	textfield.setFont(new Font("Ink Free",Font.BOLD,75));
	textfield.setBounds(620, 10, 100, 30);
	textfield.setText("Arcade Games");
	textfield.setOpaque(true);
	title_panel.add(textfield);


	snakebutton.setBounds(180,675,100,30);
	snakebutton.setBackground(Color.BLUE);
    snakebutton.setForeground(Color.WHITE);
	snakebutton.setFocusable(true);
	snakebutton.addActionListener(this);
	pinball.setBounds(590,675,100,30);
	pinball.setBackground(Color.BLUE);
    pinball.setForeground(Color.WHITE);
	pinball.setFocusable(true);
	pinball.addActionListener(this);
	tictac.setBounds(970,675,100,30);
	tictac.setBackground(Color.BLUE);
    tictac.setForeground(Color.WHITE);
	tictac.setFocusable(true);
	tictac.addActionListener(this);
	frame.setTitle("Arcade Games");
	ImageIcon icon = new ImageIcon("src\\Background.gif");
	JLabel label = new JLabel(icon);
	frame.add(label);
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	frame.setSize(1280,900);
	frame.getContentPane().setBackground(Color.BLACK);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
	frame.add(label);
	frame.add(snakebutton);
	frame.add(pinball);
	frame.add(tictac);	
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==snakebutton)
	{
		frame.dispose();
		 gameframe game1 = new gameframe();
	}
	else if(e.getSource()==tictac)
	{
		frame.dispose();
		tictactoe tic = new tictactoe();
	}
	else if(e.getSource()==pinball)
	{
		frame.dispose();
		framepong fpong = new framepong();
	}	
}
}