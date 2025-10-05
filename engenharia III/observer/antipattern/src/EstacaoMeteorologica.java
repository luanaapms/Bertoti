package antipattern.src;

public class EstacaoMeteorologica {
    private double temperatura;
    private AppCelular appCelular;
    private PainelDigital painelDigital;

    public EstacaoMeteorologica(AppCelular app, PainelDigital painel) {
        this.appCelular = app;
        this.painelDigital = painel;
    }

    public void setTemperatura(double novaTemp) {
    this.temperatura = novaTemp;
    appCelular.exibirTemperatura(this.temperatura);
    painelDigital.exibirTemperatura(this.temperatura);
}
}