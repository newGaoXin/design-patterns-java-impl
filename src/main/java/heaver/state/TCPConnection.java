package heaver.state;

/**
 * todo
 *
 * @author newgaoxin
 * @date 2024/6/2 13:43
 */
public class TCPConnection {

    private TCPStatus status;

    public TCPConnection() {
        this.status = new TCPClosedStatus(this);
    }

    public void oepn() {
        status.oepn();
    }

    public void close() {
        status.close();
    }

    public void send() {
        status.send();
    }

    public void changeStatus(TCPStatus tcpStatus) {
        this.status = tcpStatus;
    }
}
