public class Main {

    public static void main(String[] args){
        // Contruir balões
        Piloto p1 = new Piloto();
        String pilota = p1.pilotar();
        System.out.println(pilota);

        Passageiro g1 = new Passageiro();
        String passeia = g1.passeando();
        System.out.println(passeia);


        Balao b1 = new Balao();
        String resultado = b1.voar();
        System.out.println(resultado);

    }

}