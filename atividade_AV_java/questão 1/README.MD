# Sistema de Cálculo de Tarifas

## Padrão Utilizado: Factory Method

### Justificativa:
Ele é perfeito para quando a gente tem vários tipos de objetos que fazem a mesma coisa (no caso, calcular tarifa), mas cada um faz do seu jeito.

**Pensei assim:**
- Preciso criar diferentes tipos de transporte (terrestre, aéreo, marítimo)
- Cada um calcula a tarifa de forma diferente
- Mas quero tratar todos do mesmo jeito no código

**O Factory Method me ajuda:**
>>Centraliza a criação dos objetos num lugar só  
>>Se amanhã surgir um transporte novo (tipo ferroviário), é só adicionar na factory  
>>Meu código principal não fica cheio de `if` e `switch`  
>>Consigo usar herança e polimorfismo direitinho  

**Por que não os outros patterns:**
- **Strategy**: É mais para quando você quer trocar algoritmos em tempo de execução
- **Abstract Factory**: Seria exagero pra um problema simples como esse
- **Singleton**: Não faz sentido aqui, preciso de várias instâncias

Resumindo: Factory Method foi o mais natural pra criar objetos diferentes que seguem a mesma interface!