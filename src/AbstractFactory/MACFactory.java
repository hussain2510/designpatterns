package AbstractFactory;

public class MACFactory implements OperatingSystemFactory{
	
	@Override
	public IButton createbutton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}
	@Override
	public ITextbox createtextbox() {
		// TODO Auto-generated method stub
		return new MacTextBox();
	}
}
