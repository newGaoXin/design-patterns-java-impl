package heaver.iterator;

/**
 * 雇员对象
 *
 * @author newgaoxin
 * @date 2024/5/25 20:03
 */
public class Employee {

    private Long id;

    private String name;

    public Employee(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
