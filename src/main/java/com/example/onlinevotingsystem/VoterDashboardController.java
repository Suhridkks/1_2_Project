package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class VoterDashboardController {
    @FXML
    private StackPane VoterDashboardLayout;

    @FXML
    private Pane VoterDashboardView;

    @FXML
    private void initialize() {
        setVoterDashboardController();
    }

    public void setVoterDashboardController() {
        VoterDashboardLayout.setPrefWidth(Screen.SCREENWIDTH);
        VoterDashboardLayout.setPrefHeight(Screen.SCREENHEIGHT);
        VoterDashboardView.scaleXProperty().bind(VoterDashboardLayout.widthProperty().divide(1600));
        VoterDashboardView.scaleYProperty().bind(VoterDashboardLayout.heightProperty().divide(900));
    }

    public void back(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("VoterLoginPage.fxml");
    }

    public void viewProfile(ActionEvent actionEvent) throws IOException {
        //SceneManager.switchScene("VoterProfilePage.fxml");
    }

    public void vote(ActionEvent actionEvent) throws IOException {
        //SceneManager.switchScene("VotePage.fxml");
    }
}
