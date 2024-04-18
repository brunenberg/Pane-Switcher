import javafx.scene.paint.Color;

public class MyColorPane extends MyAbstractPane {

	public MyColorPane(String colorString) {
		super(colorString);
	}

	@Override
	protected void ChangeColor() {
		label.setTextFill(label.getTextFill() == Color.WHITE ? Color.BLACK : Color.WHITE);
	}
}
