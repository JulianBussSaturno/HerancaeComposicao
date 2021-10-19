public class Main {

    public static void main(String[] args) {

        var clientePessoaFisica = new ClientePessoaFisica("Jucundino Rodrigues", "17/10/2021", "Douglas", "26/04/2001", "452.554.789-33");
        var clientePessoaJuridica = new ClientePessoaJuridica("Jucundino Rodrigues", "17/10/2021", "Empresa", "Isso é uma Empresa", "46454533154", "17/10/2021");
        var notaFiscal = new NotaFiscal("17/10/2021", "nota", 1000.00, true, "nome", "Jucundino Rodrigues", 100.00);
        var orcamento = new Orcamento("17/10/2021", "pedido", 2000.00, true, "nome", "Jucundino Rodrigues", "18/10/2021");

        System.out.println(clientePessoaFisica);
        System.out.println(clientePessoaJuridica);
        System.out.println(notaFiscal);
        System.out.println(orcamento);

        notaFiscal.EmitirNotaFiscal();
        orcamento.EmitirOrcamento();
    }
}
