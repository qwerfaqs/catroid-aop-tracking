package seminario;

public class CurrentObject {
	private String _name;
	private String _state;

	public void Method(String name, String state) {
		_name = name;
		_state = state;
		System.out.println("Execute " + name + ".Method");
	}

	public void SetState(String state) {
		_state = state;
	}

	public String GetState() {
		return _state;
	}

	public String Function() {
		System.out.println("Execute " + _name + ".Function");
		return _state;
	}
}
