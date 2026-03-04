//Brennan Cheatwood
// M11 Assignment CSD402
// 3/4/2026
// HBox & VBox Demos

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class JavaFXLayoutDemo extends Application {
    //launch runtime

    public static void main(String[] args) {
        launch(args);
    }

    //Building the window

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Layout Demo: HBox & VBox");

        // TabPane lets the user switch between HBox & VBox
        TabPane tabPane = new TabPane();

        Tab hboxTab = new Tab("HBox Demo", buildHBoxDemo());
        Tab vboxTab = new Tab("VBox Demo", buildVBoxDemo());

        // Prevent tabs from being closed by the user
        hboxTab.setClosable(false);
        vboxTab.setClosable(false);

        tabPane.getTabs().addAll(hboxTab, vboxTab);

        primaryStage.setScene(new Scene(tabPane, 550, 320));
        primaryStage.show();
    }

    //  HBOX DEMO
    // This code makes a music-player type thingy

    private VBox buildHBoxDemo() {

        // Outer wrapper so we can add a description label above the HBox
        VBox wrapper = new VBox(15);
        wrapper.setPadding(new Insets(20));
        wrapper.setAlignment(Pos.TOP_CENTER);

        // Description label
        Label desc = new Label("HBox: children arranged in a horizontal row");
        desc.setFont(Font.font("Arial", FontWeight.BOLD, 13));

        // --- The HBox control bar ---
        // Passing 10 to the constructor sets the spacing between children to 10px
        HBox controlBar = new HBox(10);
        controlBar.setAlignment(Pos.CENTER);           // center children vertically & horizontally
        controlBar.setPadding(new Insets(10, 15, 10, 15)); // top, right, bottom, left padding
        controlBar.setStyle("-fx-background-color: #DDEEFF; -fx-border-color: #99AABB; -fx-border-radius: 4;");

        // A label on the far left
        Label songLabel = new Label("Now Playing:");

        //Text field that will grow to fill remaining space
        TextField songField = new TextField("My Favorite Song.mp3");
        songField.setEditable(false);

        //Tell HBox to give any extra horizontal space to the text field
        HBox.setHgrow(songField, Priority.ALWAYS);
        songField.setMaxWidth(Double.MAX_VALUE); // allow it to actually expand

        // Control buttons
        Button playBtn  = new Button("▶  Play");
        Button stopBtn  = new Button("■  Stop");

        //add all children to the HBox in order (left to right)
        controlBar.getChildren().addAll(songLabel, songField, playBtn, stopBtn);

        // Button actions — update the text field to reflect the current state
        playBtn.setOnAction(e -> songField.setText("▶  Playing: My Favorite Song.mp3"));
        stopBtn.setOnAction(e -> songField.setText("My Favorite Song.mp3"));

        // Explanation label
        Label note = new Label("Try resizing the window — the text field grows with it (HBox.setHgrow).");
        note.setStyle("-fx-text-fill: #555555;");

        wrapper.getChildren().addAll(desc, controlBar, note);
        return wrapper;
    }

    //  VBOX DEMO

    //Builds a VBox demo styled as a vertical navigation sidebar.
    

    private HBox buildVBoxDemo() {

        // Outer wrapper: puts the VBox sidebar next to a content area side by side
        HBox wrapper = new HBox(15);
        wrapper.setPadding(new Insets(20));

        //The VBox navigation sidebar
        // Passing 8 to the constructor sets the vertical gap between children to 8px
        VBox navSidebar = new VBox(8);
        navSidebar.setPadding(new Insets(12));
        navSidebar.setStyle("-fx-background-color: #2C3E50; -fx-background-radius: 6;");
        navSidebar.setPrefWidth(160);

        // setFillWidth(true) makes all resizable children expand to the VBox width
        // This is actually the default, but shown here for clarity
        navSidebar.setFillWidth(true);

        // Title label at the top of the sidebar
        Label navTitle = new Label("Navigation");
        navTitle.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        navTitle.setStyle("-fx-text-fill: #AABBCC;");

        // Add extra space below the title using VBox.setMargin()
        VBox.setMargin(navTitle, new Insets(0, 0, 6, 0)); // bottom margin of 6px

        // Navigation buttons — setMaxWidth ensures they fill the VBox width
        Button homeBtn     = createNavButton("Home");
        Button profileBtn  = createNavButton("Profile");
        Button messagesBtn = createNavButton("Messages");
        Button settingsBtn = createNavButton("Settings");

        navSidebar.getChildren().addAll(navTitle, homeBtn, profileBtn, messagesBtn, settingsBtn);

        // --- Content area to the right of the sidebar ---
        Label contentLabel = new Label("Content area\n\nClick a nav button\nto update this area.");
        contentLabel.setStyle("-fx-text-fill: #333333;");
        contentLabel.setPadding(new Insets(12));

        VBox contentArea = new VBox(contentLabel);
        contentArea.setStyle("-fx-background-color: #F4F6F7; -fx-border-color: #CCCCCC; -fx-border-radius: 4;");
        HBox.setHgrow(contentArea, Priority.ALWAYS);
        contentArea.setAlignment(Pos.TOP_LEFT);

        // Button click handlers — update the content area label
        homeBtn.setOnAction(e     -> contentLabel.setText("Home\n\nWelcome to the home page!"));
        profileBtn.setOnAction(e  -> contentLabel.setText("Profile\n\nUser: Guest\nStatus: Active"));
        messagesBtn.setOnAction(e -> contentLabel.setText("Messages\n\nNo new messages."));
        settingsBtn.setOnAction(e -> contentLabel.setText("Settings\n\nAdjust your preferences here."));

        wrapper.getChildren().addAll(navSidebar, contentArea);
        return wrapper;
    }

    private Button createNavButton(String text) {
        Button btn = new Button(text);
        btn.setMaxWidth(Double.MAX_VALUE);  // allow VBox to stretch this button horizontally
        btn.setAlignment(Pos.CENTER_LEFT);
        btn.setStyle("-fx-background-color: #34495E; -fx-text-fill: white; "
                   + "-fx-border-radius: 3; -fx-background-radius: 3;");
        return btn;
    }
}