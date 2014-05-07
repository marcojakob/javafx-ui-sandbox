## JavaFX Dialogs ##

---
**Note:** If you are using JavaFX 8 you may want to check out the [JavaFX 8 Dialogs blog post](http://code.makery.ch/blog/javafx-8-dialogs/) which explains how to use the great [ControlsFX](http://fxexperience.com/controlsfx/) dialogs!

---

JavaFX Dialogs are simple dialogs in the style of [JOptionPane](http://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html) from Swing.

![JavaFX Screenshots](https://raw.github.com/marcojakob/javafx-ui-sandbox/master/img/javafx-dialogs-screenshots.png)
*Image Source: http://fxexperience.com/2012/10/announcing-the-javafx-ui-controls-sandbox/*

### Usage ###
For examples of how to use them see this [JavaFX 2 Dialog blog post](http://code.makery.ch/blog/javafx-2-dialogs/).

### Download Jar ###

* [Browse all versions](https://github.com/marcojakob/javafx-ui-sandbox/tree/master/javafx-dialogs/dist)
* [Download newest version](https://github.com/marcojakob/javafx-ui-sandbox/raw/master/javafx-dialogs/dist/javafx-dialogs-0.0.3.jar)

### Changes ###

#### JavaFX Dialogs 0.0.3 ####
* Enhancement: Custom Dialogs [Issue #1](https://github.com/marcojakob/javafx-ui-sandbox/issues/1)

#### JavaFX Dialogs 0.0.2 ####
* Fixed bug: Images fail to load when running in webstart. https://github.com/marcojakob/javafx-ui-sandbox/issues/2 

#### JavaFX Dialogs 0.0.1 ####
JavaFX Dialogs is based on revision [rt-9e5ef340d95f](http://hg.openjdk.java.net/openjfx/sandbox-8/controls/rt/rev/9e5ef340d95f) of the official Open JFX Sandbox Dialogs.
The following changes were made to Dialogs.java:
* Use of a separate css file
* Fixed bug: Input dialog did only return String from text box if enter was used. Buttons 
	did not work.
* Fixed bug: Input dialog with input choices did not return the initially selected object
	if the combo box was not changed by the user.
* Fixed bug: Message was not displayed in error dialogs.
* Using binding for user input response.

---
Marco Jakob (http://edu.makery.ch)

