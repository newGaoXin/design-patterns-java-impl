观察者模式

“定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。”

参与者

·Subject（目标）

—目标知道它的观察者。可以有任意多个观察者观察同一个目标。

—提供注册和删除观察者对象的接口。

·Observer（观察者）

—为那些在目标发生改变时需要获得通知的对象定义一个更新接口。

·ConcreteSubject（具体目标）

—将有关状态存入各ConcreteObserver对象。

—当它的状态发生改变时，向其各个观察者发出通知。

·ConcreteObserver（具体观察者）

—维护一个指向ConcreteSubject对象的引用。

—存储有关状态，这些状态应与目标的状态保持一致。

—实现Observer的更新接口，以使自身状态与目标的状态保持一致。”

摘录来自
设计模式：可复用面向对象软件的基础（典藏版）
埃里克·伽玛(Erich Gamma)
此材料可能受版权保护。

demo 代码中

目标 [Subject.java](Subject.java)

观察者 [Observer.java](Observer.java)

具体目标 [ClockTimer.java](ClockTimer.java)

具体观察者 [LogClock.java](LogClock.java)




