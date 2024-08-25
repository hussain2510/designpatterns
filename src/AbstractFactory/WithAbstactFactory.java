package AbstractFactory;

import java.util.Scanner;

//requirement
//we are grouping similar products into one family factory and that factory is only responsible for creating that type of products only

//it will return specific factory which will actually create the object which belongs to a particular family

//client want button and textbox of type windows and mac so we can group windows products in one factory and mac products in one factory
class GUIFactory{
	static OperatingSystemFactory getFactory(String factoryType)
	{
		OperatingSystemFactory factory=null;
		if(factoryType.equals("Windows"))factory= new WindowsFactory();
		if(factoryType.equals("MAC")) factory= new MACFactory();
		return factory;
	}
}


public class WithAbstactFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the os type");
		String osType=sc.nextLine();
		OperatingSystemFactory factory=GUIFactory.getFactory(osType);
		
		IButton button=factory.createbutton();
		ITextbox textbox=factory.createtextbox();
		button.press();
		textbox.show();

	}

}
