/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;
import javafx.application.Application;
import javafx.geometry.Insets;


import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;


/**
 *
 * @author 2389873
 */
public class Lab6_Task2 extends Application{

    public static void main(String[] args) {
    launch(args);    
            }
    
    @Override
    public void start(Stage stage) {
        Rectangle lawn = new Rectangle(0, 500, 500, 100);
        lawn.setStroke(Color.GREEN);
        lawn.setFill(Color.GREEN);
        
        Rectangle house = new Rectangle(100, 250, 300, 250);
        house.setStroke(Color.BLACK);
        house.setFill(Color.LIGHTGRAY);
        
        Rectangle poarch = new Rectangle(100, 499, 300, 20);
        poarch.setStroke(Color.BEIGE);
        poarch.setFill(Color.BEIGE);
        
        Rectangle door = new Rectangle(225, 400, 50, 100);
        door.setStroke(Color.LIGHTCYAN);
        door.setFill(Color.LIGHTCYAN);
        
        Circle doornob = new Circle(230, 450, 5);
        doornob.setFill(Color.BROWN);
        
        Rectangle window1 = new Rectangle(130, 325, 50, 50);
        window1.setStroke(Color.LIGHTBLUE);
        window1.setFill(Color.LIGHTBLUE);
        Line l1 = new Line(155, 325, 155, 375);
        Line l2 = new Line(130, 350, 180, 350);
        
        
        Rectangle window2 = new Rectangle(320, 325, 50, 50);
        window2.setStroke(Color.LIGHTBLUE);
        window2.setFill(Color.LIGHTBLUE);
        Line l3 = new Line(345, 325, 345, 375);
        Line l4 = new Line(320, 350, 370, 350);
        
        Polygon roof = new Polygon(100.0, 250.0, 250.0, 100.0, 400.0, 250.0);
        roof.setStroke(Color.BLACK);
        roof.setFill(Color.LIGHTCYAN);
        
        Rectangle chimney = new Rectangle(140, 150, 25, 80);
        chimney.setStroke(Color.GRAY);
        chimney.setFill(Color.GRAY);
        
        Circle sun = new Circle(450, 50, 30);
        sun.setStroke(Color.YELLOW);
        sun.setFill(Color.YELLOW);
        Line l5 = new Line(450, 80, 450, 115);
        l5.setStroke(Color.ORANGE);
        Line l6 = new Line(420, 50, 385, 50);
        l6.setStroke(Color.ORANGE);
        Line l7 = new Line(430, 70, 400, 100);
        l7.setStroke(Color.ORANGE);
        
        Pane root = new Pane();
        BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        root.setBackground(background);
        root.getChildren().addAll(lawn, house, poarch, door, doornob, window1,
                l1, l2, window2, l3, l4, roof, chimney, sun, l5, l6, l7);
        Scene s = new Scene(root, 500, 600);
       
       stage.setScene(s);
       
       stage.show();
    }
    
}
