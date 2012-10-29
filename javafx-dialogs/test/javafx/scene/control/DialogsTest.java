package javafx.scene.control;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.control.Dialogs.DialogOptions;
import javafx.scene.control.Dialogs.DialogResponse;
import javafx.stage.Stage;

/**
 * Just some simple tests. I didn't want to use a testing framework for this.
 * 
 * @author Marco Jakob
 */
public class DialogsTest extends Application {

	@Override
	public void start(Stage primaryStage) {
		showInformationDialog(primaryStage);
		showWarningDialog(primaryStage);
		showErrorDialog(primaryStage);
		showErrorDialogWithException(primaryStage);
		showConfirmDialog(primaryStage);
		showConfirmDialogWithOptions(primaryStage);
		showInputDialog(primaryStage);
		showInputDialogWithChoices(primaryStage);
	}
	
	private void showInformationDialog(Stage stage) {
		Dialogs.showInformationDialog(stage, "I have a great message for you!", "Information Dialog", "title");
	}
	
	private void showWarningDialog(Stage stage) {
		Dialogs.showWarningDialog(stage, "Careful with the next step!", "Warning Dialog", "title");
	}
	
	private void showErrorDialog(Stage stage) {
		Dialogs.showErrorDialog(stage, "Ooops, there was an error!", "Error Dialog", "title");
	}

	private void showErrorDialogWithException(Stage stage) {
		Dialogs.showErrorDialog(stage, "Ooops, there was an error!", "Error Dialog With Exception", "title", 
				new FileNotFoundException("Could not find file blabla.txt"));
	}
	
	private void showConfirmDialog(Stage stage) {
		DialogResponse response = Dialogs.showConfirmDialog(stage, "Do you want to continue?", "Confirm Dialog", "title");
		System.out.println("ConfirmDialog Response: " + response);
	}
	
	private void showConfirmDialogWithOptions(Stage stage) {
		DialogResponse response = Dialogs.showConfirmDialog(stage, "Are you ok with this?", 
				"Confirm Dialog With Options", "title", DialogOptions.OK_CANCEL);
		System.out.println("ConfirmDialog Response: " + response);
	}
	
	private void showInputDialog(Stage stage) {
		String input = Dialogs.showInputDialog(stage, "Please enter your name:", "Input Dialog", "title");
		System.out.println("InputDialog Result: " + input);
	}
	
	private void showInputDialogWithChoices(Stage stage) {
		List<String> choices = new ArrayList<>();
		choices.add("a");
		choices.add("b");
		choices.add("c");
		
		String input = Dialogs.showInputDialog(stage, "Choose your color:", "Input Dialog With Choices", "title", "b", choices);
		System.out.println("InputDialog Result: " + input);
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
