package craft.calculater;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class calculator implements Icalculator {
	
	@WebMethod
	@Override
	public int sum(int param1, int param2) {
		// TODO Auto-generated method stub
		return param1 + param2;
	}
	
	@WebMethod
	@Override
	public int mul(int param1, int param2) {
		// TODO Auto-generated method stub
		return param1 * param2;
	}
	
	@WebMethod
	@Override
	public int sub(int param1, int param2) {
		// TODO Auto-generated method stub
		return param1 - param2;
	}
	
	@WebMethod
	@Override
	public int div(int param1, int param2) {
		// TODO Auto-generated method stub
		return param1 / param2;
	}

}
