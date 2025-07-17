package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class VoterLoginPageController {
    @FXML
    private StackPane VoterLoginPageLayout;

    @FXML
    private Pane VoterLoginPageView;

    @FXML
    private void initialize() {
        setVoterLoginPageController();
    }

    public void setVoterLoginPageController() {
        VoterLoginPageLayout.setPrefWidth(Screen.SCREENWIDTH);
        VoterLoginPageLayout.setPrefHeight(Screen.SCREENHEIGHT);
        VoterLoginPageView.scaleXProperty().bind(VoterLoginPageLayout.widthProperty().divide(1600));
        VoterLoginPageView.scaleYProperty().bind(VoterLoginPageLayout.heightProperty().divide(900));
    }

    public void back(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("hello-view.fxml");
    }


    public void login(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("VoterDashboard.fxml");
    }

    public void forgetPass(ActionEvent actionEvent) {

    }
}
