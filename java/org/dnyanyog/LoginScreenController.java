package org.dnyanyog;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreenController {
	
	@FXML
	TextField passwordTextField;
	
	@FXML
	TextField loginTextField;
	
	@FXML
	Label errorLabel;
	
	
	public void loginButtonClick() {
		System.out.println(loginTextField.getText());
		System.out.println(passwordTextField.getText());
	}

}
