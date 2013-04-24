package javafx.scene.control;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Dialogs.DialogOptions;
import javafx.scene.control.Dialogs.DialogResponse;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Callback;

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
		showCustomDialog(primaryStage);
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
	
	private class Credentials {
		private String username; private String password;
		public Credentials(String username, String password) {
			this.username = username; this.password = password;
		}
		@Override
		public String toString() {
			return "Credentials(" + username + "/" + password + ")";
		}
	}
	private Credentials credentials;
	
	private void showCustomDialog(Stage stage) {
		GridPane grid = new GridPane();
		grid.setHgap(10);
	    grid.setVgap(10);
	    grid.setPadding(new Insets(0, 10, 0, 10));
		final TextField username = new TextField(); username.setPromptText("Username");
		final PasswordField password = new PasswordField(); password.setPromptText("Password");

		grid.add(new Label("Username:"), 0, 0);
		grid.add(username, 1, 0);
		grid.add(new Label("Password:"), 0, 1);
		grid.add(password, 1, 1);
		Callback<Void, Void> myCallback = new Callback<Void, Void>() {
			@Override
			public Void call(Void param) {
				credentials = new Credentials(username.getText(), password.getText());
				return null;
			}
		};
				
		DialogResponse resp = Dialogs.showCustomDialog(stage, grid, "Please log in", "Login", DialogOptions.OK_CANCEL, myCallback);
		System.out.println("Custom Dialog: User clicked: " + resp);
		//You must check the resp, since input fields' texts are returned regardless of what button was pressed. (ie. If user clicked 'Cancel' disregard the input) 
		System.out.println("Custom Dialog: Field 'credentials' set from custom dialog: " + credentials);
	}

	public static void main(String[] args) {
		launch(args);
	}
}