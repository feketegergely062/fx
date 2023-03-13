package controllers;

import javafx.scene.control.Button;
import models.MainModels;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModels mainModel;
    public MainController() {
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModels();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return mainPanel;
    }
    private void handleEvent(){
        Button calcButton = this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> oneClickCalcButton());
    }
    private void oneClickCalcButton(){
        System.out.println("mukodik");
        String radiusStr = this.mainPanel.getRadiusPanel().getValue();
        String heightStr = this.mainPanel.getHeightPanel().getValue();
        double radius = Double.parseDouble(radiusStr);
        double height = Double.parseDouble(heightStr);
        Double volume = mainModel.calcConeVolume(radius, height);
        this.mainPanel.getVolumePanel().setValue(volume.toString());
        System.out.println(radiusStr);

    }
}
