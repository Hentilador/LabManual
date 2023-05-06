package com.example.geometry;

import java.math.*;

public class Circle {
	public Double area(Double radii) {
		Double area = Math.PI * Math.pow(radii,2);
		return area;
	}
	public Double circumference(Double radii) {
		Double circumference = 2 * Math.PI * radii;
		return circumference;
	}
}
