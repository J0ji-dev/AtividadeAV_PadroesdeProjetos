# Justificativa da Questão 4

## Decorator Pattern

Escolhi o **Decorator** porque ele é perfeito para adicionar funcionalidades de forma flexível sem mexer no código original.

**Pensei assim:**
- Tenho um relatório básico (o "core")
- Quero poder adicionar "enfeites" (estatísticas, gráficos, PDF) 
- Mas não quero modificar a classe original do relatório
- Quero que essas funcionalidades sejam opcionais e combináveis

**O Decorator resolve exatamente isso:**
>>Adiciona funcionalidades sem alterar código existente  
>>Funcionalidades são opcionais e combináveis  
>>Posso "embrulhar" o relatório em várias camadas  
>>Respeita o princípio Open/Closed - aberto para extensão, fechado para modificação

**Por que não outros patterns:**
- **Factory Method**: É pra criação, não pra adicionar comportamentos
- **Strategy**: Troca algoritmos completos, não adiciona funcionalidades
- **Observer**: É pra notificação, não pra extensão de funcionalidades

**Resumindo:** Decorator é como uma cebola - você vai adicionando camadas sem estragar o principal.

**Exemplo prático:** 
Relatório básico → + estatísticas → + gráficos → + PDF = Relatório completo!