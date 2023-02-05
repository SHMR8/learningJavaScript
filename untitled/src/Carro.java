public class Carro {

    public String marca;
    public String modelo;
    public int numDePassageiros;
    public double capCombustivel;
    public double consumoCombustivel;

    void exibirDados(){
      System.out.println("o carro é um: "+marca+" modelo: "+modelo+".");
    }

    double exibirAutonomia(){
        return capCombustivel*consumoCombustivel;
    }

    double calcularConsumo (int km){
        return consumoCombustivel*km;
    }
}
