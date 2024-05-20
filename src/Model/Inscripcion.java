package Model;

import java.util.Date;

public class Inscripcion {
    private int id;
    private int clienteId;
    private int claseImpartidaId;
    private Date fechaInscripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
