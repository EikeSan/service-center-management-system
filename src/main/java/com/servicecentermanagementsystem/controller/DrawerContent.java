package com.servicecentermanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class DrawerContent implements Initializable {

    @FXML
    private JFXButton customersButton;

    @FXML
    private JFXButton brandsButton;

    @FXML
    private JFXButton modelsButton;

    @FXML
    private JFXButton countButton;

    @FXML
    private JFXButton logoutButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
