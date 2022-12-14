1.
public void drawPicture(GraphicsContext g, int width, int height){
    g.setFill(Color.WHITE);
    g.fillRect(0, 0, width, height);
    int X; 
    int Y; 
    int colorChoice; 
    int count;
    for (count = 0; count < 500; count++){
        X = (int)(width*Math.random());
        Y = (int)(height*Math.random());
        colorChoice = (int)(4*Math.random());
        switch (colorChoice) {
        case 0:
            g.setFill(Color.RED);
            break;
        case 1:
            g.setFill(Color.GREEN);
            break;
        case 2:
            g.setFill(Color.BLUE);
            break;
        case 3:
            g.setFill(Color.YELLOW);
            break;
        }

        g.fillOval( X - 50, Y - 50, 100, 100 );
        g.setStroke(Color.BLACK);
        g.strokeOval( X - 50, Y - 50, 100, 100 );
    }
}


2.
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class GUIDemo extends Application{
    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage stage){
        GridPane root = new GridPane();
        root.setHgap(8);
        root.setVgap(10);
        root.setPadding(new Insets(5,5,5,5));

        TextArea transcript = new TextArea();
        transcript.setEditable(false);
        transcript.setPrefRowCount(7);
        transcript.setPrefColumnCount(20);
        root.add(transcript, 2, 0, 1, 4);

        Label lab = new Label("Push Button:");
        root.add(lab, 0, 0);
        Button b = new Button("Click Me!");
        b.setOnAction( e -> transcript.appendText("Button was clicked\n\n") );
        root.add(b, 1, 0);

        lab = new Label("Checkbox:");
        root.add(lab, 0, 1);
        CheckBox c = new CheckBox("Click me!");
        c.setOnAction( e -> transcript.appendText("Checkbox was toggled\n\n") );
        root.add(c, 1, 1);

        lab = new Label("Text Field:");
        root.add(lab, 0, 2);
        TextField t = new TextField("Type here!");
        t.setPrefColumnCount(10);
        t.setOnAction( e -> transcript.appendText(
                              "Pressed return in TextField\nwith contents:  " + t.getText() + "\n\n") );
        root.add(t, 1, 2);

        lab = new Label("Pop-up Menu:");
        root.add(lab, 0, 3);
        ComboBox<String> combobox = new ComboBox<>();
        combobox.getItems().addAll("First Option", "Second Option", "Third Option", "Fourth Option");
        combobox.setValue("First Option");
        combobox.setOnAction( e -> transcript.appendText("Selected " + 
                                       combobox.getValue() + " from menu\n\n") );
        root.add(combobox, 1, 3);
        root.setStyle("-fx-border-width: 3px; -fx-border-color: darkblue");
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("GUIDemo");
        stage.show();
        stage.setResizable(false);
    }
}