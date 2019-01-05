package motan;

import com.weibo.api.motan.rpc.ResponseFuture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注意，如果提示找不到helloServiceAsync，需要编译两次
 * 客户端以springmvc启动
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan-client.xml");
        motan.HelloServiceAsync service = (motan.HelloServiceAsync) applicationContext.getBean("helloService");
        // async call
        ResponseFuture future = service.helloAsync("motan async ");
        System.out.println(future.getValue());
        System.out.println(service.hello("rongzhongyu"));
    }
}
