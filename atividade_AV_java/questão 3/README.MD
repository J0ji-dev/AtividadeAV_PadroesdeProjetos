# Justificativa da Questão 3

## Observer Pattern

Escolhi o **Observer** porque ele é perfeito para situações onde um objeto (o site) precisa avisar(notificar) vários outros objetos (leitores) quando algo importante acontece.

**Pensei assim:**
- O site é o "assunto principal" (Subject)
- Os leitores são "observadores" que querem saber das novidades
- Quando uma notícia nova chega, o site avisa todo mundo automaticamente

**O Observer resolve exatamente o que a questão pede:**
>> Notificação automática para todos os interessados  
>> Não precisa controlar manualmente quem deve ser avisado  
>> Leitores podem se inscrever em múltiplos tópicos  
>> Fácil adicionar/remover leitores sem mexer no código do site  

**Por que não outros patterns:**
- **Factory Method**: É pra criação de objetos, não pra notificação
- **Singleton**: O site poderia ser, mas o foco aqui é a comunicação
- **Decorator**: Pra adicionar funcionalidades, não pra sistema de notificações

**Resumindo:** Observer é o pattern ideal quando você tem um "fazedor de eventos" e vários "interessados nos eventos"! 