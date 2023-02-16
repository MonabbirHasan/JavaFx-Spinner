package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller implements Initializable{
	
	@FXML
	private Spinner<Integer> mySpinner;
	@FXML
	private Label myLabel;
	
	int currentvalue;

	public void initialize(URL arg0, ResourceBundle arg1) {
		
		SpinnerValueFactory<Integer> valueFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
		valueFactory.setValue(1);
		mySpinner.setValueFactory(valueFactory);
		
		currentvalue=mySpinner.getValue();
		myLabel.setText(Integer.toString(currentvalue));
		
		mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {

			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
				currentvalue=mySpinner.getValue();
				myLabel.setText(Integer.toString(currentvalue));
				
			}
		});
		
		
		
	}

	
	
}
