module com.example.bellzroyalezlaundry {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bellzroyalezlaundry to javafx.fxml;
    exports com.example.bellzroyalezlaundry;
}