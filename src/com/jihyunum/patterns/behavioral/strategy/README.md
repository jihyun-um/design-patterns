## Strategy
- Intent: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
- Also known as "Policy".
- Use Strategy pattern when:
    - many related classes differ only in their behavior. Strategies provide a way to configure a class with one of many behaviors.
    - you need different variants of an algorithm. For example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms.
    - an algorithm uses data that clients shouldn't know about. U se the Strategy pattern to avoid exposing complex, algorithm-specif ic data structures.
    - a class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own Strategy class.

## General Structure
![](strategy_structure.png)

## Example
In my example the participants are represented as following:
- Strategy: [CaseStrategy](./strategies/CaseStrategy.java)
- Concrete Strategy: [CamelCaseStrategy](./strategies/CamelCaseStrategy.java), [PascalCaseStrategy](./strategies/PascalCaseStrategy.java), [SnakeCaseStrategy](./strategies/SnakeCaseStrategy.java)
- Context: [AutoFormatter](./formatter/AutoFormatter.java)

## Pros/Cons
Pros ❤️
- Families of related algorithms - Hierarchies of Strategy classes define a family of algorithms or behaviors for contexts to reuse. Inheritance can help factor out common functionality of the algorithms.
- An alternative to subclassing - Encapsulating the algorithm in separate Strategy classes lets you vary the algorithm independently of its context, making it easier to switch, understand, and extend.
- Open/Closed Principle - You can introduce new strategies without having to change the context.
- You can swap algorithms used inside an object at runtime.

Cons 💔
- Clients must be aware of different Strategies - Clients might be exposed to implementation issues.Therefore you should use the Strategy pattern only when the variation in behavior is relevant to clients.
- Increased number of objects - If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.