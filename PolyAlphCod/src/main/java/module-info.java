module com.example.polyalphcod {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.polyalphcod to javafx.fxml;
    exports com.example.polyalphcod;
}