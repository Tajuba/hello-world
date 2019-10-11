
public class Carro{

  public String Marca;
  public String Modelo;
  public Date ano;
  
  public void andar(){
    viraChave();
    System.out.println("Carro andando");
  }
  
  public void viraChave(){
    System.out.println("Virando chaves...");
  }
  
}
