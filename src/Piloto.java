public class Piloto {
    String nome;
    String CPF;
    int numeroAnac;

    String clima_viagem;

    public Piloto() {
    }
    public String pilotar(){  return "pilotando";}



    public Piloto(String nome, String CPF, int numeroAnac){
        this.nome = "Matheus";
        this.CPF = "12345678912";
        this.numeroAnac= 001;

    }
    public Piloto(String clima_viagem){
        this.clima_viagem = "bom";
    }


}