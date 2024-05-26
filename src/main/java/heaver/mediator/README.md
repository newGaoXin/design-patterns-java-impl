中介者模式

“用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。”

参与者

· Mediator（中介者，如DialogDirector）

—中介者定义一个接口用于与各同事（Colleague）对象通信。

· ConcreteMediator（具体中介者，如FontDialogDirector）

—具体中介者通过协调各同事对象实现协作行为。

—了解并维护它的各个同事。

· Colleagueclass（同事类，如ListBox、EntryField）

—每一个同事类都知道它的中介者对象。

—每一个同事对象在需要与其他同事通信的时候，与它的中介者通信。”

