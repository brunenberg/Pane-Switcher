
import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;

public class MyScene extends Scene {
	
	private MyButtonPane myButtonPane;
	private TilePane tilePane;
	private ArrayList<MyAbstractPane> panes;

	public MyScene() {
		super(new Pane());
		
		HBox root = new HBox();
		
		panes = new ArrayList<>();
		panes.addAll(Arrays.asList(
				new MyCirclePane("PLUM"), 
				new MyColorPane("TEAL"), 
				new MyCirclePane("GOLD"), 
				new MyColorPane("LIME"), 
				new MyCirclePane("NAVY"), 
				new MyColorPane("OLIVE")
			));
		
		myButtonPane = new MyButtonPane(panes);
		
		tilePane = new TilePane();
		tilePane.setPrefColumns(3);
		tilePane.getChildren().addAll(panes);
		
		root.getChildren().addAll(myButtonPane, tilePane);
		
		setRoot(root);
	}
}
