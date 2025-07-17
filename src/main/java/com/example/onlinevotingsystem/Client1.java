package com.example.onlinevotingsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client1 extends Application {
        @Override

        public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(com.example.onlinevotingsystem.HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
            SceneManager.setStage(stage);
        }

        public static void main(String[] args) {
            launch();
        }
}

