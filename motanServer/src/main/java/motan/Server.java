package motan;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务器端以springboot启动
 */
@SpringBootApplication
public class Server {
    public static void main(String[] args) {
//        new ClassPathXmlApplicationContext("classpath:motan-server.xml");
        SpringApplication.run(Server.class,args);
        MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
        System.out.println("Server start ...");
    }
}