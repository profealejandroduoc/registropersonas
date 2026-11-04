module cl.duoc.registropersonas {
    requires javafx.controls;
    requires javafx.fxml;


    opens cl.duoc.registropersonas to javafx.fxml;
    exports cl.duoc.registropersonas;
    exports cl.duoc.registropersonas.controller;
    opens cl.duoc.registropersonas.controller to javafx.fxml;
}