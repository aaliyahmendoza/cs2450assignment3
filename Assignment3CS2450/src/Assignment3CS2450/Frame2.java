package Assignment3CS2450;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

	public class Frame2 extends Application {
		public static void main(String[] args) {
			launch();
		}
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	// Stage title
    	primaryStage.setTitle("Order");
    	
    	// Set the window
    	primaryStage.show();
    	
    	// GridPane for organization
        GridPane grid = new GridPane();
        
        // Labels for text boxes
        Label label1 = new Label("Number (*)");
        Label label2 = new Label("Item (*)");
        Label label3 = new Label("Date (*)"); 
       	Label label4 = new Label("Price (*)");
        Label label5 = new Label("Customer");
        Label label6 = new Label("Orders");
        
        
        // Text fields
        TextField txtfield1 = new TextField();
        TextField txtfield2 = new TextField();
        TextField txtfield3 = new TextField();
        TextField txtfield4 = new TextField();
        TextField txtfield5 = new TextField();
       
     
        // Buttons
        Button button1 = new Button("Search");
        Button button2 = new Button("Add");
        Button button3 = new Button("Update");
        Button button4 = new Button("Delete");
        
        // HBox for buttons, horizontal row
        HBox buttons = new HBox(5, button1, button2, button3, button4);

        // Position
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(5);
        
        // NUMBER
        grid.add(label1, 0, 0);
        grid.add(txtfield1, 1, 0);
        
        // ITEM
        grid.add(label2, 0, 15);
        grid.add(txtfield2, 1, 15);
        
       // DATE
        grid.add(label3, 3, 0);
        grid.add(txtfield3, 4, 0);
        
        
        // PRICE
        grid.add(label4, 3, 15); 
        grid.add(txtfield4, 4, 15);
        
        // CUSTOMER
        grid.add(label5, 0, 5); 
        grid.add(txtfield5, 1, 5);
        
        // OREDERS
        grid.add(label6, 0, 23);
        
        // BUTTONS
        grid.add(buttons, 4, 43);
        
        // Setting size of scene
        Scene scene = new Scene(grid, 370, 170);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
		
