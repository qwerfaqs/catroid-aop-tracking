package seminario;


public aspect perthisAspect {
	String _state;

	perthisAspect() {
		System.out.println("Create New Instance Aspect");
	}

	pointcut pointBeforeMethod() : execution(void CurrentObject.Method(String, String));

	pointcut pointAfterMethod(CurrentObject obj) : execution(void CurrentObject.Method(String, String)) && this(obj);

	pointcut pointFunction(CurrentObject obj) : execution(* CurrentObject.Function()) && this(obj);

before() : pointBeforeMethod(){
		System.out.println("Before Methos");
	}

after(CurrentObject obj) : pointAfterMethod(obj){
		if (_state == null) {
			_state = obj.GetState();
		}
		System.out.println("Set State Aspect After Method. variable _state: " + _state + " obj.getState " + obj.GetState() + "\n");
	}

after(CurrentObject obj) : pointFunction(obj){
		System.out.println("Get State Aspect After Function. variable _state: " + _state + " obj.getState " + obj.GetState() + "\n");
	}
}
