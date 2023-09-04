package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.Reserva;
import com.example.demo.repository.modelo.dto.ClienteVipDTO;
import com.example.demo.repository.modelo.dto.ReservaDTO;
import com.example.demo.repository.modelo.dto.VehiculoVipDTO;

public interface IReservaRepository {
	public void insertar(Reserva reserva);
	public Reserva seleccionarPorId(Integer id);
	public void actualizar(Reserva reserva);
	public void eliminar(Integer id);
	public List<Reserva> seleccionarListaPorPlacaV(String placa);
    public Reserva seleccionarPorNoReserva(String numeroReserva);
	public List<ReservaDTO> seleccionarListaPorFechas(LocalDate fechaInicio, LocalDate fechaFin);
	public List<ClienteVipDTO> seleccionarListaClientesVIPOrdenados();
	public List<VehiculoVipDTO> seleccionarListaVehiculosMesAnio(int mesSeleccionado,int anioSeleccionado);
	
}
