package ntou.cs.calculator;

public class TrigonometricFunctions {
	public String sin(double opposite, double hypotenuse) {
		if(opposite / hypotenuse >= -1 && opposite / hypotenuse <= 1)
			return String.valueOf(opposite / hypotenuse);
		else return "Error!";
	}
	public String cos(double adjacent, double hypotenuse) {
		if(adjacent / hypotenuse >= -1 && adjacent / hypotenuse <= 1)
			return String.valueOf(adjacent / hypotenuse);
		else return "Error!";
	}
	public String tan(double sin, double cos) {
		if(sin / cos >= -1 && sin / cos <= 1)
			return String.valueOf(sin / cos);
		else if(cos == 0.0d)
			return "Not defined";
		else return "Error!";
	}
}
