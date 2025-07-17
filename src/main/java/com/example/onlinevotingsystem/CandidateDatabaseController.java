package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class CandidateDatabaseController {

    @FXML
    private StackPane CandidateDatabaseLayout;

    @FXML
    private Pane CandidateDatabaseView;

    @FXML
    private void initialize() {
        setCandidateDatabaseController();
    }

    public void setCandidateDatabaseController() {
        CandidateDatabaseLayout.setPrefWidth(Screen.SCREENWIDTH);
        CandidateDatabaseLayout.setPrefHeight(Screen.SCREENHEIGHT);
        CandidateDatabaseView.scaleXProperty().bind(CandidateDatabaseLayout.widthProperty().divide(1600));
        CandidateDatabaseView.scaleYProperty().bind(CandidateDatabaseLayout.heightProperty().divide(900));
    }

    public void addCandidate(ActionEvent actionEvent) throws IOException {
        System.out.println("Add clicked");
        SceneManager.switchScene("AddCandidate.fxml");
    }

    public void back(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("AdminDashboard.fxml");
    }

    public void removeCandidate(ActionEvent actionEvent) {
        System.out.println("Remove clicked");
    }

    public void update(ActionEvent actionEvent) throws IOException {
        System.out.println("Update clicked");
    }

    public void next(ActionEvent actionEvent) {
        System.out.println("next clicked");
    }
}
