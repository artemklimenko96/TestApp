package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
	
		@FXML
	    private TextField username;

	    @FXML
	    private PasswordField password;

	    @FXML
	    private Button submitButton;
	    
	 // Reference to the main application.
	    private Main main;
	    
	    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
	        System.out.println("submit");
	        System.out.println(username.getText() + "/" + password.getText());
	        //temporary validation
	        if(username.getText().equals("a") && password.getText().equals("a")) {
	        	System.out.println("Login");
	            //main.doctorScreen();
	        	main.initDoctorLayout();
	        }
	    }	
	    
	    public void setMain(Main main) {
	        this.main = main;
	    }

}
