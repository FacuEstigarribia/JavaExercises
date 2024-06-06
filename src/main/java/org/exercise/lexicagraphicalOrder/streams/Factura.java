package org.exercise.lexicagraphicalOrder.streams;

public class Factura {

    private String concepto;
    private Integer importe;

    public Factura(String concepto, Integer importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public Integer getImporte() {
        return importe;
    }
}
