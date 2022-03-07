package com.assigment.demo2;
import org.springframework.stereotype.Component;


@Component
public class Color {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Color(String color) {
		super();
		this.color = color;
	}

	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Color [color=" + color + "]";
	}
	
	

}
