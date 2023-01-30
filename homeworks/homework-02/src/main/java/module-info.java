module com.example.homework_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homework_2 to javafx.fxml;
    exports com.example.homework_2;
}