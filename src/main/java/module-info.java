module co.edu.uniquindio.escuelademusica {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.escuelademusica to javafx.fxml;
    exports co.edu.uniquindio.escuelademusica;
}