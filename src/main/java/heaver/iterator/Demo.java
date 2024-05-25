package heaver.iterator;

/**
 * 迭代器 设计模式 demo
 *
 * @author newgaoxin
 * @date 2024/5/25 19:43
 */
public class Demo {

    public static void main(String[] args) {
//        final List<Employee> list = new List<>(10);
//        list.add(new Employee(1L, "xxx"));
//        list.add(new Employee(1L, "yyy"));
//        final Iterator<Employee> iterator = new ListIterator<>(list);
//        PrintEmployees.print(iterator);


        final List<Employee> list = new List<>(10);
        list.add(new Employee(1L, "xxx"));
        list.add(new Employee(1L, "yyy"));
        final Iterator<Employee> iterator = list.iterator();
        PrintEmployees.print(iterator);
    }
}
