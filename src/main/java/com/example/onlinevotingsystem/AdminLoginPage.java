package com.example.onlinevotingsystem;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

class AdminLoginPage {

    public AdminLoginPage() {}

    public void startAdminLoginPage(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/admin/AdminDashboard.fxml"));
        Parent root = loader.load();
        AdminLoginPageController controller = loader.getController();
        //controller.setStage(stage);

        stage.setScene(new Scene(root, 1000, 500));
        stage.show();
    }
}

