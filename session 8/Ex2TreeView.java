package session8;

import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.collections.*;

public class Ex2TreeView extends Application {
    public void start(Stage topView) {
        TreeView<String> ITprogram = createTree();
        FlowPane fPane = new FlowPane();
        fPane.getChildren().add(ITprogram);
        topView.setScene(new Scene(fPane));
        topView.setTitle("Tree View Example");
        topView.show();
    }

    private TreeView<String> createTree() {
        TreeView<String> ITprogram = new TreeView<>();
        // root of the tree
        TreeItem<String> root = new TreeItem<>("IT School");
        root.setExpanded(true);
        ITprogram.setRoot(root);
        // Add more nodes to the root
        TreeItem<String> BIT = new TreeItem<>("Bsc IT");
        TreeItem<String> BCS = new TreeItem<>("Bsc CS");
        TreeItem<String> BBI = new TreeItem<>("Bsc BI");
        // Add to the root
        root.getChildren().add(BIT);
        root.getChildren().add(BCS);
        root.getChildren().add(BBI);
        // root.getChildren().addAll(BIT,BCS,BBI);
        // Add subtree
        BIT.getChildren().add(new TreeItem<>("Computer Science"));
        BIT.getChildren().add(new TreeItem<>("3-Year Programe"));
        BIT.getChildren().add(new TreeItem<>("Double Major Available"));
        return ITprogram;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
