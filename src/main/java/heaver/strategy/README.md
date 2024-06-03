策略模式

“定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。”

参与者

·Strategy（策略，如Compositor）

—定义所有支持的算法的公共接口。Context使用这个接口来调用某ConcreteStrategy定义的算法。

·ConcreteStrategy（具体策略，如SimpleCompositor、TeXCompositor、ArrayCompositor）

—以Strategy接口实现某具体算法。

·Context（上下文，如Composition）

—用一个ConcreteStrategy对象来配置。

—维护一个对Strategy对象的引用。

—可定义一个接口来让Strategy访问它的数据。

摘录来自
设计模式：可复用面向对象软件的基础（典藏版）
埃里克·伽玛(Erich Gamma)
此材料可能受版权保护。

demo 代码中

策略 [Strategy.java](Strategy.java)

具体策略 [SimpleStrategy.java](SimpleStrategy.java) or [TeXStrategy.java](TeXStrategy.java)

上下文 [Context.java](Context.java)



