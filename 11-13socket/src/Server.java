import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 1. 创建 Server 的 Socket
        //    内部会进行本地 ip + port 的绑定
        try (DatagramSocket socket = new DatagramSocket(9939)) {
            // 2. 开门迎客，通过循环，处理业务
            while (true) {
                System.out.println("服务器正在监听");
                // 3. 处理一个要求
                action(socket);

            }
        }
    }

    /**
     * 处理要求
     * @param socket
     */
    private static void action(DatagramSocket socket) throws IOException {
        // 1. 读取客户端发来的请求
        // 1.1 准备一个字节数组，用来一会存放要读到的数据
        byte[] receiveBuffer = new byte[8192];
        // 1.2 把 buffer 封装成 datagram
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, 0, 8192);
        // 1.3 读取请求
        socket.receive(receivePacket);
        // 1.4 从 receive 中返回，就意味着，有人给我发送请求了

        // 需要将 byte[] 中的数据进行 字符集解码 -> String
        String request = new String(receiveBuffer, 0, receivePacket.getLength(), "UTF-8");
        System.out.printf("收到的请求是 %s %n", request);

        // 2. 进行服务 —— 根据请求，处理业务，并生成响应
        String response = request;

        // 3. 发送响应回去
        byte[] sendBuffer = response.getBytes("UTF-8");
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer, 0, sendBuffer.length,
                receivePacket.getAddress(),
                receivePacket.getPort()
        );
        socket.send(sendPacket);
    }
}
