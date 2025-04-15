package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		
		JFrame window = new JFrame("2D Adventure");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		GamePanel gamePanel = new GamePanel();
		window.setTitle("2D Adventure");
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		window.add(gamePanel);
		window.pack();
		
		gamePanel.startGameThread();
		
	}
	
}
