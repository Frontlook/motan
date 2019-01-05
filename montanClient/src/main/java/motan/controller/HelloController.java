package motan.controller;


import motan.HelloServiceAsync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongYu Rong
 * Date: 2018/12/5
 * Time: 22:24
 */
@RestController
public class HelloController {
    @Autowired
    HelloServiceAsync helloServiceAsync;

    @RequestMapping( value= "/hello")
    public void hello(){
        System.out.println(helloServiceAsync.hello("rongzhongyu"));
    }
}
