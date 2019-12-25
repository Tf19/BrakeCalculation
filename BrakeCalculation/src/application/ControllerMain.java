package application;

import java.io.IOException;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import layout.AboutPane;

public class ControllerMain {

	// Timetable
	@FXML
	public JFXTextField ttVmz;
	@FXML
	public JFXTextField ttMbr;
	@FXML
	public JFXComboBox<String> ttBrakePos;
	private ObservableList<String> ttBrakePosList = FXCollections.observableArrayList("G", "R/P", "R + Mg", "WB");
	@FXML
	public JFXTextField ttWeightCoaches;
	@FXML
	public JFXTextField ttLength;

	// Basic data
	@FXML
	public JFXTextField bdName;
	@FXML
	public JFXComboBox<String> bdVehicleType;
	private ObservableList<String> bdVehicleTypeList = FXCollections.observableArrayList("arb. Tfz", "n. arb. Tfz",
			"Wagen");
	@FXML
	public JFXTextField bdWeight;
	@FXML
	public JFXTextField bdLength;
	@FXML
	public JFXComboBox<Integer> bdAxlesCount;
	private ObservableList<Integer> bdAxlesCountList = FXCollections.observableArrayList(2, 4, 6);

	// Brake data
	@FXML
	public JFXToggleButton brdPneumBrake;
	@FXML
	public JFXToggleButton brdDynamicBrake;
	@FXML
	public JFXToggleButton brdBrakePipeAccelerator;
	@FXML
	public JFXToggleButton brdAirSuspension;
	@FXML
	public JFXComboBox<String> brdBrakeType;
	private ObservableList<String> brdBrakeTypeList = FXCollections.observableArrayList("Scheibe", "Klotz");
	@FXML
	public JFXCheckBox brdAutoBrakingOfLoad;
	@FXML
	public JFXCheckBox brdPosG;
	@FXML
	public JFXCheckBox brdPosP;
	@FXML
	public JFXCheckBox brdPosR;
	@FXML
	public JFXCheckBox brdPosRMg;
	@FXML
	public JFXCheckBox brdPosRE;
	@FXML
	public JFXCheckBox brdPosRWB;

	// Block train
	@FXML
	public ImageView btReverse;
	@FXML
	public ImageView btDeleteBlockTrain;

	// Grid
	@FXML
	public GridPane trainGridPane;
	@FXML
	public ImageView addVehicleTo0;
	@FXML
	public ImageView addVehicleTo1;
	@FXML
	public ImageView addVehicleTo2;
	@FXML
	public ImageView addVehicleTo3;
	@FXML
	public ImageView addVehicleTo4;
	@FXML
	public ImageView addVehicleTo5;
	@FXML
	public ImageView addVehicleTo6;
	@FXML
	public ImageView addVehicleTo7;
	@FXML
	public ImageView addVehicleTo8;
	@FXML
	public ImageView addVehicleTo9;
	@FXML
	public ImageView addVehicleTo10;
	@FXML
	public ImageView addVehicleTo11;
	@FXML
	public ImageView addVehicleTo12;
	@FXML
	public ImageView addVehicleTo13;
	@FXML
	public ImageView addVehicleTo14;
	@FXML
	public ImageView addVehicleTo15;
	@FXML
	public ImageView addVehicleTo16;
	@FXML
	public ImageView addVehicleTo17;
	@FXML
	public ImageView addVehicleTo18;
	@FXML
	public ImageView addVehicleTo19;
	@FXML
	public ImageView addVehicleTo20;
	@FXML
	public ImageView addVehicleTo21;
	@FXML
	public ImageView addVehicleTo22;
	@FXML
	public ImageView addVehicleTo23;
	ImageView[] addVehicleList = {addVehicleTo0, addVehicleTo1, addVehicleTo2, addVehicleTo3, addVehicleTo4,
			addVehicleTo5, addVehicleTo6, addVehicleTo7, addVehicleTo8, addVehicleTo9, addVehicleTo10, addVehicleTo11,
			addVehicleTo12, addVehicleTo13, addVehicleTo14, addVehicleTo15, addVehicleTo16, addVehicleTo17, addVehicleTo18,
			addVehicleTo19, addVehicleTo20, addVehicleTo21, addVehicleTo22, addVehicleTo23};

	public void initialize() {
		ttBrakePos.setItems(ttBrakePosList);
		bdVehicleType.setItems(bdVehicleTypeList);
		bdAxlesCount.setItems(bdAxlesCountList);
		brdBrakeType.setItems(brdBrakeTypeList);
		removeAllVehicles();
	}

	public void addVehicleOn0() {
		addVehicleOn(0);
	}

	public void addVehicleOn1() {
		addVehicleOn(1);
	}

	public void addVehicleOn2() {
		addVehicleOn(2);
	}
	public void addVehicleOn3() {
		addVehicleOn(3);
	}
	public void addVehicleOn4() {
		addVehicleOn(4);
	}
	public void addVehicleOn5() {
		addVehicleOn(5);
	}
	public void addVehicleOn6() {
		addVehicleOn(6);
	}
	public void addVehicleOn7() {
		addVehicleOn(7);
	}
	public void addVehicleOn8() {
		addVehicleOn(8);
	}
	public void addVehicleOn9() {
		addVehicleOn(9);
	}
	public void addVehicleOn10() {
		addVehicleOn(10);
	}
	public void addVehicleOn11() {
		addVehicleOn(11);
	}
	public void addVehicleOn12() {
		addVehicleOn(12);
	}
	public void addVehicleOn13() {
		addVehicleOn(13);
	}
	public void addVehicleOn14() {
		addVehicleOn(14);
	}
	public void addVehicleOn15() {
		addVehicleOn(15);
	}
	public void addVehicleOn16() {
		addVehicleOn(16);
	}
	public void addVehicleOn17() {
		addVehicleOn(17);
	}
	public void addVehicleOn18() {
		addVehicleOn(18);
	}
	public void addVehicleOn19() {
		addVehicleOn(19);
	}
	public void addVehicleOn20() {
		addVehicleOn(20);
	}
	public void addVehicleOn21() {
		addVehicleOn(21);
	}
	public void addVehicleOn22() {
		addVehicleOn(22);
	}
	public void addVehicleOn23() {
		addVehicleOn(23);
	}

	public void addVehicleOn(int index) {
		// TODO
		System.out.println("Place a new vehicle to " + index);
	}
	
	public void removeAllVehicles() {
		Main.blockTrain.clear();
		for (int i = 0; i < addVehicleList.length; i++) {
			System.out.println(i);
			addVehicleList[i].setVisible(false);
		}
		addVehicleList[0].setVisible(true);
		addVehicleList[1].setVisible(true);
	}

	public void onTick() {
		AnchorPane v;
		try {
			v = (AnchorPane) FXMLLoader.load(getClass().getResource("/layout/Vehicle.fxml"));
			trainGridPane.add(v, 1, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void openAbout() {
		new AboutPane();
	}
}