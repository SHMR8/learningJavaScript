
public class Main {
    public static void main(String[] args) {

         String marca="Ferrari";
         String modelo="Berlinetta";
         int velocidadeMaxima=550;
         int ano=2024;

         Carro minhaFerrari = new Carro(marca,modelo,velocidadeMaxima,ano);

        System.out.println("A marca do carro é : "+minhaFerrari.marca);
   }
}

