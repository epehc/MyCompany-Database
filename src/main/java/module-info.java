module com.github.epehc.proreclutamiento {
    requires javafx.controls;
    requires javafx.fxml;


    requires com.google.api.client.auth;
    requires com.google.api.client.extensions.java6.auth;
    requires com.google.api.client.extensions.jetty.auth;
    requires google.api.client;
    requires com.google.api.client;
    requires com.google.api.client.json.gson;
    requires com.google.api.services.sheets;
    requires com.google.gson;
    requires jdk.httpserver;
    requires java.sql;
    //requires google.api.services.sheets.v4.rev516;


    opens com.github.epehc.proreclutamiento to javafx.fxml;
    exports com.github.epehc.proreclutamiento;
    exports com.github.epehc.proreclutamiento.informaciones;
    opens com.github.epehc.proreclutamiento.informaciones to javafx.fxml;
    exports com.github.epehc.proreclutamiento.google;
    opens com.github.epehc.proreclutamiento.google to javafx.fxml;
    exports com.github.epehc.proreclutamiento.controllers;
    opens com.github.epehc.proreclutamiento.controllers to javafx.fxml;
}