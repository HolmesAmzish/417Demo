package cn.arorms.demo.controller;

import cn.arorms.demo.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/Hello")
    public Map<String ,Object> Hello(Integer id , String name) {
        Map<String ,Object> map = new HashMap<String,Object>();
        Person s = new Person();
        s.setId(id);
        s.setName(name);
        map.put("code",1);
        map.put("obj",s);
        return map;
    }
}


