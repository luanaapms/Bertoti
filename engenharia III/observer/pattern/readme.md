## Exemplo prático — Pizzaria:
Imagine uma pizzaria com um sistema de acompanhamento de pedidos. Quando o status do pedido muda — por exemplo, de “em preparo” para “saiu para entrega” — o sistema notifica automaticamente todos os observadores registrados: <br>
- O entregador é informado de que o pedido está pronto para retirada. <br>
- A pizzaria marca o pedido como entregue. <br>
Assim, todos ficam sincronizados sem depender diretamente uns dos outros, promovendo baixo acoplamento e alta flexibilidade no sistema.

### Diagrama UML
<img src="/img/eng3/Observer - Pattern.drawio.png" height="360">