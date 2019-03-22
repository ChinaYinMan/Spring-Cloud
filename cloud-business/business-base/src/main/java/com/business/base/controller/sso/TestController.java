package com.business.base.controller.sso;



import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * @author mantou
 */
@Slf4j
@RestController
@RequestMapping(value = "/sso")
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> test() throws Exception{

        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "mantou666");

        return map;
    }
}
