public interface Veiculo {
  public double calcular();
}
//-----
public class Carro implements Veiculo {
  @Override
  public double calcular() {
    return this.getValue() * 0.8;
  }
}
//-----
public class Bicicleta implements Veiculo{
  @Override
  public double calcular() {
    return this.getValue() * 0.9;
  }
}

//----
Veiculo a = new Bicicleta();
a.calcular();

Veiculo b = new Caminhao();
b.calcular();