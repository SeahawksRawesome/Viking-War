import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	ObjectManager manager = new ObjectManager();
	Font title;
	Soldier infantry = new Soldier(250, 400, 50, 50);
	GamePanel() {
		timer = new Timer(1000 / 60, this);
		title = new Font("Arial", Font.PLAIN, 48);
		manager.addObject(infantry);
	}

	void updateMenuState() {

	}

   void updateGameState() {
	   manager.update();
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, Viking_War.height, Viking_War.width);
		g.setFont(title);
		g.setColor(Color.BLACK);
		g.drawString("Viking War!", 650, 350);
		g.drawString("Press Enter To Start", 550, 500);
	}

	void drawGameState(Graphics g) {
		
		g.clearRect(0, 0, Viking_War.height, Viking_War.width);
		manager.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, Viking_War.height, Viking_War.width);
		g.setFont(title);
		g.setColor(Color.BLACK);
		g.drawString("You Lost!", 650, 350);
		g.drawString("Press Enter To Go To The Start", 450, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	void startGame() {
		timer.start();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			if(currentState == MENU_STATE){
				currentState = GAME_STATE;
			}
			else if(currentState == GAME_STATE)
			{
				currentState = END_STATE;
			}
			else if(currentState == END_STATE)
			{
				currentState = MENU_STATE;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
