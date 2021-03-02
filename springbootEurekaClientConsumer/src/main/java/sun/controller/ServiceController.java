package sun.controller;

import common.entity.RestfulResult;
import common.utils.CommonUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController // 重要，如果用Controller会404
@RequestMapping(value = "service")
public class ServiceController {
    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      String name) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            restfulResult.setData("Service1:Welcome " + name + "!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommonUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "rest")
    public String rest(String name){
        return "Service1:Welcome " + name+ " !";
    }

}
