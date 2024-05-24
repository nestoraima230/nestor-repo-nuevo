package Model;

import java.math.BigDecimal;
import java.util.Date;

public class Tarifa {
    private int tarifaId;
    private Date fechaValidaInicial;
    private Date fechaValidaFinalizada;
    private BigDecimal costo;
    private int clienteId;


    public int getTarifaId() {
        return tarifaId;
    }

    public void setTarifaId(int tarifaId) {
        this.tarifaId = tarifaId;
    }

    public Date getFechaValidaInicial() {
        return fechaValidaInicial;
    }

    public void setFechaValidaInicial(Date fechaValidaInicial) {
        this.fechaValidaInicial = fechaValidaInicial;
    }

    public Date getFechaValidaFinalizada() {
        return fechaValidaFinalizada;
    }

    public void setFechaValidaFinalizada(Date fechaValidaFinalizada) {
        this.fechaValidaFinalizada = fechaValidaFinalizada;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}
