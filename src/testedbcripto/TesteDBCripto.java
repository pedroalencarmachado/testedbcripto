/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedbcripto;

import java.security.NoSuchAlgorithmException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class TesteDBCripto extends Application {

    @Override
    public void start(Stage primaryStage) throws NoSuchAlgorithmException {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        String password1MD5 = ConvertPasswordToMD5.convertPasswordToMD5("123");

        String comparar = ConvertPasswordToMD5.convertPasswordToMD5("123");

        if (password1MD5.equals(comparar)) {
            System.out.println("Compare OK");
        } else {
            System.out.println("Compare NOK");
        }

        DAOBanco.getConnection(1,"pedro",password1MD5);

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
