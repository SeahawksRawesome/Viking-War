import java.awt.Color;
import java.awt.Graphics;

public class Enemy extends GameObject {

	public Enemy(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		x--;
	}

	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.YELLOW);
		g.drawRect(x, y, width, height);
	}

}
