module com.example.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;


    opens com.example.demo3 to javafx.fxml;
    exports com.example.demo3;
}