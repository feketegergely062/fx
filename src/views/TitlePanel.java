package views;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class TitlePanel extends HBox{
    Label label;
    public TitlePanel() {
        this.label = new Label();
        this.getChildren().add(this.label);
        this.setAlignment(Pos.CENTER);
        HBox.setMargin(label, new Insets(10, 10,10,10));
        HBox.setMargin(label, new Insets(10, 0,10,0));
        this.label.setAlignment(Pos.CENTER_RIGHT);
    }
    public void setText(String text){
        this.label.setText(text);
    }
    public String getText(){
        return this.label.getText();
    }
    
}
