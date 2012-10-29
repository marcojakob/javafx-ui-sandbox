package ch.makery.javafx.dialog;

import java.util.ArrayList;
import java.util.List;

import ch.makery.javafx.dialog.Dialogs;
import ch.makery.javafx.dialog.Dialogs.DialogResponse;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Just some simple system.out tests. I didn't want to use a testing framework for this.
 * 
 * @author Marco Jakob
 */
public class DialogsTest extends Application {

	@Override
	public void start(Stage primaryStage) {
		List<String> choices = new ArrayList<>();
		choices.add(null);
		choices.add("a");
		choices.add("b");
		choices.add("c");
		
		String chosen = Dialogs.showInputDialog(primaryStage, "message", "masterhead", "title");
		System.out.println(chosen);
//		
//		String chosen2 = Dialogs.showInputDialog(primaryStage, "message", "masterhead", "title", "initialValue");
//		System.out.println(chosen2);
//		
//		String chosen3 = Dialogs.showInputDialog(primaryStage, "message", "masterhead", "title", null, choices);
//		System.out.println(chosen3);
//		
//		DialogResponse response = Dialogs.showConfirmDialog(primaryStage, "A message");
//		System.out.println(response);
		
		Dialogs.showErrorDialog(primaryStage, "an error");
		Dialogs.showWarningDialog(primaryStage, "a warning");
		Dialogs.showInformationDialog(primaryStage, "an information");
		
		DialogResponse response = Dialogs.showConfirmDialog(primaryStage, "a confirmation");
		System.out.println("Confirmation Response: " + response);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
