package de.duckout.helloDuckout.ui;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class View {

	private GridData gridData;

	@Inject
	public View(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		
		//4 Columns with equal width
		//Gridlayout uses table form to define the layout
		GridLayout gridLayout = new GridLayout(4, true);
		composite.setLayout(gridLayout);
		
		//Column 1
		//Create a button and a checkbox, each has a label
		Label labelClickButton = new Label(composite, SWT.NONE);
		labelClickButton.setText("Click Button Label");
		
		//Column 2
		Button buttonClick = new Button(composite, SWT.PUSH); //Push button
		buttonClick.setText("Click me");
		
		//Column 3
		Label labelCheckBox = new Label(composite, SWT.NONE);
		labelCheckBox.setText("Checkbox Label");
		
		//Column 4
		Button buttonCheck = new Button(composite, SWT.CHECK); //Checkbox
		buttonCheck.setText("Check me");
		
		//Next row
		//Create a text
		Text text = new Text(composite, SWT.MULTI | SWT.WRAP | SWT.BORDER);
		text.setText("Hello Duckout");
		
		//gridDataText: takes the whole horizontal space and goes along all 4 columns
		//Also takes the whole vertical space which is free
		GridData gridDataText = new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1);
		text.setLayoutData(gridDataText);

		//New composite for the bottom, with Filllayout
		Composite fillLayoutComposite = new Composite(composite, SWT.NONE);
		
		//Again a GridData object to make the new bottomComposite alonge through all 4 columns of parent composite
		GridData gridDataFillLayoutComposite = new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1);
		fillLayoutComposite.setLayoutData(gridDataFillLayoutComposite);
		
		//FillLayout with horizontal alignment
		//Widgets used with FillLayout are one after the other with the same size 
		FillLayout fillLayout = new FillLayout(SWT.HORIZONTAL);
		fillLayoutComposite.setLayout(fillLayout);
		
		//Trie to make some dummy texts
		Text fillLayoutText = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText.setText("I");
		Text fillLayoutText2 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText2.setText("hope");
		Text fillLayoutText3 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText3.setText("this");
		Text fillLayoutText4 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText4.setText("example");
		Text fillLayoutText5 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText5.setText("helps");
		Text fillLayoutText6 = new Text(fillLayoutComposite, SWT.BORDER);
		fillLayoutText6.setText("you!");
		
		//A new area for a SashForm
		Composite bottomComposite = new Composite(composite, SWT.NONE);
		
		//GridData with one column
		GridLayout gridLayoutBottom = new GridLayout(1, true);
		bottomComposite.setLayout(gridLayoutBottom);
		
		//Again the GridData to make it through all columns of the parent
		GridData gridDataBottomComposite = new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1);
		bottomComposite.setLayoutData(gridDataBottomComposite);
		
		//Create a sashForm
		SashForm sashForm = new SashForm(bottomComposite, SWT.HORIZONTAL);

		//Make the shashForm fill the horizontal and vertical alignment
		GridData sashFormGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 4, 1);
		sashForm.setLayoutData(sashFormGridData);
		
		Text textLeft = new Text(sashForm, SWT.BORDER);
		textLeft.setText("Left side");
		
		Text textRight = new Text(sashForm, SWT.BORDER);
		textRight.setText("Right side");
	}
}
