import java.awt.Graphics;

public abstract class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive;

	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	abstract void update();

	abstract void draw(Graphics g);

}
