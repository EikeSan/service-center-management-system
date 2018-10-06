package com.servicecentermanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class LoginController implements Initializable {
    private ConfigurableApplicationContext  springContext;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton signInButton;

    @FXML
    private JFXButton signUpButton;

    @FXML
    void signIn(ActionEvent event) {
        login(username.getText(), password.getText());

    }

    public void login(String username, String password){
        try {
            if (username.equals("admin") && password.equals("123456")){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("admin.fxml"));
                Parent parent = fxmlLoader.load();

                Stage stage = new Stage(StageStyle.DECORATED);
                stage.setTitle("Library Assistant");
                stage.setScene(new Scene(parent));
                stage.show();

            }else {
                System.out.println(username+ "\n" + password );
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
