import java.time.LocalDateTime;
import java.util.Objects;

public class Orcamento extends Documento{

    private String dataValidade;

    public Orcamento(String dataEmissao, String tipo, Double valorTotal, Boolean emitido, String cliente, String enderecoEntrega, String dataValidade) {
        super(dataEmissao, tipo, valorTotal, emitido, cliente, enderecoEntrega);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Orcamento orcamento = (Orcamento) o;
        return Objects.equals(dataValidade, orcamento.dataValidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dataValidade);
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "dataValidade='" + dataValidade + '\'' +
                '}';
    }

    public void EmitirOrcamento(){
            System.out.println("Orçamento emitido");
    }

}
