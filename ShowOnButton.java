package prova;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.LinkedList;

import javafx.application.*;
import javafx.stage.*;

public class ShowOnButton extends Application{
	
	int currentIndex = 0;
	LinkedList<Label> linkedList = new LinkedList<Label>();
	
	public static void main(String[] args) {
        launch(args);
    }
	
	public void start(Stage primaryStage){
		GridPane gridPane = new GridPane();
		
		Label prima = new Label("uno");
		Label seconda = new Label("due");
		Label terza = new Label("tre");
		Label quarta = new Label("quattro");
		
		
		linkedList.add(prima);
		linkedList.add(seconda);
		linkedList.add(terza);
		linkedList.add(quarta);
		
		System.out.println(linkedList.size());
		
		Button più = new Button("+");
		più.setPrefSize(30, 30);
		gridPane.add(più, 0, 0);
		Button meno = new Button("-");
		meno.setPrefSize(30, 30);
		gridPane.add(meno, 1, 0);
		
		più.setOnAction(event -> {
            
			currentIndex = currentIndex+1;
			if(currentIndex <= linkedList.size()){
				System.out.println(linkedList.get(currentIndex));
				gridPane.addRow(2, linkedList.get(currentIndex));
				//gridPane.add(linkedList.get(currentIndex), 2, 0);
				
           }
           else{
        	   System.out.println("Lista finita");
           }
			//più.setDisable(true);
        });

		
		
		
		Scene scene = new Scene(gridPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("CIAO");
		primaryStage.show();
		
	}

}
