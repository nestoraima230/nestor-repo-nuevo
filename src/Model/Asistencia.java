package Model;

import java.util.Date;

public class Asistencia {
    private int clienteId;
    private int claseImpartidaId;
    private Date fechaAsistencia;
    private String horaEntrada;
    private String horaSalida;


    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getClaseImpartidaId() {
        return claseImpartidaId;
    }

    public void setClaseImpartidaId(int claseImpartidaId) {
        this.claseImpartidaId = claseImpartidaId;
    }

    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(Date fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
}