## 7.1 组合语法

- 只需要将对象的引用置于新类中即可

## 7.2 继承语法

- 当创建一个类是，总是在继承，除非已经明确指出要从其他类继承，否则就是在隐式的从Java的标准根类`Object`进行继承

- 继承关键字`extends`，会自动得到基类中所有的域和方法

- 为了继承一般的规则是将所有的数据成员都指定为`private`，将所有的方法指定为`public`

### 7.2.1 初始化基类

- 在构造器中调用基类的构造器来执行初始化

- Java会自动在导出类的构造器中插入对基类构造器的调用

- 构建过程是从基类**向外**扩散的，所以基类在导出类构造器可以访问它之前就已经完成了初始化

```java
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
/* Output
Art constructor
Drawing constructor
Cartoon constructor
 */
```

## 7.3 代理

- Java中并没有提供对它的直接支持。这是继承和组合之间的中庸之道，因我们将一个成员对象至于所要构造的类中，但与此同时我们在新类中暴露了该成员对象的所有方法。

