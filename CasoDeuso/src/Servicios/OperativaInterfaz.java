package Servicios;

import java.util.List;

import Dtos.EsclavoDto;
import Dtos.PacienteDto;

public interface OperativaInterfaz 
{
	public void crearPaciente(List<PacienteDto> listaPacientes, List<EsclavoDto> listaEsclavos);
}
