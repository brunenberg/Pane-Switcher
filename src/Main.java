import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setScene(new MyScene());
		stage.setTitle("PROG3 - wouterbrunenberg - tentamen");
		stage.setResizable(false);
		stage.show();
	}
}
