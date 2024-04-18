import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyCirclePane extends MyAbstractPane {
	
	private Circle circle;

	public MyCirclePane(String colorString) {
		super(colorString);
		
		getChildren().clear();
		
		StackPane stackPane = new StackPane();
		
		circle = new Circle(80);
		circle.setFill(Color.BLACK);
		
		stackPane.getChildren().addAll(circle, label);
		
		setCenter(stackPane);
	}

	@Override
	protected void ChangeColor() {
		circle.setFill(circle.getFill() == Color.BLACK ? backgroundColor.darker() : Color.BLACK);
	}
}
