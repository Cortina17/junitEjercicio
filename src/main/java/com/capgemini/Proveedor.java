package com.capgemini;

public class Proveedor {
	private String[] productos;

	// @Overload sobre el metodo BUSCAR
	public void buscar(Object o) {
		if (o instanceof Integer) {
			System.out.println("estoy buscando x cantidad");
		}
		if (o instanceof String) {
			System.out.println("estoy buscando x nombre");
		}
		if (o.equals(null)) {
			System.out.println("estoy buscando todo");
		}
	}

	public void buscar() {
		System.out.println("estoy buscando todo");
	}

	public void buscar(String nombre) {
		System.out.println("estoy buscando x nombre");
	}

	public void buscar(int cantidad) {
		System.out.println("estoy buscando x cantidad");
	}

	public void buscar(String nombre, int cantidad) {
		System.out.println("estoy buscando nombre y x cantidad");
	}
}