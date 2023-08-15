public class Balao {
    // Atributos
    int id;
    String registro;
    String cor;
    String tipo;
    int capacidade;
    double altura;
    double porte;
    double peso;




    // Métodos


    public Balao(){
    }

    public String voar(){
        return "voando";
    }


    public Balao(String registro, String cor, String tipo,int capacidade, double altura, double porte, double peso){
        this.registro = "Matheus";
        this.cor = "12345678912";
        this.tipo= "sim";
        this.capacidade = 5;
        this.altura=20000;
        this.porte = 10;
        this.peso= 570;

    }
    public Balao(int id){
        this.id = 234535679;
    }
}
