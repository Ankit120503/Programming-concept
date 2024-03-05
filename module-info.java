module com.example.ankitkumar {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.ankitkumar to javafx.fxml;
    exports com.example.ankitkumar;
}