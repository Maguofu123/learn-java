## day16
Class类是所有类的类

- `c1.getFields()` 获得public属性
- 获得指定属性Filed fields =c1.getField(参数)
- `c1.getDeclaredFields()` 获得所有属性

**动态创建对象**
- 通过构造器创建对象 `newInstance()`
- getConstructor, 获得构造器
- getMethod, invoke通过反射获得一个方法
- getField, 获取属性

setAccessible(true)开启权限

**性能分析**
- 反射性能比不适用反射性能降低几十倍

**通过泛型获得注解**
