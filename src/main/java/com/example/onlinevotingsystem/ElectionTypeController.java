package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class ElectionTypeController {

    @FXML
    private StackPane electionTypeLayout;

    @FXML
    private Pane electionTypeView;

    @FXML
    private void initialize() {
        setElectionTypeController();
    }

    public void setElectionTypeController() {
        electionTypeLayout.setPrefWidth(Screen.SCREENWIDTH);
        electionTypeLayout.setPrefHeight(Screen.SCREENHEIGHT);
        electionTypeView.scaleXProperty().bind(electionTypeLayout.widthProperty().divide(1600));
        electionTypeView.scaleYProperty().bind(electionTypeLayout.heightProperty().divide(900));
    }

    int electionType = 0;

    public void binarySystem(ActionEvent actionEvent) throws IOException {
        electionType = 1;
        SceneManager.switchScene("BinaryVoteSystem.fxml");
    }

    public void rankedChoice(ActionEvent actionEvent) {
        electionType = 2;
    }

    public void singleWinner(ActionEvent actionEvent) {
        electionType = 3;
    }

    public void multipleWinner(ActionEvent actionEvent) {
        electionType = 4;
    }

    public void apply(ActionEvent actionEvent) throws IOException {
            SceneManager.switchScene("AdminDashboard.fxml");
    }

    public void back(ActionEvent actionEvent) throws IOException {
            //ber houar age sob null kore dite hbe karon se apply kore nai
            electionType = 0;
            SceneManager.switchScene("AdminDashboard.fxml");
    }
}
