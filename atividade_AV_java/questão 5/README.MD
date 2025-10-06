# Justificativa da Questão 5

## Prototype Pattern

Escolhi o **Prototype** porque ele é perfeito para criar cópias de objetos complexos sem precisar refazer tudo do zero.

**Pensei assim:**
- Tenho modelos de documentos que são complexos (muita estrutura interna)
- Não quero recriar toda a estrutura cada vez que um cliente pede
- Quero "copiar e colar" o modelo base e só mudar o que é diferente
- Preciso que o original fique intacto para outros clientes

**O Prototype resolve exatamente isso:**
>> Cria cópias exatas de objetos complexos rapidamente  
>> Mantém o modelo original seguro e não modificado  
>> Personalização fácil só mudando o necessário  
>> Economiza tempo - não precisa reconstruir toda a estrutura  

**Por que não outros patterns:**
- **Factory Method**: É pra criar objetos novos, não copiar existentes
- **Singleton**: Só teria uma instância, mas precisamos de várias cópias
- **Decorator**: Adiciona funcionalidades, não cria cópias independentes

**Resumindo:** Prototype é como uma fotocopiadora de objetos - você pega o original, faz uma cópia e personaliza só o necessário.

**Exemplo prático:** 
Modelo de currículo → Clonar → Personalizar cores/fontes → Pronto para João Silva!