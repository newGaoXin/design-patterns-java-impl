案例：

为一个电脑游戏创建一个迷宫—来说明它们的实现。
这个迷宫和游戏将随着各种模式不同而略有区别。有时这个游戏将仅仅是找到一个迷宫的出口—在这种情况下，游戏者可能仅能见到该迷宫的局部。有时迷宫包括一些要解决的问题和要化解的危险，并且这些游戏可能会提供已经被探索过的那部分迷宫地图。
我们将忽略迷宫中的许多细节以及一个迷宫游戏中有多少个游戏者。我们仅关注迷宫是怎样创建的。我们将一个迷宫定义为一系列房间，一个房间知道它的邻居；可能的邻居要么是另一个房间，要么是一堵墙或者是到另一个房间的一扇门。
类Room、Door 和Wall定义了我们所有的例子中用到的构件。我们仅定义这些类中对创建一个迷宫起重要作用的那部分。我们将忽略游戏者、显示操作和在迷宫中四处移动等操作，以及其他一些重要的却与创建迷宫无关的功能。

[default](game)：最简单的实现方式（硬编码）

[abstractfactory](abstractfactory)：抽象工厂模式实现

[builder](builder)：生成器实现

[factory-method](fatorymethod)：工厂方法

[prototype](prototype)：原型模式实现

[singleton](singleton)：单例模式实现
