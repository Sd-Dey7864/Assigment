package com.assigment.demo2;
import org.springframework.stereotype.Component;

@Component
public class Car {
		
		private String brand;

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public Car(String brand) {
			super();
			this.brand = brand;
		}

		public Car() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Car [brand=" + brand + "]";
		}
		
	
	
	
	

}
