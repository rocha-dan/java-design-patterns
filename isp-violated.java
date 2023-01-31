public interface Veiculo {
    void dirigir();
    void parar();
    void reabastecer();
    void abrirPortas();
}


public class Bicicleta implements Veiculo {

    // Podems ser implementados
    public void dirigir() {...}
    public void parar() {...}
    
    // Não podem ser implementados
    public void abrirPortas() {...}
    public void reabastecer() {...}
}