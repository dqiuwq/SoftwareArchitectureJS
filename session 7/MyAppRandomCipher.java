package sample;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;

public class MyAppRandomCipher extends Application
{
    private RandomCipher cipher;
    private TextField    tfMesg, tfEnc, tfDec;

    public void start(Stage topView)
    {
        cipher = new RandomCipher();
        createUI(topView);
        topView.show();
    }
    private void createUI(Stage topView)
    {
        GridPane gPane = new GridPane();
        gPane.setHgap(10);
        gPane.setVgap(10);
        Scene uiContainer = new Scene(gPane);
        topView.setScene(uiContainer);
        topView.setTitle("Simple Cipher");
        // Adding control
        Button newKey = new Button("New key");
        newKey.setOnAction(value -> changeKey(value));
        gPane.add(newKey, 1, 0); // Column index 1, Row index 0)

        tfMesg = new TextField();
        gPane.addRow(1, new Label("Message"), tfMesg);
        tfEnc = new TextField();
        tfEnc.setEditable(false);
        gPane.addRow(2, new Label("Encrypted"), tfEnc);
        tfDec = new TextField();
        tfDec.setEditable(false);
        gPane.addRow(3, new Label("Decrypted"), tfDec);
        // Button group
        Button enc = new Button("Encrypt");
        enc.setOnAction(value -> encrypt(value));
        Button dec = new Button("Decrypt");
        dec.setOnAction(value -> decrypt(value));
        HBox btnGroup = new HBox(10); // Spacing
        btnGroup.getChildren().addAll(enc, dec);

        gPane.add(btnGroup, 1, 4); // Last row 2nd column
    }
    private void changeKey(ActionEvent evt)
    {
        cipher.changeKey();
    }

    private void encrypt(ActionEvent evt)
    {
        String rs = cipher.encrypt(tfMesg.getText());
        tfEnc.setText(rs);
    }

    private void decrypt(ActionEvent evt)
    {
        String rs = cipher.decrypt(tfEnc.getText());
        tfDec.setText(rs);
    }
    public static void main(String[] argv)
    {
        launch(argv);
    }
}
