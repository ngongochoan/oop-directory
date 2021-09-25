module mydirectory.directory {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens mydirectory.directory to javafx.fxml;
    exports mydirectory.directory;
}