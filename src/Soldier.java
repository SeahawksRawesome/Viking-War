import java.awt.Color;
import java.awt.Graphics;

public class Soldier extends GameObject {

	public Soldier(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	void update() {
		x++;

	}

	@Override
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);

	}

}
