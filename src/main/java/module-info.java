module cl.duoc.registropersonas {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens cl.duoc.registropersonas to javafx.fxml;
    exports cl.duoc.registropersonas;
    opens cl.duoc.registropersonas.controller to javafx.fxml;
    exports cl.duoc.registropersonas.controller;
    //IMPORTANTE AGREGAR ESTO//
    opens cl.duoc.registropersonas.model to javafx.base, com.google.gson;
    exports cl.duoc.registropersonas.model;
}