import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class MyButtonPane extends BorderPane {
	
	private Button button;

	public MyButtonPane(ArrayList<MyAbstractPane> panes) {
		setPrefWidth(100);
		
		button = new Button("Switch");
		button.setPrefSize(80, 40);
		button.setOnAction(e -> handle(panes));
		setCenter(button);
	}

	private void handle(ArrayList<MyAbstractPane> panes) {
		for (MyAbstractPane pane : panes) {
			pane.ChangeColor();
		}
	}
	
}
