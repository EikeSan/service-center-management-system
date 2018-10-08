package com.servicecentermanagementsystem.controller;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import com.servicecentermanagementsystem.view.FxmlView;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import com.servicecentermanagementsystem.view.StageManager;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class AdminController implements Initializable {

    private final StageManager stageManager;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private AnchorPane contentPane;

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private JFXDrawer drawer;

    @Autowired @Lazy
    public AdminController(StageManager stageManager) {
        this.stageManager = stageManager;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            VBox box = FXMLLoader.load(getClass().getResource("/fxml/adminSidePane.fxml"));
            AnchorPane secondPane = FXMLLoader.load(getClass().getResource("/fxml/modelContent.fxml"));

            contentPane.getChildren().addAll(secondPane);
            drawer.setPrefHeight(0);
            HamburgerSlideCloseTransition burgerTask = new HamburgerSlideCloseTransition(hamburger);
            burgerTask.setRate(-1);
            hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
                burgerTask.setRate(burgerTask.getRate() * -1);
                burgerTask.play();

                if(drawer.isOpened() || drawer.isOpening()){
                    drawer.setSidePane();
                    drawer.close();
                    drawer.setPrefHeight(0);
                } else {
                    drawer.setPrefHeight(340);
                    drawer.setSidePane(box);
                    drawer.open();
                }

            });
        } catch (Exception e){

        }
    }

}
