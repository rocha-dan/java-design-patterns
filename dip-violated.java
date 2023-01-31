public class Motorista {
    private Veiculo veiculo;
    
    public Motorista(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public void dirigir() {
        veiculo.acelerar();
        veiculo.frear();
        veiculo.mudarDirecao();
    }
}

public class Veiculo {
    public void acelerar() {
        // Implementação de acelerar
    }
    
    public void frear() {
        // Implementação de frear
    }
    
    public void mudarDirecao() {
        // Implementação de mudar direção
    }
}
