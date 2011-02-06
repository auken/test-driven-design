package dk.aukenit.tdd.agilencr2011;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoutesViewTest {
	@Test
	public void routeHasDriverWithName() {
		Route route = new Route(new Driver("Vinod Kumar"));
		assertEquals("Vinod Kumar", route.getDriverName());
	}
}
