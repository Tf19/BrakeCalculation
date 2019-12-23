package application;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ResourceBundle;

import javax.swing.Painter;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import layout.VehiclePane;

public class ControllerMain {
	
	@FXML
	public JFXTextField ttVmz;
	@FXML
	public JFXTextField ttMbr;
	@FXML
	public JFXComboBox<String> ttBrakePos;
	@FXML
	public JFXTextField ttWeightCoaches;
	@FXML
	public JFXTextField ttLength;
	@FXML
	public GridPane trainGrid;
	
	private ObservableList<String> list = FXCollections.observableArrayList("G", "R/P", "R + Mg", "WB");
	
	
	public void onTick() {
		AnchorPane v;
		try {
			v = (AnchorPane)FXMLLoader.load(getClass().getResource("/layout/Vehicle.fxml"));
			trainGrid.add(v, 1, 0);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void initialize() {
		ttBrakePos.setItems(list);
	}
}