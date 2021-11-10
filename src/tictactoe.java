import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class tictactoe implements ActionListener {

		Random random = new Random();
		JFrame frame = new JFrame();
		JPanel title_panel = new JPanel();
		JPanel button_panel = new JPanel();
		JPanel reset_panel = new JPanel();
		JLabel textfield = new JLabel();
		JButton resetbutton = new JButton();
		JButton[] buttons = new JButton[9];
		boolean player1_turn;
		JButton newgameb = new JButton("RESET"); 
		

		tictactoe()
		{
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(800,800);
			frame.getContentPane().setBackground(new Color(50,50,50));
			frame.setLayout(new BorderLayout());
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);

			
			textfield.setBackground(new Color(25,25,25));
			textfield.setForeground(new Color(25,255,0));
			textfield.setFont(new Font("Ink Free",Font.BOLD,75));
			textfield.setHorizontalAlignment(JLabel.CENTER);
			textfield.setText("Tic-Tac-Toe");
			textfield.setOpaque(true);
			
			resetbutton.setBackground(new Color(25,25,25));
			resetbutton.setForeground(new Color(25,255,0));
			resetbutton.setFont(new Font("Ink Free",Font.BOLD,75));
			resetbutton.setHorizontalAlignment(JLabel.CENTER);
			resetbutton.setText("RESET");
			resetbutton.setOpaque(true);
			resetbutton.addActionListener(this);
			
			title_panel.setLayout(new BorderLayout());
			title_panel.setBounds(0,0,800,100);
			reset_panel.setLayout(new BorderLayout());
			reset_panel.setBounds(0,0,800,100);
			
			button_panel.setLayout(new GridLayout(3,3));
			button_panel.setBackground(new Color(150,150,150));
			button_panel.setBounds(0,0,30,30);
			for(int i=0;i<9;i++) {
				buttons[i] = new JButton();
				button_panel.add(buttons[i]);
				buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
				buttons[i].setFocusable(false);
				buttons[i].addActionListener(this);
			}
			
			title_panel.add(textfield);
			frame.add(title_panel,BorderLayout.NORTH);
			reset_panel.add(resetbutton);
			frame.add(reset_panel,BorderLayout.SOUTH);
			frame.add(button_panel);
			firstTurn();
			
			
		}
		
		
		
		public void firstTurn() {
			/*try {
				Thread.sleep(2000);
				textfield.setText("Tic Tac Toe");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				//Thread.sleep(2000);
				textfield.setText("Tic Tac Toe");
			}*/
	
			if(random.nextInt(2)==0) {
				player1_turn=true;
				textfield.setText("X turn");
			}
			else {
				player1_turn=false;
				textfield.setText("O turn");
			}
		}
		
		public void check() {
			//check X win conditions
			if(
					(buttons[0].getText()=="X") &&
					(buttons[1].getText()=="X") &&
					(buttons[2].getText()=="X")
					) {
				xWins(0,1,2);
			}
			if(
					(buttons[3].getText()=="X") &&
					(buttons[4].getText()=="X") &&
					(buttons[5].getText()=="X")
					) {
				xWins(3,4,5);
			}
			if(
					(buttons[6].getText()=="X") &&
					(buttons[7].getText()=="X") &&
					(buttons[8].getText()=="X")
					) {
				xWins(6,7,8);
			}
			if(
					(buttons[0].getText()=="X") &&
					(buttons[3].getText()=="X") &&
					(buttons[6].getText()=="X")
					) {
				xWins(0,3,6);
			}
			if(
					(buttons[1].getText()=="X") &&
					(buttons[4].getText()=="X") &&
					(buttons[7].getText()=="X")
					) {
				xWins(1,4,7);
			}
			if(
					(buttons[2].getText()=="X") &&
					(buttons[5].getText()=="X") &&
					(buttons[8].getText()=="X")
					) {
				xWins(2,5,8);
			}
			if(
					(buttons[0].getText()=="X") &&
					(buttons[4].getText()=="X") &&
					(buttons[8].getText()=="X")
					) {
				xWins(0,4,8);
			}
			if(
					(buttons[2].getText()=="X") &&
					(buttons[4].getText()=="X") &&
					(buttons[6].getText()=="X")
					) {
				xWins(2,4,6);
			}
			//check O win conditions
			if(
					(buttons[0].getText()=="O") &&
					(buttons[1].getText()=="O") &&
					(buttons[2].getText()=="O")
					) {
				oWins(0,1,2);
			}
			if(
					(buttons[3].getText()=="O") &&
					(buttons[4].getText()=="O") &&
					(buttons[5].getText()=="O")
					) {
				oWins(3,4,5);
			}
			if(
					(buttons[6].getText()=="O") &&
					(buttons[7].getText()=="O") &&
					(buttons[8].getText()=="O")
					) {
				oWins(6,7,8);
			}
			if(
					(buttons[0].getText()=="O") &&
					(buttons[3].getText()=="O") &&
					(buttons[6].getText()=="O")
					) {
				oWins(0,3,6);
			}
			if(
					(buttons[1].getText()=="O") &&
					(buttons[4].getText()=="O") &&
					(buttons[7].getText()=="O")
					) {
				oWins(1,4,7);
			}
			if(
					(buttons[2].getText()=="O") &&
					(buttons[5].getText()=="O") &&
					(buttons[8].getText()=="O")
					) {
				oWins(2,5,8);
			}
			if(
					(buttons[0].getText()=="O") &&
					(buttons[4].getText()=="O") &&
					(buttons[8].getText()=="O")
					) {
				oWins(0,4,8);
			}
			if(
					(buttons[2].getText()=="O") &&
					(buttons[4].getText()=="O") &&
					(buttons[6].getText()=="O")
					) {
				oWins(2,4,6);
			}
		}
		
		public void xWins(int a,int b,int c) {
			buttons[a].setBackground(Color.GREEN);
			buttons[b].setBackground(Color.GREEN);
			buttons[c].setBackground(Color.GREEN);
			
			for(int i=0;i<9;i++) {
				buttons[i].setEnabled(false);
			}
			
			textfield.setText("X wins");
		}
		public void oWins(int a,int b,int c) {
			buttons[a].setBackground(Color.GREEN);
			buttons[b].setBackground(Color.GREEN);
			buttons[c].setBackground(Color.GREEN);
			
			for(int i=0;i<9;i++) {
				buttons[i].setEnabled(false);
			}
			textfield.setText("O wins");
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetbutton)
		{	
			frame.dispose();
			tictactoe tic = new tictactoe();
		}
		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						check();
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("X turn");
						check();
					}
				}
			}			
		}
		
	}

}
