package com.example.demo;

public class GatoHello extends Ola {

	@Override
	public void chamar() {
		System.out.println("chamou!!");
		
	}

	@Override
	public double getBonificacao() {
		System.out.println("chamou bonificacao!!");
		return 0;
	}

}
