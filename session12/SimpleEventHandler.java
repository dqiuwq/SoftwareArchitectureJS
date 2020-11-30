package session12;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SimpleEventHandler extends Application {
    public void start(Stage mainStage) {
        // option 1
        Button simpleBtn1 = new Button("Button 1");
        EventHandler<MouseEvent> eventHandler =
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        System.out.println("You clicked the mouse");
                    }
                };
        simpleBtn1.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

        // option 2 lambda expression
        Button simpleBtn2 = new Button("Button 2");
        simpleBtn2.setOnMouseClicked(event -> eventHandler(event));
    }

    public void eventHandler(MouseEvent mouseEvent) {
        System.out.println("You clicked the mouse");
    }
}
