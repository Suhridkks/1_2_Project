package com.example.onlinevotingsystem;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HomePageController {
    @FXML
    private StackPane HomePageLayout;

    @FXML
    private Pane HomePageView;

    @FXML
    private void initialize() {
        setHomePageController();
    }

    public void setHomePageController() {
        HomePageLayout.setPrefWidth(Screen.SCREENWIDTH);
        HomePageLayout.setPrefHeight(Screen.SCREENHEIGHT);
        HomePageView.scaleXProperty().bind(HomePageLayout.widthProperty().divide(800));
        HomePageView.scaleYProperty().bind(HomePageLayout.heightProperty().divide(600));
    }


    AdminLoginPage admin = new AdminLoginPage();
    @FXML
    private void adminLogin(ActionEvent event) throws IOException {
        System.out.println("Admin Login Clicked");
        SceneManager.switchScene("AdminLoginPage.fxml");

    }

    @FXML
    private void voterLogin(ActionEvent event) throws IOException {
        System.out.println("Voter Login Clicked");
        SceneManager.switchScene("VoterLoginPage.fxml");
    }

    @FXML
    private void pastElection(ActionEvent event) {
        System.out.println("Past Election Clicked");
    }

    @FXML
    private void exit(ActionEvent event) {
        Platform.exit();
    }
}
