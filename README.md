# JavaFX UI Sandbox #
Oracle has opened up the [JavaFX UI Sandbox repository](http://hg.openjdk.java.net/openjfx/sandbox-8/controls/rt) on OpenJFX as announced on the [fxExperience blog](http://fxexperience.com/2012/10/announcing-the-javafx-ui-controls-sandbox/). 
Controls in the OpenJFX repository might eventually be included in a next JavaFX release.

This GitHub project provides **simple `jar` files** for some of those sandbox controls.

## JavaFX Dialogs ##
JavaFX Dialogs are simple dialogs in the style of [JOptionPane](http://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html) from Swing.

### Usage ###
For examples of how to use them see this blog post.

### Download ###
[JavaFX Dialogs 0.1.1](https://github.com/downloads/marcojakob/javafx-ui-sandbox/makery-javafx-dialogs-0.0.1.jar)

### Changes ###

#### JavaFX Dialogs 0.0.1 ####
JavaFX Dialogs is based on revision [rt-9e5ef340d95f](http://hg.openjdk.java.net/openjfx/sandbox-8/controls/rt/rev/9e5ef340d95f) of the official Open JFX Sandbox Dialogs.
The following changes were made to Dialogs.java:
* Use of a separate css file
* Fixed bug: Input dialog did only return String from text box if enter was used. Buttons 
	did not work.
* Fixed bug: Input dialog with input choices did not return the initially selected object
	if the combo box was not changed by the user.