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

		g.fillRect(x, y, width, height);

	}

}
