package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLoginPageController {
    @FXML
    private StackPane AdminLoginPageLayout;

    @FXML
    private Pane AdminLoginPageView;

    @FXML
    private void initialize() {
        setAdminLoginPageController();
    }

    public void setAdminLoginPageController() {
        AdminLoginPageLayout.setPrefWidth(Screen.SCREENWIDTH);
        AdminLoginPageLayout.setPrefHeight(Screen.SCREENHEIGHT);
        AdminLoginPageView.scaleXProperty().bind(AdminLoginPageLayout.widthProperty().divide(1600));
        AdminLoginPageView.scaleYProperty().bind(AdminLoginPageLayout.heightProperty().divide(900));
    }

    public void login(ActionEvent actionEvent) throws IOException {
        System.out.println("Login clicked");
        //
         //check matches or not , if not show a bos that did not match
        //
        SceneManager.switchScene("AdminDashboard.fxml");
    }

    public void forgetPass(ActionEvent actionEvent) {
        System.out.println("forget pass clicked");
    }

    public void signUp(ActionEvent actionEvent) {
        System.out.println("Sign up clicked");
    }


    public void back(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("hello-view.fxml");
    }
}
