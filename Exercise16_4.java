package application;

//Benjamin Holman, Student ID 2371353

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;


	///extend the application
	public class Exercise16_4 extends Application{
		
		///Create a CONSTANT for the kilometer to mile amount, just google whatever number this is...
		final double KILOMETER_TO_MILE = 1.609344;
		
		//make the actual text fields where the user will input the data. this is from chap 15 textfields
		TextField TextFieldMile = new TextField();
		TextField TextFieldKilometer = new TextField();

		/// Override to start the main section
	@Override
	public void start(Stage primaryStage) {
	

		/// make the actual Pane with a grid in it for the alignment of the textfields
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		//add the mile section to pane
		pane.add(new Label("Mile"), 0, 0);
		pane.add(TextFieldMile, 1, 0);
		///add kilometer section to pane
		pane.add(new Label("Kilometer"), 0, 1);
		pane.add(TextFieldKilometer, 1, 1);
		

		//Make two if statements. The first will be if mile is filled in, the second will be if kilometer is filled in by the user.
		///the two if statements will each contain the equation to convert kilometer to mile and visaversa.
		///this is also where I will make the action prompt be pressing "enter" on the keyboard.
		TextFieldMile.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				double miles = Double.parseDouble(TextFieldMile.getText());
				TextFieldKilometer.setText(String.valueOf(miles * KILOMETER_TO_MILE));}
				});

		TextFieldKilometer.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				double kilometers = Double.parseDouble(TextFieldKilometer.getText());
				TextFieldMile.setText(String.valueOf(kilometers / KILOMETER_TO_MILE));}
				});

		// now just put it altogether for the big stage!!!
		Scene scene = new Scene(pane, 300, 150);
		primaryStage.setTitle("Exercise16_4"); 
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
}


