package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	FXMLLoader loader = new FXMLLoader();
	
	@Override
	public void start(Stage primaryStage) {
			try {
						
						// Create the FXMLLoader
						
						// Path to the FXML File
						String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\Root.fxml";
					    FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
						
						// Create the Pane and all Details
						Parent root = loader.load(fxmlStream);
						Scene scene = new Scene(root,1100,800);
						scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						primaryStage.setScene(scene);
						primaryStage.show();
					} catch(Exception e) {
						e.printStackTrace();
					}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public void manageOrdersScene(Stage currentStage) {
		
		String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\ManageOrders.fxml";
		FileInputStream fxmlStream = null;
		try {
			fxmlStream = new FileInputStream(fxmlDocPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AnchorPane pane = null;
		try {
			pane = (AnchorPane) loader.load(fxmlStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		Scene scene = new Scene(pane,1100,800);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		currentStage.setScene(scene);
		currentStage.show();
		
	}
	
public void viewOrdersScene(Stage currentStage) {

	
		String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\ViewOrders.fxml";
		FileInputStream fxmlStream = null;
		try {
			fxmlStream = new FileInputStream(fxmlDocPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AnchorPane pane = null;
		try {
			pane = (AnchorPane) loader.load(fxmlStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		Scene scene = new Scene(pane,1100,800);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		currentStage.setScene(scene);
		currentStage.show();
		
	}


public void viewOrdersScene1(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\ViewOrder1.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void viewOrdersScene2(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\ViewOrder2.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}
	
public void OrdersCartScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\OrdersCart.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void DeliverOrdersScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\DeliverOrders.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void OrdersCartScene1(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\EmptyOrdersCart.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void toHomePage(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\PharmacistHome.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void toCustomerMode(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\CustomerHome.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void CartScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\Cart.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void PaymentScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\PaymentSelection.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void OnlinePaymentScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\OnlinePayment.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void CashOnDeliveryScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\CashOnDelivery.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void PaymentConfirmationScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\PaymentConfirmation.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void OrderConfirmationScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\OrderConfirmation.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void UploadPrescriptionScene(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\UploadPrescription.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}

public void OrderConfirmationNew(Stage currentStage) {
	
	String fxmlDocPath = "C:\\Users\\kifal\\eclipse-workspace\\KuickMedNew\\src\\PrescriptionOrderConfirmation.fxml";
	FileInputStream fxmlStream = null;
	try {
		fxmlStream = new FileInputStream(fxmlDocPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AnchorPane pane = null;
	try {
		pane = (AnchorPane) loader.load(fxmlStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Scene scene = new Scene(pane,1100,800);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	currentStage.setScene(scene);
	currentStage.show();
	
}
}
