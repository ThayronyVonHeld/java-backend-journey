module cursoemvideo.javafxinterface {
    requires javafx.controls;
    requires javafx.fxml;

    opens cursoemvideo.javafxinterface to javafx.fxml;
    exports cursoemvideo.javafxinterface;
}
