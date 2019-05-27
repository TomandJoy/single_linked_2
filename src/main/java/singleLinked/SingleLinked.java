package singleLinked;

public interface SingleLinked {
    //头插法
    void addFirst(int data);
    //尾插法
    void addLast(int data);
    //任意位置插入，第一个数据节点为0号下标
    boolean addIndex(int index,int data);
    //查找是否包含关键字key,是否在单链表中
    boolean contains(int key);
    //删除第一次出现关键字为key的结点
    int remove(int key);
    //删除所有值为key的结点
    void removeAll(int key);
    //得到单链表的长度
    int getLength();
    //打印单链表
    void display();
    //清空单链表
    void clear();
}
