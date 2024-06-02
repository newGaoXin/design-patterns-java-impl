package heaver.state;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/2 14:45
 */
public class TCPOpenStatus extends TCPStatus {

    public TCPOpenStatus(final TCPConnection tcpConnection) {
        super(tcpConnection);
    }

    @Override
    public void oepn() {
        System.out.println("tcp connection open ... ");
    }

    @Override
    public void close() {
        super.tcpConnection.changeStatus(new TCPClosedStatus(tcpConnection));
        super.tcpConnection.close();
    }

    @Override
    public void send() {
        super.tcpConnection.changeStatus(new TCPSendStatus(tcpConnection));
        super.tcpConnection.send();
    }
}
