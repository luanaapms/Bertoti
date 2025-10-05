## Exemplo prático — Sistema de Monitoramento de Clima:
Imagine uma estação meteorológica que precisa informar a temperatura atual para diferentes componentes, como um aplicativo de celular, um painel digital e um serviço de alerta de emergência. <br>
- A EstacaoMeteorologica depende diretamente das classes AppCelular e PainelDigital. <br>
- Se for adicionado um novo componente (ex: SiteMeteorologico), é preciso alterar o código da estação. <br>
- Há alto acoplamento e baixa flexibilidade.

### Diagrama UML
<img src="/img/eng3/Observer - AntiPattern.drawio.png" height="360">