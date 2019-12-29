package application;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import layout.AboutPane;
import vehicles.Vehicle;

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
	ImageView[] addVehicleList;

	@FXML
	public void initialize() {
		ttBrakePos.setItems(ttBrakePosList);
		bdVehicleType.setItems(bdVehicleTypeList);
		bdAxlesCount.setItems(bdAxlesCountList);
		brdBrakeType.setItems(brdBrakeTypeList);
		addVehicleList = new ImageView[] { addVehicleTo0, addVehicleTo1, addVehicleTo2, addVehicleTo3, addVehicleTo4,
				addVehicleTo5, addVehicleTo6, addVehicleTo7, addVehicleTo8, addVehicleTo9, addVehicleTo10,
				addVehicleTo11, addVehicleTo12, addVehicleTo13, addVehicleTo14, addVehicleTo15, addVehicleTo16,
				addVehicleTo17, addVehicleTo18, addVehicleTo19, addVehicleTo20, addVehicleTo21, addVehicleTo22,
				addVehicleTo23 };
		for (ImageView imageView : addVehicleList)
			imageView.setVisible(false);
		addVehicleList[0].setVisible(true);
		addVehicleList[1].setVisible(true);
	}

	@FXML
	public void addVehicleOn0() {
		System.out.println("FXML ausgeführt, Weiterleitung an addVehicleOn(0):");
		addVehicleOn(0, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn1() {
		addVehicleOn(1, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn2() {
		addVehicleOn(2, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn3() {
		addVehicleOn(3, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn4() {
		addVehicleOn(4, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn5() {
		addVehicleOn(5, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn6() {
		addVehicleOn(6, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn7() {
		addVehicleOn(7, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn8() {
		addVehicleOn(8, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn9() {
		addVehicleOn(9, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn10() {
		addVehicleOn(10, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn11() {
		addVehicleOn(11, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn12() {
		addVehicleOn(12, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn13() {
		addVehicleOn(13, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn14() {
		addVehicleOn(14, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn15() {
		addVehicleOn(15, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn16() {
		addVehicleOn(16, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn17() {
		addVehicleOn(17, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn18() {
		addVehicleOn(18, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn19() {
		addVehicleOn(19, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn20() {
		addVehicleOn(20, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn21() {
		addVehicleOn(21, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn22() {
		addVehicleOn(22, Main.defaultVehicle);
	}

	@FXML
	public void addVehicleOn23() {
		addVehicleOn(23, Main.defaultVehicle);
	}

	public void addVehicleOn(int index, Vehicle vehicle) {
		System.out.println("Endmethode, Vehicle wird im Folgenden geaddet:");
		Main.blockTrain.add(index, vehicle);
	}

	public void addSampleVehicle() {
		addVehicleOn(0, Main.sampleVehicle);
	}
	
	public void addVehiclePaneToGrid(int vehicleIndex, AnchorPane vehiclePane) {
		
		int column = (vehicleIndex % 6)*2+1;
		int row = 0;
		while(vehicleIndex > 6) {
			vehicleIndex -= 6;
			row += 2;
		}
		trainGridPane.add(vehiclePane, column, row);
		System.out.println("Children: " + trainGridPane.getChildren());
		
		System.out.println("Added at: " + column + "/" + row);
	}

	public void openAbout() {
		new AboutPane();
	}
}