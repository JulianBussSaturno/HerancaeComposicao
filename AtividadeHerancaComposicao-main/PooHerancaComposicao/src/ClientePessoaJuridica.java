import java.util.Objects;

public class ClientePessoaJuridica extends Cliente{

    private String razãoSocial;
    private String fantasia;
    private final String cnpj;
    private final String dataRegistro;


    public ClientePessoaJuridica(String endereco, String dataCadastro, String razãoSocial, String fantasia, String cnpj, String dataRegistro) {
        super(endereco, dataCadastro);
        this.razãoSocial = razãoSocial;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        this.dataRegistro = dataRegistro;
    }

    public String getRazãoSocial() {
        return razãoSocial;
    }

    public void setRazãoSocial(String razãoSocial) {
        this.razãoSocial = razãoSocial;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "razãoSocial='" + razãoSocial + '\'' +
                ", fantasia='" + fantasia + '\'' +
                ", cnpj=" + cnpj +
                ", dataRegistro='" + dataRegistro + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientePessoaJuridica that = (ClientePessoaJuridica) o;
        return Objects.equals(razãoSocial, that.razãoSocial) && Objects.equals(fantasia, that.fantasia) && Objects.equals(cnpj, that.cnpj) && Objects.equals(dataRegistro, that.dataRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), razãoSocial, fantasia, cnpj, dataRegistro);
    }
}
