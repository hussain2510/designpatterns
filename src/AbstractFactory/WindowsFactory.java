package AbstractFactory;

public class WindowsFactory implements OperatingSystemFactory{

	@Override
	public IButton createbutton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public ITextbox createtextbox() {
		// TODO Auto-generated method stub
		return new WindowsTextBox();
	}

}
