package org.apache.solomax;

import net.fortuna.ical4j.model.TimeZoneRegistry;
import net.fortuna.ical4j.model.TimeZoneRegistryFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static final TimeZoneRegistry TZ_REGISTRY = TimeZoneRegistryFactory.getInstance().createRegistry();

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
