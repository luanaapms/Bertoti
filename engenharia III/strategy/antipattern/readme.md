## Exemplo prático — Sistema de Pagamento:
Imagine um sistema que processa pagamentos.
O desenvolvedor, em vez de usar Strategy, cria subclasses diferentes para cada tipo de pagamento: <br>
- Pagamento: classe base <br>
- PagamentoCartao: sobrescreve método para pagar com cartão <br>
- PagamentoPIX: sobrescreve método para pagar via PIX <br>
O problema: cada vez que surge um novo tipo de pagamento, precisamos criar uma nova subclasse, aumentando a hierarquia.

### Diagrama UML
<img src="/img/eng3/Strategy - AntiPattern.drawio.png" height="360">