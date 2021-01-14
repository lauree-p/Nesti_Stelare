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
					//Nesti_Stelare window = new Nesti_Stelare();
					//window.frame.setVisible(true);
					
					View_App view_app = new View_App();
					//view_app.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
