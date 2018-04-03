package test;

import Demo.HelloPrx;
import Demo.HelloPrxHelper;
import Ice.StringHolder;

public class Client extends Ice.Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client app = new Client();
        int status = app.main("Client", args, "config/config.client");
        System.exit(status);
	}

	@Override
	public int run(String[] arg0) {
		// TODO Auto-generated method stub
		
		HelloPrx twoway = HelloPrxHelper.checkedCast(communicator().propertyToProxy("Hello.Proxy").ice_twoway().ice_secure(false));
        if(twoway == null)
        {
            System.err.println("invalid proxy");
            return 1;
        }
	    
        StringHolder text = new StringHolder();
	    twoway.sayHello("ZhouWei", text);
		
	    System.out.println("I got: " + text.value);
		return 0;
	}

}
