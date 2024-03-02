package structrual.composite;

/**
 * main 方法
 *
 * @author newgaoxin
 * @date 2024/3/1 22:10
 */
public class Main {

    public static void main(String[] args) {
        final Cabinet cabinet = new Cabinet("PC Cabinet");
        final Chassis chassis = new Chassis("PC Chassis");
        cabinet.add(chassis);

        final Bus macBus = new Bus("Mac Bus");
        macBus.add(new Card("16mbs token Ring"));
        chassis.add(macBus);

        System.out.println("count :" + chassis.netPrice());
    }
}
