package antipattern.src;

public class Main {
    public static void main(String[] args) {
        AppCelular app = new AppCelular();
        PainelDigital painel = new PainelDigital();

        EstacaoMeteorologica estacao = new EstacaoMeteorologica(app, painel);
        estacao.setTemperatura(28.4);
    }
}