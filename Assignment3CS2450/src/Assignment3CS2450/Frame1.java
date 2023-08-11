package Assignment3CS2450;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

	public class Frame1 extends Application {
		public static void main(String[] args) {
			launch();
		}
	
    @Override
    public void start(Stage primaryStage) throws Exception {
    	// Stage title
    	primaryStage.setTitle("Customer");
    	
    	// Set the window
    	primaryStage.show();
    	
    	// GridPane for organization
        GridPane grid = new GridPane();
        
        // Labels for text boxes
        Label label1 = new Label("Name (*)");
        Label label2 = new Label("Phone");
        Label label3 = new Label("Gender (*)"); 
       	Label label4 = new Label("Email (*)");
        Label label5 = new Label("Street (*)");
        Label label6 = new Label("City (*)");
        Label label7 = new Label("State (*)");
        Label label8 = new Label("Zip Code (*)");
        Label label9 = new Label("Address");
        
        
        // Text fields
        TextField txtfield1 = new TextField();
        TextField txtfield2 = new TextField();
        TextField txtfield3 = new TextField();
        TextField txtfield4 = new TextField();
        TextField txtfield5 = new TextField();
        TextField txtfield6 = new TextField();
        TextField txtfield7 = new TextField();
        
        // Create RadioButtons
        RadioButton radio1 = new RadioButton("Male");
        RadioButton radio2 = new RadioButton("Female");
        RadioButton radio3 = new RadioButton("Other");

        // Create ToggleGroup
        ToggleGroup radioGroup = new ToggleGroup();

        // Add the RadioButtons to the ToggleGroup
        radio1.setToggleGroup(radioGroup);
        radio2.setToggleGroup(radioGroup);
        radio3.setToggleGroup(radioGroup);
        
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
        
        // NAME
        grid.add(label1, 0, 0);
        grid.add(txtfield1, 1, 0);
        
        // PHONE
        grid.add(label2, 0, 5);
        grid.add(txtfield2, 1, 5);
        
       // RADIOBUTTONS GENDER
        grid.add(label3, 3, 0);
        grid.add(radio1, 4, 0);
        grid.add(radio2, 5, 0);
        grid.add(radio3, 6, 0); 
        
        // EMAIL
        grid.add(label4, 3, 5); 
        grid.add(txtfield3, 4, 5);
        
        // STREET
        grid.add(label5, 0, 23); 
        grid.add(txtfield4, 1, 23);
        
        // CITY
        grid.add(label6, 3, 23); 
        grid.add(txtfield5, 4,23);
        
        // STATE
        grid.add(label7, 0, 33); 
        grid.add(txtfield6, 1, 33);
        
        // ZIPCODE
        grid.add(label8, 3, 33); 
        grid.add(txtfield7, 4, 33);
        
        // ADDRESS
        grid.add(label9, 0, 15);
        
        // BUTTONS
        grid.add(buttons, 4, 43);
        
        // Setting size of scene
        Scene scene = new Scene(grid, 370, 170);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
		
