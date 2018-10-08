package com.servicecentermanagementsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ModelContent implements Initializable {
    @FXML
    private JFXTextField modelNameField;

    @FXML
    private JFXSlider warrantySlider;

    @FXML
    private JFXComboBox<?> brandPicker;

    @FXML
    private JFXButton saveButton;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
