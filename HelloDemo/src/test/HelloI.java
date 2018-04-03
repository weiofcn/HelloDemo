package test;

import Demo._HelloDisp;
import Ice.Current;
import Ice.StringHolder;

public class HelloI extends _HelloDisp{

	@Override
	public void sayHello(String name, StringHolder text, Current __current) {
		// TODO Auto-generated method stub
		text.value = new String("Hello "+ name + "!");
	}

}
