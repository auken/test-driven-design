package dk.aukenit.tdd.agilencr2011;

public class Route {
	
	private final Driver driver;

	public Route(Driver driver) {
		this.driver = driver;
	}

	public String getDriverName() {
		return driver.getName();
	}

}
