
public class Main {
    public static void main(String[] args) {

    Carro car = new Carro();

    car.marca = "Porsche";
    car.modelo="Cayenne";
    car.capCombustivel = 50.0;
    car.consumoCombustivel= 3.0;

    car.exibirDados();


    System.out.println("A autonomia deste carro é: " + car.exibirAutonomia()+".");

    System.out.println("Para andar 10km ele gastará: "+car.calcularConsumo(10)+"Litros de gasosa.");
    }
}