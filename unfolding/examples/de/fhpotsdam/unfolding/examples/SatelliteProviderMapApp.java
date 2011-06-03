package de.fhpotsdam.unfolding.examples;

import processing.core.PApplet;
import codeanticode.glgraphics.GLConstants;
import de.fhpotsdam.unfolding.Map;
import de.fhpotsdam.unfolding.providers.Microsoft;

public class SatelliteProviderMapApp extends PApplet {

	Map map;

	public void setup() {
		size(800, 600, GLConstants.GLGRAPHICS);

		map = new Map(this, 0, 0, width, height, new Microsoft.AerialProvider());
	}

	public void draw() {
		background(0);
		
		map.draw();
	}

}