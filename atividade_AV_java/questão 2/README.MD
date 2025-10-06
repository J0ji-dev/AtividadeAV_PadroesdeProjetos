# Justificativa da Questão 2

## Factory Method (de novo!)

Escolhi o **Factory Method** de novo porque ele resolve exatamente o problema que a questão pede:

**O que a questão pede:**
- "Instanciar dinamicamente o processador correspondente"
- "Sem que o código principal precise conhecer detalhes da criação"

**O Factory Method faz isso direitinho:**
>> Esconde a complexidade de criar cada meio de pagamento  
>> O código main só pede "me dá um pix" e a factory cuida do resto  
>> Se surgir um novo meio (como TED ou débito), é só adicionar na factory  

**Por que não outros patterns:**
- **Abstract Factory**: Seria exagero, não temos famílias de objetos relacionados
- **Strategy**: É mais pra quando você quer trocar algoritmos, não criar objetos
- **Singleton**: Cada pagamento é uma instância nova, não queremos só uma

**Resumindo:** Factory Method é o cara pra criar objetos quando você quer que o código cliente não precise saber como eles são feitos! 