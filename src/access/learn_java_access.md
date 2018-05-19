## 6.1 包：库单元

- Java可运行程序是一组可以打包并压缩为一个Java文档文件（`JAR`）的`.class`文件。Java解释器负责这些文件的查找、装载和解释

- `package`语句必须是Java文件中除注释以外的第一句程序代码。在文件开始处写
`package access;`

- **冲突**可以使用单个类导入的形式来防止冲突，只要你在同一个程序中没有使用冲突的名字

- 无论何时创建包，都已经在给定包的名称的时候隐含的指定了目录结构。

## 6.2 Java访问权限修饰词

### 6.2.1 包访问权限

- 默认访问权限没有任何关键字，但通常是指包访问权限
这就意味着当前包中的所有其他类，对那个成员都有访问权限，但对于这个包之外的所有类，这个成员却是`private`

- 类控制着哪些代码有权访问自己的成员

### 6.2.2 public（接口访问权限）

- `public`之后紧跟的成员声明自己对每个人都是可用的

- **默认包**Java将位于同一个目录下，且没有设定任何包名称的类，自动看做隶属于该目录下的默认包之中，于是他们为该目录中所有的其他文件都提供了包访问权限

### 6.2.3 private（你无法访问）

- `private`除了包含该成员的类之外，其他任何类无法访问这个成员

### 6.2.4 procted（继承访问权限）

- `procted`处理的事继承的概念

- 如果创建了一个新包，并自另一个包中继承类，那么唯一可以访问的成员就是源包中的`public`成员

- `procted`也提供包访问去权限，相同包内的其他类可以访问`procted`元素

## 6.3 接口和实现

## 6.4 类的访问权限

- 如果希望某个类可以为某个客户端程序员所用，就可以通过关键字`public`作用于整个类的定义来达到目的
  - 每个编译单元（文件）都只能有一个`public`类
  - `public`类的名称必须与该编译单元的文件名称相匹配，包括大小写

- 类即不可以是`private`也不可以是`procted`
