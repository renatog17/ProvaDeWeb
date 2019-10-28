package br.ucsal.lamis.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
	
	private Integer id;
	private Laboratorio laboratorio;
	private LocalDate diaDaReserva;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private String objetivo;
	private String descricao;
	private Usuario usuario;
	
	
	//TODO COLOQUE OS ATRIBUTOS AQUI

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public LocalDate getDiaDaReserva() {
		return diaDaReserva;
	}

	public void setDiaDaReserva(LocalDate diaDaReserva) {
		this.diaDaReserva = diaDaReserva;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
