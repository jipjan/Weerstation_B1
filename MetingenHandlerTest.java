import static org.junit.Assert.*;

import org.junit.Test;

public class MetingenHandlerTest {

	@Test
	public void testLuchtdruk() {
		assertEquals(1018.76d, MetingenHandler.luchtdruk((short) 30084), 1);
	}

	@Test
	public void testTemperatuur() {
		assertEquals(24.61, MetingenHandler.temperatuur((short) 763), .1);
	}

	@Test
	public void testLuchtVochtigheid() {
		assertEquals(50, MetingenHandler.luchtVochtigheid((short) 50), 0);
	}

	@Test
	public void testWindSnelheid() {
		assertEquals(22.53, MetingenHandler.windSnelheid((short) 14), .1);
	}

	@Test
	public void testWindRichting() {
		assertEquals(50, MetingenHandler.windRichting((short) 50), 0);
	}

	@Test
	public void testRegenmeter() {
		assertEquals(.6, MetingenHandler.regenmeter((short) 3), .1);
	}

	@Test
	public void testUvIndex() {
		assertEquals(6.6, MetingenHandler.uvIndex((short) 66), 1);
	}

	@Test
	public void testBatterySpanning() {
		assertEquals(1.13, MetingenHandler.batterySpanning((short) 193), .1);
	}

	@Test
	public void testSunRiseSet() {
		assertEquals("05:26", MetingenHandler.sunRise((short) 526));
	}
}
