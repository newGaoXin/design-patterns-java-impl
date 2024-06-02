状态模式

“允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。”

参与者

·Context（环境，如TCPConnection）

—定义客户感兴趣的接口。

—维护一个ConcreteState子类的实例，这个实例定义当前状态。

·State（状态，如TCPState）

—定义一个接口以封装与Context的一个特定状态相关的行为。

·ConcreteStatesubclasses（具体状态子类，如TCPEstablished、TCPListen、TCPClosed）

—每一子类实现一个与Context的一个状态相关的行为。

摘录来自
设计模式：可复用面向对象软件的基础（典藏版）
埃里克·伽玛(Erich Gamma)
此材料可能受版权保护。

demo 代码中

环境 [TCPConnection.java](TCPConnection.java)

状态 [TCPStatus.java](TCPStatus.java)

具体状态子类 [TCPClosedStatus.java](TCPClosedStatus.java) or [TCPOpenStatus.java](TCPOpenStatus.java)
or [TCPSendStatus.java](TCPSendStatus.java)



