package motan;

import com.weibo.api.motan.transport.async.MotanAsync;

@MotanAsync
public interface HelloService {
    String hello(String world);
}
