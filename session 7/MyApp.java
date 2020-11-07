package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;  // text button etc
import javafx.scene.layout.*;   // the layout
import javafx.event.ActionEvent;
import javafx.geometry.Orientation;

public class MyApp extends Application{

    private RadioButton member, nonMember;
    private CheckBox[] addons;

    /**
     * Needed to overwrite the abstract method
     * @param topView
     */
    public void start(Stage topView) {
        topView.setTitle("My Application");

        // flowpane and scene
        FlowPane fpane = new FlowPane(10, 10);
        fpane.setOrientation(Orientation.VERTICAL);
        Scene uiContainer = new Scene(fpane);
        topView.setScene(uiContainer);

        // add gui components
        fpane.getChildren().add(new Label("JavaFX Label")); // ObservableList = ArrayList

        // textfield and event handler
        TextField tf = new TextField();
        fpane.getChildren().add(tf);
        //tf.addEventHandler(); << old version
        tf.setOnAction(evtInstance -> echo(evtInstance));

        // radio button
        ToggleGroup memberGroup = new ToggleGroup();
        member = new RadioButton("Member");
        member.setSelected(true);
        member.setToggleGroup(memberGroup);
        nonMember = new RadioButton("Non Member");
        nonMember.setSelected(true);
        nonMember.setToggleGroup(memberGroup);
        HBox memberBox = new HBox((10)); // horizontal box
        memberBox.getChildren().addAll(member, nonMember);
        fpane.getChildren().add(memberBox);

        // checkbox
        addons = new CheckBox[3];
        addons[0] = new CheckBox("Max RAM");
        addons[1] = new CheckBox("Extra Battery");
        addons[2] = new CheckBox("Extended Warrenty");
        VBox optionBox = new VBox(10); // vertical box
        for (CheckBox cb : addons) {
            optionBox.getChildren().add(cb);
        }
        fpane.getChildren().add(optionBox);

        // button
        Button submitBtn = new Button("Submit");
        submitBtn.setOnAction(evtInstance -> doSubmit(evtInstance));

        fpane.getChildren().add(submitBtn);

        // show the gui
        topView.show();
    }

    private void echo(ActionEvent evtInfo) {
        TextField tf = (TextField) evtInfo.getSource();
        String value = ((TextField) evtInfo.getSource()).getText();
        System.out.println("You entered " + tf.getText());
        System.out.println("Another way " + value);
    }

    private void doSubmit(ActionEvent evtInfo) {
        System.out.println("Button clicked");

        String summary = "";
        if (member.isSelected())
            summary += "Member is ticked\n";
        else if (nonMember.isSelected())
            summary += "Non member is ticked\n";

        for (CheckBox opt : addons) {
            if (opt.isSelected())
                summary += opt.getText() + "\n";
        }
        System.out.println(summary);
    }

    public static void main (String[] args) {
        launch(args); // >> Controller >> init >> start
    }
}
