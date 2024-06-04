模板方法模式

“定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。TemplateMethod使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。”

参与者

·AbstractClass（抽象类，如Application）

—定义抽象的原语操作（primitive operation），具体的子类将重定义它们以实现一个算法的各步骤。

—实现一个模板方法，定义一个算法的骨架。该模板方法不仅调用原语操作，也调用定义在AbstractClass或其他对象中的操作。

·ConcreteClass（具体类，如MyApplication）

—实现原语操作以完成算法中与特定子类相关的步骤。

摘录来自
设计模式：可复用面向对象软件的基础（典藏版）
埃里克·伽玛(Erich Gamma)
此材料可能受版权保护。

Demo 中

抽象类 [View.java](View.java)

具体类 [TextView.java](TextView.java)
