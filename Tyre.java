package com.assigment.demo2;
import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String tyre;

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public Tyre(String tyre) {
		super();
		this.tyre = tyre;
	}

	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tyre [tyre=" + tyre + "]";
	}
	

}
