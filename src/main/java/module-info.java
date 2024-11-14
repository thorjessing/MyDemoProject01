module dk.easv.mydemoproject01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.mydemoproject01 to javafx.fxml;
    exports dk.easv.mydemoproject01;
}