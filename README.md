# Interface Segregation Principle (ISP)

The **Interface Segregation Principle (ISP)** is one of the five SOLID principles of object-oriented design. It states:

**"Don’t force a class to implement methods it doesn’t need."**

In simpler terms:

- **Avoid big, bloated interfaces** with lots of methods.
- Instead, **create smaller, more specific interfaces** for each type of client (or class) that will use them.

### Why is it important?

Imagine you have a remote control with 100 buttons, but you only need 5 to watch TV. It would be confusing and unnecessary to deal with all those extra buttons. Similarly, in programming, when we have an interface with too many methods, classes are forced to implement methods they don’t use. This makes the code:

- **Hard to maintain**: Since you have to implement methods that aren’t needed.
- **Confusing**: Because it adds unnecessary complexity.
- **Less flexible**: Changes to the interface can affect classes that don’t even use certain methods.
### Lecture Video:
The **Interface Segregation Principle** helps solve these problems by suggesting that we split large interfaces into smaller, more focused ones. That way, each class only implements the methods it really needs, keeping the design clean and simple.

https://github.com/user-attachments/assets/0668b089-d87c-477f-a103-feb620084570
