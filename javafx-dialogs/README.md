# JavaFX Dialogs Readme #

JavaFX Dialogs is based on revision [rt-9e5ef340d95f](http://hg.openjdk.java.net/openjfx/sandbox-8/controls/rt/rev/9e5ef340d95f) of the official Open JFX Sandbox Dialogs.

The following changes were made to Dialogs.java:
* Use of a separate css file
* Fixed bug: Input dialog did only return String from text box if enter was used. Buttons 
	did not work.
* Fixed bug: Input dialog with input choices did not return the initially selected object
	if the combo box was not changed by the user.
  

---
Marco Jakob (http://edu.makery.ch)