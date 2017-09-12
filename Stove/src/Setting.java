/**
 * Enum Setting
 */

/**
 * @author dwade
 *
 */
public enum Setting {

	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");

	private String value;
	
	Setting (String aVal)
	{
		value = aVal;
	}
	
	public String toString()
	{
		return value;
	}
	
};



