module cl.duoc.registropersonas {
    requires javafx.controls;
    requires javafx.fxml;



    opens cl.duoc.registropersonas to javafx.fxml;
    exports cl.duoc.registropersonas;
    opens cl.duoc.registropersonas.controller to javafx.fxml;
    exports cl.duoc.registropersonas.controller;
    //IMPORTANTE AGREGAR ESTO//
    opens cl.duoc.registropersonas.model to javafx.base;
    exports cl.duoc.registropersonas.model;
}