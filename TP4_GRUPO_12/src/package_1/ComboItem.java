package package_1;

public class ComboItem {
	
	private String key;
	private String value;
	
	public ComboItem(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
		
}
