package motan;

import com.weibo.api.motan.config.springsupport.annotation.MotanService;

@MotanService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String world) {
        return "xixixi " + world;
    }
}
