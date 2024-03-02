计算机和立体声组合音响这样的设备经常被组装成部分－整体层次结构或者是容器层次结构。例如，底盘可包含驱动装置和平面板，总线含有多个插件，机柜包括底盘、总线等。这种结构可以很自然地用Composite模式进行模拟。

[Equipment.java](Equipment.java) : 设备抽象类

[CompositeEquipment.java](CompositeEquipment.java) : 组合设备抽象类

[Bus.java](Bus.java) : 总线 extend CompositeEquipment

[Cabinet.java](Cabinet.java) : 柜 extend CompositeEquipment

[Card.java](Card.java) : 卡片 extend CompositeEquipment

[Chassis.java](Chassis.java) : 底盘 extend CompositeEquipment

[FloppyDIsk.java](FloppyDIsk.java) : 磁盘 extend Equipment

通过组合设备，计算价格

摘录来自
设计模式：可复用面向对象软件的基础（典藏版）
埃里克·伽玛(Erich Gamma)
此材料可能受版权保护。