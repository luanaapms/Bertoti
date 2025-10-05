## Exemplo prático — Executor de Tarefas:
Imagine que você tenha um sistema responsável por executar diferentes tipos de tarefas em uma empresa — como enviar e-mails ou organizar documentos. <br>
- Cada tipo de tarefa implementa a interface Tarefa, que define o método executar(). <br>
- As classes TarefaEmails e TarefaDocumentos representam estratégias diferentes de execução. <br>
- A classe ExecutorDeTarefas é o contexto: ela não sabe qual tarefa será executada, apenas chama o método executar() da estratégia definida. <br>
Isso torna o sistema flexível, reutilizável e de fácil manutenção, pois novas tarefas podem ser adicionadas facilmente, bastando criar novas classes que implementem a interface Tarefa.

### Diagrama UML
<img src="/img/eng3/Strategy - Pattern.drawio.png" height="360">