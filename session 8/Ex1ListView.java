package session8;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import session6.Square;

import java.util.ArrayList;

public class Ex1ListView extends Application
{
    private ArrayList<Square> alSq;
    private ObservableList<Square> obSq;
    private ListView<Square> lvSq;
    private TextField tfLength;

    public void init()
    {
        alSq = new ArrayList<>();
        alSq.add(new Square(5));
        alSq.add(new Square(8));
        alSq.add(new Square(2));
        obSq = FXCollections.observableList(alSq);
    }
    public void start(Stage topView)
    {
        FlowPane fPane = new FlowPane();
        topView.setScene(new Scene(fPane));
        // Next, create ListView
        lvSq = new ListView<>(obSq);
        fPane.getChildren().add(lvSq);

        // selection
        lvSq.setOnMouseClicked(evt -> showSelected(evt));
        // add TextField and Button for creating new square
        // and add to the list
        tfLength = new TextField();
        Button addSq = new Button("Add to list");
        addSq.setOnAction(evt -> addToList(evt));
        VBox inputBox = new VBox();
        inputBox.getChildren().addAll(tfLength, addSq);
        fPane.getChildren().add(inputBox);

        // Finally, show the GUI
        topView.show();
    }

    private void showSelected(MouseEvent evt) {
        // handles any selection
        Square sq = lvSq.getSelectionModel().getSelectedItem();
        if (sq == null) {
            System.out.println("Nothing.");
        }
        else {
            System.out.println("Length is: " + sq.getLength());
            System.out.println("Length is: " + sq.getArea());
        }

    }

    private void addToList(ActionEvent evt) {
        double length = Double.parseDouble(tfLength.getText());
        Square sq = new Square(length);
        obSq.add(sq);

//        alSq.add(sq);
//        lvSq.refresh();

        // for checking
        for (Square s : alSq)
            System.out.println(s);

        System.out.println("Clicked");
    }

    public static void main(String[] argv)
    {
        launch(argv);
    }
}
