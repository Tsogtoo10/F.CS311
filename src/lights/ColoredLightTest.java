package lights;
import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ColoredLightTest {

	@Test public void makeColor() {
		ColoredLight coloredLight = new ColoredLight(null);
		double t = coloredLight.e;
		double k = coloredLight.r;
		double m = coloredLight.w;
		Assert.assertNotNull(Color.getHSBColor((float)t, (float)k, (float)m));
	}
	
	@Test public void makeNotColor() {
		ColoredLight coloredLight = new ColoredLight(null);
		
		Assert.assertNull(coloredLight.getColor());
	}

	@Test public void turnColor() {
		ColoredLight coloredLight = new ColoredLight(null);
		double t = coloredLight.e;
		double k = coloredLight.r;
		double m = coloredLight.w;
		coloredLight.setColor(Color.getHSBColor((float)t, (float)k, (float)m));
		
		Assert.assertNotNull(coloredLight.getColor());
	}
	
	@Test public void turnNotColor() {
		ColoredLight coloredLight = new ColoredLight(null);
		double t = coloredLight.e;
		double k = coloredLight.r;
		double m = coloredLight.w;
		ColoredLight col = new ColoredLight(Color.getHSBColor((float)t, (float)k, (float)m));
		col.setColor(null);
		
		Assert.assertNull(col.getColor());
	}
	
	
	@Test public void testRandomChange() {
		ColoredLight coloredLight = new ColoredLight(null);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		Color ColorChanged = null;
		double t = coloredLight.e;
		double k = coloredLight.r;
		double m = coloredLight.w;
		for (int i = 0; i < 100; i++) {
			coloredLight.randomChange();
			if (coloredLight.getColor() == Color.getHSBColor((float)t, (float)k, (float)m)) {
				ColorChanged = Color.getHSBColor((float)t, (float)k, (float)m);
				break;
			}
		}
		Assert.assertNotEquals(ColorChanged,  Color.getHSBColor((float)t, (float)k, (float)m));
		coloredLight = new ColoredLight(Color.getHSBColor((float)t, (float)k, (float)m));
		ColorChanged = null;
		for(int i = 0; i < 100; i++) {
			coloredLight.randomChange();
			if(coloredLight.getColor() != Color.getHSBColor((float)t, (float)k, (float)m)) {
				ColorChanged = Color.getHSBColor((float)t, (float)k, (float)m);
				break;
			}
		}
		Assert.assertEquals(ColorChanged, Color.getHSBColor((float)t, (float)k, (float)m));
	}
	
}