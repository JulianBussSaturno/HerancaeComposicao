import java.util.Objects;

public class NotaFiscal extends Documento{

    private Double valorImpostos;

    public NotaFiscal(String dataEmissao, String tipo, Double valorTotal, Boolean emitido, String cliente, String enderecoEntrega, Double valorImpostos) {
        super(dataEmissao, tipo, valorTotal, emitido, cliente, enderecoEntrega);
        this.valorImpostos = valorImpostos;
    }

    public Double getValorImpostos() {
        return valorImpostos;
    }

    public void setValorImpostos(Double valorImpostos) {
        this.valorImpostos = valorImpostos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotaFiscal that = (NotaFiscal) o;
        return Objects.equals(valorImpostos, that.valorImpostos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), valorImpostos);
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "valorImpostos=" + valorImpostos +
                '}';
    }

    public void EmitirNotaFiscal(){
        if (valorImpostos > 0){
            System.out.println("Nota Fiscal emitida");
        }
    }
}
