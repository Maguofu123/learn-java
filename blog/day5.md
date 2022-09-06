## day5
### 数组
数组声明与创建
`int[] nums;`

堆，栈，方法区 

静态初始化
`int[] a = {1, 2, 3}`

动态初始化
`int[] a = new int[10]`

默认初始化
数组被分配空间后则被隐式初始化

![image](https://user-images.githubusercontent.com/91414286/188530994-da2b5a2c-63e8-480a-bc99-b5a8156b68df.png)

*特点*
1. 数组一旦被创建大小无法改变
2. 类型相同
3. 元素可以是任何数据类型，包括基本类型和引用类型
4. 数组变量属于引用类型

数组本身就是对象，数组对象保存在堆中

二维数组，多维数组使用

*arrays类*
`fill`, `sort`, `equals`, `binarySearch`

**冒泡排序**
两层循环遍历
时间复杂度O(n2)
外层a.length-1,内层a.length-1-i
比较相邻两数字大小，判断交换

**稀疏数组**
*压缩*
根据![image](https://user-images.githubusercontent.com/91414286/188551027-e59bc67a-0f37-4044-9aae-c1fe27bd53e2.png)


*存放*
使用一个数组存放压缩后的数组

*还原*
打印出存放在数组里的数组
