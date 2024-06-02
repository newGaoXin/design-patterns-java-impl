package heaver.state;

/**
 * tcp 状态
 *
 * @author newgaoxin
 * @date 2024/6/2 13:53
 */
public abstract class TCPStatus {

    protected TCPConnection tcpConnection;

    public TCPStatus(final TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    public abstract void oepn();

    public abstract void close();

    public abstract void send();
}
