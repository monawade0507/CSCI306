
public class Burner {

	public enum Temperature {
		BLAZING, HOT, WARM, COLD
	}

	Temperature myTemperature;

	public Temperature getMyTemperature() {
		return myTemperature;
	} 

	Setting mySetting; 

	int timer = 0; 

	public final static int TIME_DURATION = 2;  

	public Burner ()
	{
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
	}
	public void plusButton() {
		switch(mySetting)
		{
		case OFF:
			mySetting = Setting.LOW;
			break;
		case LOW:
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			mySetting = Setting.HIGH;
			break;
		default:
			break;

		}
	}

	public void minusButton() {
		switch(mySetting)
		{
		case HIGH:
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			mySetting = Setting.LOW;
			break;
		case LOW:
			mySetting = Setting.OFF;
			break;
		default:
			break;

		}
	}

	public void updateTemperature() {


			switch(mySetting) {

			case HIGH:
				myTemperature = Temperature.BLAZING; 
				break; 
			case MEDIUM: 
				myTemperature = Temperature.HOT; 
				break; 
			case LOW: 
				myTemperature = Temperature.WARM; 
				break; 
			case OFF: 
				myTemperature = Temperature.COLD; 

			}
		


	}


	
	public void display() {
		System.out.println("[" + mySetting + "]" + "...." + myTemperature);	

	}
	
	
}


