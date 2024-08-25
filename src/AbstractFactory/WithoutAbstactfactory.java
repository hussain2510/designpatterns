//requirement: client want to create macbutton,maxtexbox,windowbutton,windowtextbox
//first we will factory method to create button and textbox depends upon type
//we are creating first using simple factory pattern
package AbstractFactory;

import java.util.Scanner;

class Factory{
	static IButton createButton(String buttonType)
	{
		IButton button=null;
		if(buttonType.equals("Windows")) button=new WindowsButton();
		if(buttonType.equals("MAC"))button=new MacButton();
		return button;
	}
	static ITextbox createTextBox(String textboxType)
	{
		ITextbox textbox=null;
		if(textboxType.equals("Windows")) textbox=new WindowsTextBox();
		if(textboxType.equals("MAC"))textbox=new MacTextBox();
		return textbox;
	}
}

//client class
public class WithoutAbstactfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String buttonType=sc.nextLine();
		String textboxType=sc.nextLine();
		IButton button=Factory.createButton(buttonType);
		ITextbox textbox=Factory.createTextBox(textboxType);
		button.press();
		textbox.show();
;		
	}
	

}


//now we can group similar product family like macFacorty should produce macobjects and windowsfactory should  produce window related products

