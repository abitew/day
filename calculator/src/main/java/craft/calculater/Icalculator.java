package craft.calculater;

import javax.jws.WebService;

@WebService
public interface Icalculator {



public int sum(int param1, int param2);
public int mul(int param1, int param2);

public int sub(int param1, int param2);
public int div(int param1, int param2);

}