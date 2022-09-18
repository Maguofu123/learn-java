## day12
线程的退出和创建

*线程终止*
设置一个控制变量

![image](https://user-images.githubusercontent.com/91414286/190900679-957131c0-ff07-4e37-bd06-ea6f3d2a2bab.png)

*终端线程*
终端线程并不是终止
interrput 中断
yield 线程的礼让，不一定成功
join 线程插队，等待该线程执行完毕后再执行其他线程

用户线程和守护线程
- 用户线程也称为工作线程
- 守护线程是当工作线程结束后，守护线程也随之结束 `setDaemon(true)`

线程生命状态
6种状态
实际7种状态，runnable状态可以分为ready和running
