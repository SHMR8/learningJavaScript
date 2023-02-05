
public class Main {
    public static void main(String[] args) {

    Lampada luz = new Lampada();
    luz.modelo = "De sala";
    luz.tipo = "Das grandes";
    luz.voltagem= 220;
    boolean satus = luz.acenderApagar("sm");

    if (satus){
        System.out.println("Luz acesa papae!");
    }else {
        System.out.println("Apagada!");
    }
    }
}