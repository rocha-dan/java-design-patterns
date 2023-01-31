public interface VeiculoSimples {
    void dirigir();
    void parar();

}
public interface VeiculoEletrico {
    void reabastecer();
    void abrirPortas();
}
public class Bicicleta implements VeiculoSimples {

    // Podems ser implementados
    public void dirigir() {...}
    public void parar() {...}
    
}

public class Carro implements VeiculoSimples, VeiculoEletrico {

    // Podems ser implementados
   public void reabastecer();
   public void abrirPortas();
    
}