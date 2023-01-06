package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {
	
	Main main = new Main();
	Stage stage;
	Scene scene;
	Parent root;
	
	@FXML
	private Button manageOrdersButton;
	@FXML
	private Button returnToHomeButton;
	@FXML
	private Button viewOrdersButton;
	@FXML
	private Button acceptButton;
	@FXML
	private Button rejectButton;
	@FXML
	private Button ordersCartButton;
	@FXML
	private Button deliverButton;
	@FXML
	private Button emptyOrdersCartButton;
	@FXML
	private Button pharmacistButton;
	@FXML
	private Button customerButton;
	@FXML
	private Button LogOutButton;
	@FXML
	private Button CartButton;
	@FXML
	private Button paymentButton;
	@FXML
	private Button onlineButton;
	@FXML
	private Button cashButton;
	@FXML
	private Button payButton;
	@FXML
	private Button placeOrder;
	@FXML
	private Button cashOnDeliveryButton;
	@FXML
	private Button uploadPrescriptionButton;
	@FXML
	private Button confirmButton;
	
			 public HomeController()
			 {
				 
			 }
			 
			 @FXML
			 public void initialize()
			 {
				 
			 }
			 
			 public void manageOrders(ActionEvent event) throws IOException {

					stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		        main.manageOrdersScene(stage);
					
				}
			 
			 public void returnToHome(ActionEvent event) throws IOException{
				 
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.start(stage);
			 }
			 
			 public void viewOrders(ActionEvent event) throws IOException{
				 
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.viewOrdersScene(stage);
			 }
			 
			 public void acceptOrder(ActionEvent event) throws IOException{
				            
				 			
							 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
							 main.viewOrdersScene1(stage);
						 }
						 
			 public void rejectOrder(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.viewOrdersScene2(stage);
			 }
			 
			 public void viewOrdersCart(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.OrdersCartScene(stage);
			 }
			 
			 public void viewOrdersCart1(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.OrdersCartScene1(stage);
			 }
			 
			 public void deliverOrders(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.DeliverOrdersScene(stage);
			 }	

			 public void toPharmacistMode(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.toHomePage(stage);
			 }
			 
			 public void logOut(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.start(stage);
			 }	
			 
			 public void toCustomerMode(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.toCustomerMode(stage);
			 }
			 
			 public void viewCart(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.CartScene(stage);
			 }
			 
			 public void payForMedicines(ActionEvent event) throws IOException{
			    	
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.PaymentScene(stage);
			 }
			 
			 public void payOnline(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.OnlinePaymentScene(stage);
			 }
			 
			 public void payCashOnDelivery(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.CashOnDeliveryScene(stage);
			 }
			 
			 public void payOnlineNow(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.PaymentConfirmationScene(stage);
			 }
			 
			 public void placeOrderNow(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.OrderConfirmationScene(stage);
			 }
			 
			 public void uploadPrescription(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.UploadPrescriptionScene(stage);
			 }
			 
			 public void confirmOrder(ActionEvent event) throws IOException{
			     
					
				 stage=(Stage)((Node)event.getSource()).getScene().getWindow(); 
				 main.OrderConfirmationNew(stage);
			 }
			 
			 
			 
			 
			
}
