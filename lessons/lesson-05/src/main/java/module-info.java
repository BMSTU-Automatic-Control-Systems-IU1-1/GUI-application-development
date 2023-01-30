module com.example.lesson_5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson_5 to javafx.fxml;
    exports com.example.lesson_5;
}