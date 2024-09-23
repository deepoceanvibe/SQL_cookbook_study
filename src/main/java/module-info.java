module com.example.sql_cookbook {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sql_cookbook to javafx.fxml;
    exports com.example.sql_cookbook;
}