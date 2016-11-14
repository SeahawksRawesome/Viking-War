import javax.swing.JFrame;

public class Viking_War {
	JFrame f1;
	static final int height = 1700;
	static final int width = 700;
	GamePanel viking;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Viking_War m = new Viking_War();

	}

	Viking_War() {
		viking = new GamePanel();
		setup();

	}

	void setup() {

		f1 = new JFrame();
		f1.add(viking);
		f1.addKeyListener(viking);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(height, width);
		viking.startGame();

	}
}
