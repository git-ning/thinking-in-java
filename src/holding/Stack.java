package holding;

import java.util.LinkedList;

/**
 * @author ning
 * @create 2018-06-08 10:21
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v) {storage.addFirst(v);}
    // 提供栈顶元素，但并不将其从栈顶删除
    public T peek() {return storage.getFirst();}
    // 移除并返回栈顶元素
    public T pop() {return storage.removeFirst();}
    public boolean empty() {return storage.isEmpty();}
    public String toString() {return storage.toString();}
}
