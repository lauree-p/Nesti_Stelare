import java.awt.EventQueue;
import views.View_App;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_App view_app = new View_App();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
