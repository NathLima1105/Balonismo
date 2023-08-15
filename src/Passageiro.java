public class Passageiro {
    String nome;
    String termo_risco;
    String CPF;
    String RG;
    String telefone;
    String tel_emergencia;

    int avaliacao;

    public static void main(String[] args) {
        System.out.println();
    }

    public Passageiro() {
    }

    public String passeando() {
        return "passeando";

    }

    public Passageiro(String nome, String CPF, String termo_risco, String RG, String telefone, String tel_emergencia) {
        this.nome = "Matheus";
        this.CPF = "12345678912";
        this.termo_risco = "sim";
        this.RG = "12345678901";
        this.telefone = "(45)762455688";
        this.tel_emergencia = "(45)456784553";

    }

    public Passageiro(int avaliacao) {
        this.avaliacao = 10;
    }
}