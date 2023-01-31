public interface Direcao {
    void acelerar();
    void frear();
    void mudarDirecao();
}

public class Motorista {
    private Direcao direcao;
    
    public Motorista(Direcao direcao) {
        this.direcao = direcao;
    }
    
    public void dirigir() {
        direcao.acelerar();
        direcao.frear();
        direcao.mudarDirecao();
    }
}

public class Veiculo implements Direcao {
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
