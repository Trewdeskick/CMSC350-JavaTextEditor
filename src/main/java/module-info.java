module com.example.opltexteditor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.opltexteditor to javafx.fxml;
    exports com.example.opltexteditor;
}