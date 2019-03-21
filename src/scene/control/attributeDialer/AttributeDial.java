package scene.control.attributeDialer;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import scene.control.buttons.ButtonMinus;
import scene.control.buttons.ButtonPlus;
import scene.layout.CharacterBuilderPane;
import utilties.statistics.AttributeDialUtil;

public abstract class AttributeDial extends GridPane {
	protected Label lblAttr;
	protected Label lblDesc;
	protected CharacterBuilderPane charPane;
	protected TextField tfNum;
	protected Button btPlus, btMinus;
	
	public AttributeDial(String attrName, String desc, CharacterBuilderPane charPane) {
		this.lblAttr = new Label(attrName);
		this.lblDesc = new Label(desc);
		this.charPane = charPane;
		this.tfNum = AttributeDialUtil.loadTfNum();
		this.btPlus = new ButtonPlus(this);
		this.btMinus = new ButtonMinus(this);
		AttributeDialUtil.displayControls(this);
	}
	
	public Label getLblAttr() {
		return lblAttr;
	}
	
	public Label getLblDesc() {
		return lblDesc;
	}
	
	public CharacterBuilderPane getCharPane() {
		return charPane;
	}

	public Button getBtPlus() {
		return btPlus;
	}

	public Button getBtMinus() {
		return btMinus;
	}

	public TextField getTfNum() {
		return tfNum;
	}
}