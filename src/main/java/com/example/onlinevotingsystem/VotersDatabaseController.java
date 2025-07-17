package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;

public class VotersDatabaseController {
    @FXML
    private StackPane VotersDatabaseLayout;

    @FXML
    private Pane VotersDatabaseView;

    @FXML
    private void initialize() {
        setVotersDatabaseController();
    }

    public void setVotersDatabaseController() {
        VotersDatabaseLayout.setPrefWidth(Screen.SCREENWIDTH);
        VotersDatabaseLayout.setPrefHeight(Screen.SCREENHEIGHT);
        VotersDatabaseView.scaleXProperty().bind(VotersDatabaseLayout.widthProperty().divide(1600));
        VotersDatabaseView.scaleYProperty().bind(VotersDatabaseLayout.heightProperty().divide(900));
    }

    public void addVoter(ActionEvent actionEvent) throws IOException {
        System.out.println("Add clicked");
        SceneManager.switchScene("AddVoter.fxml");

    }

    public void back(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("AdminDashboard.fxml");
    }

    public void removeVoter(ActionEvent actionEvent) {
        System.out.println("Remove clicked");
    }

    public void update(ActionEvent actionEvent) throws IOException {
        System.out.println("Update clicked");
    }

    public void next(ActionEvent actionEvent) {
        System.out.println("next clicked");
    }
}
