package domain.cliente;

public enum TipoCliente {
    ATACADO("Atacado"),
    VAREJO("Varejo"),
    ;

    private final String tipoFormatado;

    TipoCliente(String tipoFormatado) {
        this.tipoFormatado = tipoFormatado;
    }

    public String getTipoFormatado() {
        return tipoFormatado;
    }
}
