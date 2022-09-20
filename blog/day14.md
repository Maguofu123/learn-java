## day14
***注解***

四种元注解
1. `@Target`注解可以用在哪些地方
2. `@Retention`注解在哪些地方还有效 Runtime > class > source
3. `@Documented`是否将我们的注解生成在JAVAdoc中
4. `@Inherited`子类可以继承父类的注解

注解的参数：参数类型 + 参数名（）

***反射***
- 从实例里获得类信息
- 实体类：pojo,entity
- 一个类在内存中只有一个class对象
- 类被加载后，整个类结构被封装在class中

Class本身也是一个类
