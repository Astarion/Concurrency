import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by 14Malgavka on 10.02.2017.
 */
public class Client {
    public static void main(String[] args)  throws IOException {
        Socket socket = new Socket("localhost", 1500);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("Hello my dear friend!");

    }
}
