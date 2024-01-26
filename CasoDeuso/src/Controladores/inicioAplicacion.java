package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

public class inicioAplicacion 
{

	public static void main(String[] args) {
		
		List<PacienteDto> listaPacientes = new ArrayList<PacienteDto>();
		//ArrayList<PacienteDto> arrayListPaciente = new ArrayList<PacienteDto>();
		//PacienteDto[] arrayPaciente = new PacienteDto[100];
		List<EsclavoDto> listaEsclavos = new ArrayList<EsclavoDto>();
		
		OperativaInterfaz alpha = new OperativaImplementacion();
		alpha.crearPaciente(listaPacientes, listaEsclavos);
		for(PacienteDto paciente : listaPacientes) {
			System.out.println(paciente.toString());
		}
		for(EsclavoDto esclavo : listaEsclavos) {
			System.out.println(esclavo.toString());
		}

	}

}
