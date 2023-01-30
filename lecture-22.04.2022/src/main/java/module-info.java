module com.example.lecture_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lecture_1 to javafx.fxml;
    exports com.example.lecture_1;
}