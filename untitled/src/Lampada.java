public class Lampada {

    int voltagem;
    String tipo;
    String modelo;


    public boolean acenderApagar(String ligar){
      if(ligar == "sim"){
          return true;
      }else {
          return false;
      }
    }

}
