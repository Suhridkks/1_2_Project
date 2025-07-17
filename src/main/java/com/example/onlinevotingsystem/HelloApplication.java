package com.example.onlinevotingsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneManager.setStage(stage);
        SceneManager.switchScene("hello-view.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}