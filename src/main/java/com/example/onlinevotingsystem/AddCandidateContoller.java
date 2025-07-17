package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class AddCandidateContoller {
    @FXML
    private StackPane AddCandidateLayout;
//this is a test change
    @FXML
    private Pane AddCandidateView;

    @FXML
    private void initialize() {
        setAddCandidateController();
    }

    public void setAddCandidateController() {
        AddCandidateLayout.setPrefWidth(Screen.SCREENWIDTH);
        AddCandidateLayout.setPrefHeight(Screen.SCREENHEIGHT);
        AddCandidateView.scaleXProperty().bind(AddCandidateLayout.widthProperty().divide(1600));
        AddCandidateView.scaleYProperty().bind(AddCandidateLayout.heightProperty().divide(900));
    }


    public void back(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("CandidateDatabase.fxml");
    }

    public void apply(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("CandidateDatabase.fxml");
    }
}
