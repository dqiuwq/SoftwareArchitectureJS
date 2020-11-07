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

public class Ex3TreeViewSquare extends Application {
    public void start(Stage topView) {
        TreeView<String> sqTree = createTree();
        FlowPane fPane = new FlowPane();
        fPane.getChildren().add(sqTree);
        topView.setScene(new Scene(fPane));
        topView.setTitle("Tree View of Square");
        topView.show();
    }

    private void showSelected(Event evt) {
        TreeView<String> sqTree = (TreeView<String>) evt.getSource();
        TreeItem<String> selectedItem =
                sqTree.getSelectionModel().getSelectedItem();
        if (selectedItem == null) {
            System.out.println("Nothing is selected");
        } else {
            System.out.println(selectedItem.getValue());
        }
    }

    private TreeView<String> createTree() {
        ArrayList<Square> data = getSample();
        TreeView<String> sqTree = new TreeView<>();
        TreeItem<String> root = new TreeItem<>("All Squares");
        sqTree.setRoot(root);
        sqTree.setOnMouseClicked(evt -> showSelected(evt));
        // Add one TreeItem for each Square instance
        for (Square s : data) {
            TreeItem<String> oneTreeItem = createItem(s);
            root.getChildren().add(oneTreeItem);
        }
        return sqTree;
    }

    private TreeItem<String> createItem(Square sq) {
        TreeItem<String> itemRoot =
                new TreeItem<>("Instance ID: " + sq.hashCode());
        TreeItem<String> sqLength =
                new TreeItem<>("Length: " + sq.getLength());
        TreeItem<String> sqArea =
                new TreeItem<>("Area: " + sq.getArea());
        TreeItem<String> sqPerimeter =
                new TreeItem<>("Perimeter: " + (sq.getLength() * 4));
        itemRoot.getChildren().addAll(sqLength, sqArea, sqPerimeter);

        return itemRoot;
    }

    private ArrayList<Square> getSample() {
        ArrayList<Square> dummyData = new ArrayList<>();
        dummyData.add(new Square(1));
        dummyData.add(new Square(2));
        dummyData.add(new Square(3));
        return dummyData;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
