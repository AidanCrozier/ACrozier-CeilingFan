module com.example.acrozierceilingfan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.acrozierceilingfan to javafx.fxml;
    exports com.example.acrozierceilingfan;
}