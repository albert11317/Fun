
import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloWorld extends JFrame {

	private static final long serialVersionUID = 1L;
	public static void main(String args[]) {
		new HelloWorld();
	}
	HelloWorld() {
		JLabel jlbHelloWorld = new JLabel("Hello World");
		add(jlbHelloWorld);
		this.setSize(100, 100);
		// pack();
		setVisible(true);
	}
}
