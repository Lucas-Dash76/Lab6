/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import javafx.application.Application;


import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;



/**
 *
 * @author 2389873
 */
public class Lab6_Task1 extends Application{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    launch(args);    
            }


    @Override
    public void start(Stage stage) {
       final double SCENE_WIDTH = 520.0;
       final double SCENE_HEIGHT = 520.0;

       final int X1 = 10, Y1 = 10; // Square #1
       final int X2 = 60, Y2 = 60; // Square #1
       final int X3 = 110, Y3 = 110; // Square #3

       final int WIDTH1 = 500, HEIGHT1 = 500; // Square #1
       final int WIDTH2 = 400, HEIGHT2 = 400; // Square #2
       final int WIDTH3 = 300, HEIGHT3 = 300; // Square #3

       final int CENTER_X = 260, CENTER_Y = 260, RADIUS = 150;
 
 // Create square #1 here. Set its stroke color to black
 // and set its fill color to null.
       Rectangle sq1 = new Rectangle(X1, Y1, WIDTH1, HEIGHT1);
       sq1.setStroke(Color.BLACK);
       sq1.setFill(null);
 
 // Create square #2 here. Set its stroke color to black
 // and set its fill color to null.
       Rectangle sq2 = new Rectangle(X2, Y2, WIDTH2, HEIGHT2);
       sq2.setStroke(Color.BLACK);
       sq2.setFill(null);

 // Create square #3 here. Set its stroke color to black
 // and set its fill color to null.
       Rectangle sq3 = new Rectangle(X3, Y3, WIDTH3, HEIGHT3);
       sq3.setStroke(Color.BLACK);
       sq3.setFill(null);
 // Create the diagonal lines here.
       Line l1 = new Line(X1, Y1, X3, Y3);
       l1.setStroke(Color.BLACK);
       Line l2 = new Line(X1 + WIDTH1, Y1, X3 + WIDTH3, Y3);

       Line l3 = new Line(X1, Y1 + WIDTH1, X3, Y3 + WIDTH3);

       
       Line l4 = new Line(X1 + WIDTH1, Y1 + WIDTH1, X3 + WIDTH3, Y3 + WIDTH3);

 // Create the circle here.
       Circle c1 = new Circle(CENTER_X, CENTER_Y, RADIUS);
       c1.setFill(Color.BLACK);
 // Add the nodes to a Pane here.

       Pane root = new Pane();
       root.getChildren().addAll(sq1, sq2, sq3, c1, l1, l2, l3, l4);
        
 // Create a Scene with the Pane as the root node,
       Scene s = new Scene(root, 550, 750);
       stage.setScene(s);
       stage.show();
         
 // and display it here.
 }
 }

       
  

