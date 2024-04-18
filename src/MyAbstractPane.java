import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;

public abstract class MyAbstractPane extends BorderPane {
	
	private final Font font = Font.font("arial", FontWeight.BOLD, 44);
	protected Label label;
	protected Color backgroundColor;

	public MyAbstractPane(String colorString) {
		setPrefSize(200, 200);
		
		label = new Label(colorString.toUpperCase());
		label.setFont(font);
		label.setTextFill(Color.WHITE);
		
		backgroundColor = Color.GREY;
		
		try {
			backgroundColor = Color.valueOf(colorString);
		} catch(Exception e) {
			// Niks :)
		}
		
		setBackground(new Background(new BackgroundFill(backgroundColor, null, null)));
		
		setCenter(label);
	}
	
	protected abstract void ChangeColor();
}
