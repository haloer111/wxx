package rebue.wxx.access.token.server;

import java.io.IOException;

import org.junit.Test;

import rebue.wheel.OkhttpUtils;

public class AccessTokenServerApplicationTests {

//    private final static String _hostUrl = "http://127.0.0.1:9000";
    private final static String _hostUrl = "http://127.0.0.1:53836";

    @Test
    public void test01() throws IOException {
        final String url = _hostUrl + "/wxx/access/token";
        OkhttpUtils.post(url);
    }

}
