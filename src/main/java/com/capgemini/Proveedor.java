package com.capgemini;

public class Proveedor {
	private String[] productos;

	//@Overload sobre el metodo BUSCAR
	public boolean buscar(Object o) {
		if (o instanceof Integer) {
			System.out.println("estoy buscando x cantidad");
			return buscar((Integer) o);
		}
		if (o instanceof String) {
			System.out.println("estoy buscando x nombre");
			return buscar((String) o);
		}
		if (o.equals(null)) {
			return buscar();
		}
		return false;
	}

	public boolean buscar() {
		System.out.println("estoy buscando todo");
		return true;
	}

	public boolean buscar(String nombre) {
		if (nombre == null) {
			System.out.println("estoy buscando nombre NULL ");
			return false;
		}
		System.out.println("estoy buscando x nombre");
		return true;
	}

	public boolean buscar(int cantidad) {
		if (cantidad < 0) {
			System.out.println("estoy buscando x cantidad NEGATIVA");
			return false;
		}
		System.out.println("estoy buscando x cantidad");
		return true;
	}

	public boolean buscar(String nombre, int cantidad) {
		if (nombre == null && cantidad != 0) {
			System.out.println("estoy buscando nombre NULL y cantidad en cero");
			return false;
		}
		System.out.println("estoy buscando nombre y x cantidad");
		return true;
	}
}