import java.util.Objects;

public class Documento {

    private final String dataEmissao;
    private String tipo;
    private Double valorTotal;
    private Boolean emitido = false;
    private String Cliente;
    private String enderecoEntrega;

    public Documento(String dataEmissao, String tipo, Double valorTotal, Boolean emitido, String cliente, String enderecoEntrega) {
        this.dataEmissao = dataEmissao;
        this.tipo = tipo;
        this.valorTotal = valorTotal;
        this.emitido = emitido;
        Cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Boolean getEmitido() {
        return emitido;
    }

    public void setEmitido(Boolean emitido) {
        this.emitido = emitido;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documento documento = (Documento) o;
        return Objects.equals(dataEmissao, documento.dataEmissao) && Objects.equals(tipo, documento.tipo) && Objects.equals(valorTotal, documento.valorTotal) && Objects.equals(emitido, documento.emitido) && Objects.equals(Cliente, documento.Cliente) && Objects.equals(enderecoEntrega, documento.enderecoEntrega);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataEmissao, tipo, valorTotal, emitido, Cliente, enderecoEntrega);
    }

    @Override
    public String toString() {
        return "Documento{" +
                "dataEmissao='" + dataEmissao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valorTotal=" + valorTotal +
                ", emitido=" + emitido +
                ", Cliente='" + Cliente + '\'' +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                '}';
    }

    public void EmitirDocumento(){
        System.out.println("Documento emitido");
    }
}
