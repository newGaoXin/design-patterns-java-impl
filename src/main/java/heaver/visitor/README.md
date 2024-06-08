访问者模式

“表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。”

参与者

·Visitor（访问者，如NodeVisitor）

—为该对象结构中ConcreteElement的每一个类声明一个Visit操作。该操作的名字和特征标识了发送Visit请求给该访问者的类。这使得访问者可以确定正被访问元素的具体的类。这样访问者就可以通过该元素的特定接口直接访问它。
·ConcreteVisitor（具体访问者，如TypeCheckingVisitor）

—实现每个由Visitor声明的操作。每个操作实现本算法的一部分，而该算法片段是对应于结构中对象的类。ConcreteVisitor为该算法提供了上下文并存储它的局部状态。这一状态常常在遍历该结构的过程中累积结果。

·Element（元素，如Node）

—定义一个Accept操作，它以一个访问者为参数。

·ConcreteElement（具体元素，如AssignmentNode、VariableRefNode）

—实现Accept操作，该操作以一个访问者为参数。

·ObjectStructure（对象结构，如Program）

—能枚举它的元素。

—可以提供一个高层的接口以允许该访问者访问它的元素。

—可以是一个组合（参见Composite（4.3））或是一个集合，如一个列表或一个无序集合。”

摘录来自
设计模式：可复用面向对象软件的基础（典藏版）
埃里克·伽玛(Erich Gamma)
此材料可能受版权保护。

demo 代码中

访问者 [Visitor.java](Visitor.java)

具体访问者 [PrintVisitor.java](PrintVisitor.java)

元素 [Node.java](Node.java)

具体元素 [VariableRefNode.java](VariableRefNode.java) or [AssignmentNode.java](AssignmentNode.java)






