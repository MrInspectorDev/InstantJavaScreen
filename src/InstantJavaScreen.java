import javax.swing.JFrame;

public class InstantJavaScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private final static int IJSVer = 1;
	
	/**
	 * [--------------------------------------------------------------------------------------------------------]
	 *
	 * READ-ME: IJS is open source, the source has been obfuscated so it can
	 * not be copied over though from Java Decompilers. The source code can be found on GitHub!
	 *
	 * Contribution: IJS is open to both code contributions and money
	 * contributions. Code contributions will be made through you forking the
	 * project and making a pull request on github.
	 *
	 * Staff of IJS: Staff of IJS get early release's that no one other than the creator & developers have,
	 * if they are leaked by staff, they will face consequences as soon as we find out.
	 *
	 * Donators of IJS: You are NOT allowed to get refunds for your donations, as this is a donation,
	 * you are not buying anything.
	 * 
	 * [--------------------------------------------------------------------------------------------------------]
	 *
	 **/

	
	public static void main(String[] args) {
	//	new InstantJavaScreen();
		Key key = new Key();
		key.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public InstantJavaScreen() {
		
	}

	public int getIJSVer() {
		return IJSVer;
	}
}
