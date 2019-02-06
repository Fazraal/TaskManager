package com.github.fazraal;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button createTesk;

    @FXML
    void initialize(){
        createTesk.setOnAction(event -> {
           // createTesk.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/github/fazraal/sample.fxml"));
            System.out.println(loader.getLocation());
            Parent root = null;
            try {
                loader.load();
            } catch (IOException e) {
                e.getMessage();
            }
            root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });
    }
}
