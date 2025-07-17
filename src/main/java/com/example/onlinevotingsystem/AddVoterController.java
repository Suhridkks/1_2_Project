package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class AddVoterController {
    @FXML
    private StackPane AddVoterLayout;

    @FXML
    private Pane AddVoterView;

    @FXML
    private void initialize() {
        setAddVoterController();
    }

    public void setAddVoterController() {
        AddVoterLayout.setPrefWidth(Screen.SCREENWIDTH);
        AddVoterLayout.setPrefHeight(Screen.SCREENHEIGHT);
        AddVoterView.scaleXProperty().bind(AddVoterLayout.widthProperty().divide(1600));
        AddVoterView.scaleYProperty().bind(AddVoterLayout.heightProperty().divide(900));
    }

    public void back(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("VotersDatabase.fxml");
    }

    public void apply(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("VotersDatabase.fxml");
    }
}
