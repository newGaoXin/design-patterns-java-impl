package heaver.state;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/2 14:48
 */
public class TCPSendStatus extends TCPStatus {
    public TCPSendStatus(final TCPConnection tcpConnection) {
        super(tcpConnection);
    }

    @Override
    public void oepn() {
        super.tcpConnection.changeStatus(new TCPOpenStatus(tcpConnection));
        super.tcpConnection.oepn();
    }

    @Override
    public void close() {
        super.tcpConnection.changeStatus(new TCPClosedStatus(tcpConnection));
        super.tcpConnection.close();
    }

    @Override
    public void send() {
        System.out.println("tcp connection send");
    }
}
