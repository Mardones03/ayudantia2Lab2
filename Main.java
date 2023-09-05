package Ayudantia2Lab2;

import java.util.ArrayList;

public class Main {
	private ArrayList<Empleado> empleados;

	public Main(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Empleado> mostrarEmpleados() {
		return empleados;
	}

	public String mostrarSalarios() {
		StringBuilder result = new StringBuilder();
		for (Empleado empleado : empleados) {
			result.append("Empleado: ").append(empleado.getNombre())
					.append(", Tipo: ").append(empleado.getTipo())
					.append(", Salario: ").append(empleado.calcularSalario())
					.append("\n");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Empleado empleadoAsalariado1 = new EmpleadoAsalariado("Alejandro", "650000");
		Empleado empleadoAsalariado = new EmpleadoAsalariado("Sandra", "600000");
		Empleado empleadoPorHoras = new EmpleadoPorHoras("Jovian", "1000", 38, 12000);

		ArrayList<Empleado> empleados = new ArrayList<>();
		empleados.add(empleadoAsalariado1);
		empleados.add(empleadoAsalariado);
		empleados.add(empleadoPorHoras);

		Main empresa = new Main(empleados);

		ArrayList<Empleado> listaEmpleados = empresa.mostrarEmpleados();
		System.out.println("Lista de Empleados:");
		for (Empleado empleado : listaEmpleados) {
			System.out.println("Nombre: " + empleado.getNombre());
			System.out.println("Tipo: " + empleado.getTipo());
			System.out.println("Salario: " + empleado.calcularSalario());
			System.out.println(" ");
		}
	}
}