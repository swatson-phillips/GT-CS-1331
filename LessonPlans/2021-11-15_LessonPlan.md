# 1331 Day 29 - 11/15/21 Lesson Plan

# Announcements:
- Exam 3 scores posted, regrades due 11/20/21
- The remaining modules for the semester have been posted (only 7 lecture days remain after today including the review on the last day!!!)
- 11/22 lecture activity
---

# Topics: JavaFX review and UI Controls

---

# JavaFX Activity 11/22
- This will be a **50 minute timed JavaFX activity** where you are given a specification and you will have to implement and submit code code.
- To allow flexibility in travel arrangements, you do not have to be on campus to complete the activity. However, this activity will only be **available during your lecture time** but will be fully HonorLocked and remote.
- This will count as a homework grade. 
- You should know how to use various controls and implement ones you haven't used before by referencing the API and with what you've learned.
- You may not use SceneBuilder nor fxml files for styling
- It will be open book/internet/IDE but NO collaboration; we want to see what YOU can do!

# JavaFX Quick review so far...
## What do we know about the basics of JavaFX?
- Why JavaFX?
- Scene? Stage? Pane? Node?

## How do we control layout?

## What is event driven programming and how is it applied in JavaFX?

## What are the 3 Java constructs for implementing JavaFX Event handling?
- inner class, 
- inner anonymous classes and 
- lambda expressions (remember functional interfaces?)

## The `Event` class and `EventHandler<T extends Event> interface`

# UI Controls
## Labels
- Just a text label
- You can control font, direction, icon, etc…
- Font class
- FontDemo.java
## Buttons
- Just a “dumb” button
- `Button button1 = new Button("Hey");`
- `ButtonInPane.java`
- `ButtonDemo.java`
## CheckBox
- Either On or off
- fires `ActionEvent`
- The same event handler can be used for different checkboxes and the `isSelected` method can be used to determine which boxes are checked.
- select many of many
- `CheckBoxDemo.java`
## RadioButton
- 1 of many selection
- Create a `ToggleGroup` to manage the select 1 of many behavior
- Then for each radio button, add it to the toggle group using `btn.setToggleGroup(group)`
- `RadioButtonDemo.java`
## TextField
- One line text entry.
- Fires an `ActionEvent` when the enter key is pressed in the field
- To handle the event: `tf.setOnAction(e −> {...});`
- `TextFieldDemo.java`
## So many more...
- take a look in you book (chapter 16)
- be comfortable with referencing the API for information on controls you have not used before.
