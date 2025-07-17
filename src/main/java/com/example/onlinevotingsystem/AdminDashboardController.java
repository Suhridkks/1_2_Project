package com.example.onlinevotingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Side;

import java.io.IOException;
import java.util.List;

public class AdminDashboardController {

    @FXML
    private StackPane AdminDashboardLayout;

    @FXML
    private Pane AdminDashboardView;

    @FXML
    private Button electionOptionsButton; // Make sure this is also updated in the FXML

    private final ContextMenu electionDropdown = new ContextMenu();

    @FXML
    private void initialize() {
        setAdminDashboardController();
        setupDropdownOptions();
    }

    public void setAdminDashboardController() {
        AdminDashboardLayout.setPrefWidth(Screen.SCREENWIDTH);
        AdminDashboardLayout.setPrefHeight(Screen.SCREENHEIGHT);
        AdminDashboardView.scaleXProperty().bind(AdminDashboardLayout.widthProperty().divide(1600));
        AdminDashboardView.scaleYProperty().bind(AdminDashboardLayout.heightProperty().divide(900));
    }

    private void setupDropdownOptions() {
        List<String> options = List.of("General Election", "Student Union", "Local Poll");

        for (String option : options) {
            MenuItem item = new MenuItem(option);
            item.setOnAction(e -> {
                System.out.println("Selected: " + option);
            });
            electionDropdown.getItems().add(item);
        }

        electionOptionsButton.setOnAction(e -> {
            electionDropdown.show(electionOptionsButton, Side.BOTTOM, 0, 0);
        });
    }

    // Scene switchers and actions
    public void manageCandidates(ActionEvent actionEvent) throws IOException {
        System.out.println("Manage candidates clicked");
        SceneManager.switchScene("CandidateDatabase.fxml");
    }

    public void manageVoters(ActionEvent actionEvent) throws IOException {
        System.out.println("Manage voters clicked");
        SceneManager.switchScene("VotersDatabase.fxml");
    }

    public void back(ActionEvent actionEvent) throws IOException {
        SceneManager.switchScene("AdminLoginPage.fxml");
    }

    public void result(ActionEvent actionEvent) {
        System.out.println("Results clicked");
    }

    public void selectElection(ActionEvent actionEvent) throws IOException {
        System.out.println("Election type clicked");
        SceneManager.switchScene("ElectionType.fxml");
    }

    public void specifyTime(ActionEvent actionEvent) {
        System.out.println("Specify time clicked");
    }

    public void changeTime(ActionEvent actionEvent) {
        System.out.println("Change Time clicked");
    }

    public void create(ActionEvent actionEvent) {
        System.out.println("Created");
    }
}
