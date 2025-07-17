package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class BinaryVoteSystemController {

        @FXML
        private StackPane BinaryVoteSystemLayout;

        @FXML
        private Pane BinaryVoteSystemView;

        @FXML
        private void initialize() {
            setBinaryVoteSystemController();
        }

        public void setBinaryVoteSystemController() {
            BinaryVoteSystemLayout.setPrefWidth(Screen.SCREENWIDTH);
            BinaryVoteSystemLayout.setPrefHeight(Screen.SCREENHEIGHT);
            BinaryVoteSystemView.scaleXProperty().bind(BinaryVoteSystemLayout.widthProperty().divide(1600));
            BinaryVoteSystemView.scaleYProperty().bind(BinaryVoteSystemLayout.heightProperty().divide(900));
        }

    public void back(ActionEvent actionEvent) throws IOException {
            SceneManager.switchScene("ElectionType.fxml");
    }


    public void confirm(ActionEvent actionEvent) throws IOException {
            SceneManager.switchScene("AdminDashboard.fxml");
    }
}


