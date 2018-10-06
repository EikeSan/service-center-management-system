package com.servicecentermanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.servicecentermanagementsystem.view.FxmlView;
import com.servicecentermanagementsystem.view.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.layout.AnchorPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class LoginController implements Initializable {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
    private final StageManager stageManager;

    @FXML
    private AnchorPane rootPane;

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

    @Autowired @Lazy
    public LoginController(StageManager stageManager) {
        this.stageManager = stageManager;
    }

    public void login(String username, String password){
        try {
            if (username.equals("admin") && password.equals("123456")){
                stageManager.switchScene(FxmlView.ADMIN);

            }else {

            }
        }catch (Exception e){
            LOG.info(e.getMessage());
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
