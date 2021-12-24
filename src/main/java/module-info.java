module com.oilab.gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oilab.gui to javafx.fxml;
    exports com.oilab.gui;
}