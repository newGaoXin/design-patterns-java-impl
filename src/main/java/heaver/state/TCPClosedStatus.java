package heaver.state;

/**
 * tcp 关闭状态
 *
 * @author newgaoxin
 * @date 2024/6/2 14:19
 */
public class TCPClosedStatus extends TCPStatus {


    public TCPClosedStatus(final TCPConnection tcpConnection) {
        super(tcpConnection);
    }

    @Override
    public void oepn() {
        super.tcpConnection.changeStatus(new TCPOpenStatus(tcpConnection));
        super.tcpConnection.oepn();
    }

    @Override
    public void close() {
        System.out.println("top connection close ... ");
    }

    @Override
    public void send() {
        super.tcpConnection.send();
    }
}
