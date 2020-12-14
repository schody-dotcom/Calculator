
package edu.ib;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class JavaFXCalculatorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane bp;

    @FXML
    private TextField screen;

    @FXML
    private Button cancel;

    @FXML
    private Button sign;

    @FXML
    private Button percent;

    @FXML
    private Button divide;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button multiply;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button sub;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button add;

    @FXML
    private Button zero;

    @FXML
    private Button comma;

    @FXML
    private Button equals;

    Model m = new Model();
    String lastButtonClicked = "start";

    @FXML
    void onCancel(ActionEvent event) {
        m.setX(0);
        m.setY(0);
        m.setOperator("");
        screen.setText("0");
    }

    @FXML
    void onComma(ActionEvent event) {

        if (lastButtonClicked.equals("equals") || lastButtonClicked.equals("operator"))
            screen.setText("0");



        if (screen.getText().isEmpty())
            screen.setText("0.");
        else if (screen.getText().equals("0"))
            screen.setText("0.");
        else if (!screen.getText().contains("."))
            screen.setText(screen.getText() + ".");


        Button btn = (Button) event.getSource();
        lastButtonClicked = btn.getId();

    }

    @FXML
    void onEqual(ActionEvent event) {

        if (!lastButtonClicked.equals("equals")) {
            m.setY(Double.parseDouble(screen.getText()));
        }

        screen.setText(String.valueOf(m.operation()));
        m.setX(Double.parseDouble(screen.getText()));

        Button btn = (Button) event.getSource();
        lastButtonClicked = btn.getId();


    }

    @FXML
    void onNumber(ActionEvent event) {

        if (lastButtonClicked.equals("equals") || lastButtonClicked.equals("operator"))
            screen.setText("0");

        if(lastButtonClicked.equals("equals")){
            m.setY(0);
            m.setOperator("0");}

        Button btn = (Button) event.getSource();
        String s = "";
        switch (btn.getId()) {
            case "zero":

                s = "0";

                break;
            case "one":
                s = "1";
                break;
            case "two":
                s = "2";
                break;
            case "three":
                s = "3";
                break;
            case "four":
                s = "4";
                break;
            case "five":
                s = "5";
                break;
            case "six":
                s = "6";
                break;
            case "seven":
                s = "7";
                break;
            case "eight":
                s = "8";
                break;
            case "nine":
                s = "9";
                break;
        }
        if (screen.getText().isEmpty())
            screen.setText(s);
        else if (screen.getText().equals("0"))
            screen.setText(s);
        else
            screen.setText(screen.getText() + s);

        lastButtonClicked = btn.getId();

    }

    @FXML
    void onOperator(ActionEvent event) {


        m.setX(Double.parseDouble(screen.getText()));
        Button btn = (Button) event.getSource();
        m.setOperator(btn.getId());

        lastButtonClicked = "operator";

        if (btn.getId().equals("percent") || btn.getId().equals("sign")) {
                screen.setText(String.valueOf(m.operation1()));
                lastButtonClicked = "operator1";
                m.setX(m.operation1());
        }
    }

    @FXML
    void onScreen(ActionEvent event) {

    }


    @FXML
    void initialize() {
        assert bp != null : "fx:id=\"bp\" was not injected: check your FXML file 'calculator.fxml'.";
        assert screen != null : "fx:id=\"screen\" was not injected: check your FXML file 'calculator.fxml'.";
        assert cancel != null : "fx:id=\"cancel\" was not injected: check your FXML file 'calculator.fxml'.";
        assert sign != null : "fx:id=\"sign\" was not injected: check your FXML file 'calculator.fxml'.";
        assert percent != null : "fx:id=\"percent\" was not injected: check your FXML file 'calculator.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'calculator.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calculator.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calculator.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calculator.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'calculator.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calculator.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calculator.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calculator.fxml'.";
        assert sub != null : "fx:id=\"sub\" was not injected: check your FXML file 'calculator.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calculator.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calculator.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calculator.fxml'.";
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'calculator.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calculator.fxml'.";
        assert comma != null : "fx:id=\"comma\" was not injected: check your FXML file 'calculator.fxml'.";
        assert equals != null : "fx:id=\"equals\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}
