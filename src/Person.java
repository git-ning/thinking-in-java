public class Person {
    int id;
    int age;

    Person(int n, int i) {
        id = n;
        age = i;
    }

    public static void main(String[] args) {
        Person tom = new Person(1, 25);
        /**错误提示
         * Error:(12, 23) java: 无法将类 Person中的构造器 Person应用到给定类型;
         需要: int,int
         找到: 没有参数
         原因: 实际参数列表和形式参数列表长度不同
         */
//        Person jack = new Person();

    }
}
