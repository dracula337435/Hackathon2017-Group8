package org.dracula.ht2017g8.portal.controller;

import org.dracula.ht2017g8.portal.vo.TestVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public TestVO test(){
        TestVO vo = new TestVO();
        vo.setA(12);
        vo.setB("hello");
        return vo;
    }

}
